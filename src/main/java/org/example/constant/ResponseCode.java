package org.example.constant;

/**
 * @author suncen
 * @classname ResponseCode
 * @description
 * @date 2018/11/8 13:25
 */
public interface ResponseCode {

    String STR_OK = "200";
    int OK = 200;
    int FAILED = 201;

    /** 客户端请求的语法错误，服务器无法理解 */
    int BAD_REQUEST = 400;
    int UNAUTHORIZED = 401;
    int FORBIDDEN = 403;
    int NOT_FOUND = 404;
    /** 服务器无法满足Expect的请求头信息 */
    int EXPECTATION_FAILED = 417;
    /** 微服务不可用 */
    int MICRO_SERVICE_UNAVAILABLE = 478;
    /** 验证码错误 */
    int VALID_CODE_FAILED  = 479;
    /** License失效 */
    int VALID_LICENSE_FAILED  = 480;


    int SERVER_ERROR = 500;
    int BAD_GATEWAY = 502;
    int SERVICE_UNAVAILABLE = 503;
}
