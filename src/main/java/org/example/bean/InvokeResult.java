package org.example.bean;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.example.constant.CommonConstant;
import org.example.constant.PlatformErrorConstants;
import org.example.constant.ResponseCode;
import org.example.util.UUIDUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;

import java.io.Serializable;

/**
 * ClassName: InvokeResult
 * <pre>
 * Function: TODO
 * </pre>
 *
 * @author sunc
 * @Date 2017年5月12日 下午2:41:44
 */
@Data
@ApiModel("response返回结果")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvokeResult<T> implements Serializable, Cloneable {

    /**
     *
     */
    private static final long serialVersionUID = 8986315780790151349L;

    @ApiModelProperty("请求id,用于日志查找")
    private String requestId;

    @ApiModelProperty("返回状态")
    private int status = ResponseCode.OK;


    private String code;

    @ApiModelProperty("返回消息")
    private String msg = "";

    @ApiModelProperty("返回数据结果")
    private T data;

    @ApiModelProperty("错误信息")
    private String error = "";

    public InvokeResult() {
        if (StringUtils.isNotBlank(MDC.get(CommonConstant.REQUEST_ID_KEY))){
            requestId =MDC.get(CommonConstant.REQUEST_ID_KEY);
        }else {
            requestId ="reqId-" + UUIDUtil.generateUUID(true, true);
            MDC.put(CommonConstant.REQUEST_ID_KEY,requestId);
        }
    }

    public InvokeResult(T data) {
        this();
        this.data = data;
    }

    public InvokeResult(int status, String msg) {
        this();
        this.status = status;
        this.msg = msg;
    }

    public InvokeResult(int status, String msg, String error) {
        this();
        this.status = status;
        this.msg = msg;
        this.error = error;
    }

    public InvokeResult(int status, String msg, String error, String code) {
        this();
        this.status = status;
        this.msg = msg;
        this.error = error;
        this.code = code;
    }

    public static InvokeResult SUCESS(String msg) {
        return new InvokeResult(PlatformErrorConstants.SUCCESS.getStatus(), msg);
    }

    public static <T> InvokeResult SUCESS(T data) {
        InvokeResult obj = new InvokeResult();
        obj.setData(data);
        obj.setStatus(PlatformErrorConstants.SUCCESS.getStatus());
        obj.setCode(PlatformErrorConstants.SUCCESS.getCode());
        obj.setMsg(PlatformErrorConstants.SUCCESS.getMessage());
        return obj;
    }

}
