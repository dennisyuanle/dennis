package org.example.util;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Cleanup;
import org.example.bean.InvokeResult;
import org.example.constant.ResponseCode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @param obj
     * @return
     * @throws Exception
     * @Title: beanToJson
     * @Description: 对象转JsonString
     */
    public static String beanToJson(Object obj) {
        if (obj == null) {
            return null;
        }
        String json = null;
        try {


            json = objectMapper.writeValueAsString(obj);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return json;
    }

    /**
     * @param json
     * @param clazz
     * @return
     * @throws Exception
     * @Title: jsonToBean
     * @Description:JsonString 转 对象
     */
    public static <T> T jsonToBean(String json, Class<T> clazz) {
        T obj = null;
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            obj = objectMapper.readValue(json, clazz);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return obj;
    }

    /**
     * @param json
     * @param clazz
     * @return
     * @throws Exception
     * @Title: jsonToBean
     * @Description:JsonString 转 对象
     */
    public static <T> List<T> jsonToList(String json, Class<T> clazz) {
        List<T> obj = null;
        try {
            obj = objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return obj;
    }


    static ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally

    {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public static String formatObject(Object object) {
        try {
            @Cleanup
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            mapper.writeValue(out, object);
            return out.toString("UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T parse(String string, Class<T> t) {
        try {
            return mapper.readValue(string, t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, Object> parse(String string) {
        try {
            return mapper.readValue(string, new TypeReference<Map<String, Object>>() {});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Parse a string to Object .
     *
     * @param string
     * @param typeReference
     * @return
     */
    public static <T> T parse(String string, TypeReference<T> typeReference) {
        try {
            return mapper.readValue(string, typeReference);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonNode readTree(String content) {
        try {
            return mapper.readTree(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @method getErrorJson
     * @description 封装异常返回结果
     * @param error
     * @return com.alibaba.fastjson.JSONObject
     * @auther suncen
     * @date 2019/11/21 16:21
     */
    public static JSONObject generateErrorResult(String error) {
        JSONObject obj = new JSONObject();
        obj.put("status", ResponseCode.SERVER_ERROR);
        obj.put("msg", error);
        return obj;
    }

    public static void main(String[] args) {
        String s = "{\n" +
                "  \"data\": {\n" +
                "    \"authToken\": \"in sed deserunt\",\n" +
                "    \"userId\": \"quis \"\n" +
                "  },\n" +
                "  \"error\": \"deserunt\",\n" +
                "  \"msg\": \"tempor amet dolore sit non\",\n" +
                "  \"requestId\": \"voluptate reprehenderit pariatur\",\n" +
                "  \"status\": 62371276\n" +
                "}";
        InvokeResult res = parse(s, InvokeResult.class);
        System.out.println();
    }
}
