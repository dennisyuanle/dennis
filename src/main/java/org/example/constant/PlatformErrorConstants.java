package org.example.constant;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sola
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PlatformErrorConstants implements BasicErrorConstants{
    //输入参数不完整
    SUCCESS(2000,"SUCCESS","返回成功"),
    NO_AUTH(4001,"SUCCESS","返回成功"),
    INVALID_PARAMETER(2004,"INVALID_PARAMETER", "参数校验未通过"),
    MISSING_PARAMETER(2005,"MISSING_PARAMETER", "参数缺失(header,requestParam,pathParam,cookie)"),
    INVALID_METHOD_OR_PATH(2006,"INVALID_METHOD_OR_PATH","无效的请求方法或请求路径"),
    NO_DATA_FOUND(2007,"NO_DATA_FOUND","未查询到数据"),
    OTHER(2999,"YQS_OTHER_ERROR", "未知异常");


    private Integer status;
    private String code;
    private String message;

    private static final Map<String, PlatformErrorConstants> MAP = new HashMap<>();

    static {
        for (PlatformErrorConstants item : PlatformErrorConstants.values()) {
            MAP.put(item.message, item);
        }
    }




    @Override
    public String toString() {
        return "YqsErrorCode ----> " + getCode() + "    SecurityErrorCode ----> " + getMessage();
    }

}
