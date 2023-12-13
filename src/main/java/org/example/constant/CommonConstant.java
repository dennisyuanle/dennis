package org.example.constant;

import java.math.BigDecimal;

/**
 * @author suncen
 * @classname CommonConstant
 * @description
 * @date 2018/10/26 17:58
 */
public interface CommonConstant {

    /**
     * 顺序初始值
     */
    int SEQUENCE_START = 0;

    String PROP_SYS_DEPARTMENT_ID = "sysDepartmentId";
    String COL_DEFAULT_VALUE = "-1";

    String DEFAULT_SAAS_CODE = "super";
    long DEFAULT_TENANT_ID = 1l;

    String STRING_ZERO = "0";
    String STRING_TWO = "2";
    String STRING_NULL = "NULL";
    String STRING_TRUE = "true";
    String STRING_FALSE = "false";
    String STRING_TRUE_1 = "1";
    String STRING_FALSE_0 = "0";

    String DB_N = "(n)";
    String DB_P = "(p";
    String DB_S = ",s)";
    String DB_P_S = "(p,s)";
    String DB_P_S_V = "(ps)";

    /**
     * 系统默认值
     */
    byte TRUE = 1;
    byte FALSE = 0;
    int YES = 1;
    int NO = 0;
    int MATH_1 = 1;
    int MATH_2 = 2;
    double MATH_100 = 100.00;
    String YES_STR = "yes";
    String NO_STR = "no";
    String YES_CH = "是";
    String NO_CH = "否";
    String USER_ENABLED_TRUE = "1";
    String USER_ENABLED_FALSE = "0";

    String PARAM_SESSION_USER_ID = "sessionUserId";
    String PARAM_SESSION_DEPT_ID = "sessionDeptId";
    String PARAM_DEPT_IDS = "deptIds";

    BigDecimal BD_ZERO = new BigDecimal(0);
    BigDecimal BD_ONE = new BigDecimal(1);
    BigDecimal BD_HUNDRED = new BigDecimal(100);

    /**
     * 查询条件：无
     */
    long LONG_NULL = -1l;

    /**
     * JSON 资源
     */
    String CONTENT_TYPE = "application/json; charset=utf-8";

    /**
     * 路由信息Redis保存的key
     */
    String ROUTE_KEY = "_ROUTE_KEY";

    /**
     * Token sign key
     */
    String SIGN_KEY = "SYPF_KEY";

    /**
     * 标志是自定义日志
     */
    String LOGBACK_FLAG = "SYPF_LOG";

    /**
     * 编码格式
     */
    String UTF8 = "utf-8";
    String GBK = "gbk";

    /**
     * 系统管理员id
     */
    String ADMIN_ID = "1";

    /**
     * reqId请求头
     */
    String REQUEST_ID_KEY = "requestId";

    interface CachePrefix {
        String DICTIONARY = "dictionary:"; //字典缓存
        String API = "api:"; //接口定义缓存
        String PERM_API = "perm_api:"; //路由访问权限缓存
        String SESSION_USER = "session_user:"; //session用户
        String HOLIDAY = "holiday:"; //节假日
        String SAAS = "saas:"; //站点
        String DATA_ACCESS = "data_access:"; //数据权限缓存
        String SMS_CODE = "sms_code:";// 短信验证码 session key
        String SMS_CODE_CHECK_OLD_MOBILE = "sms_code_check_old_mobile:";
        String SMS_CODE_CHECK_NEW_MOBILE = "sms_code_check_new_mobile:";
        String SMS_CODE_SENDCOUNT = "sms_code_sendcount:"; // 短信验证码发送的次数前缀
        String AssistanceCode = "AssistanceCode_";//家属端协助码缓存前缀
    }

    //系统编码前缀
    interface CodePrefix {
        String NOTICE = "GG"; //公告
        String FORM = "BD"; //表单
        String SUPERVISION = "JG"; //监管
        String CHART = "TB";//图表
        String NAME = "U";//用户名
    }

    //登录接口调用类型
    interface GrantType {
        String PASSWORD = "password"; //用户名/邮箱/手机密码登录
        String REFRESH_TOKEN = "refresh_token"; //刷新token
        String CUSTOM_MOBILE_PWD = "custom_mobile_pwd"; //手机密码登录
        String CUSTOM_MOBILE_SMS = "custom_mobile_sms"; //手机验证码登录
    }

    interface Url {
        String OAUTH_TOKEN = "/oauth/token"; //登录url
    }

    interface RoleId {
        long SUPER_ADMIN = 1l; //超级管理员
        long FAMILY_ADMIN = 2l; //家属端管理员
        long FAMILY_APP = 3l; //家属用户
        long SUPERMARKET_ADMIN = 4l; //商超中心管理员
        long LAWYER_ADMIN = 5l; //律师端管理员
        long LAWYER_APP = 6l; //律师用户
        long MARKETING_ADMIN = 7L;//营销端管理员
        long MARKETING_GROUP_LEADER = 8L;//营销中心管理员（营销组长）
    }

    interface ParamType {
        String HEADER = "header"; //请求参数的获取：@RequestHeader(代码中接收注解)
        String QUERY = "query"; //请求参数的获取：@RequestParam(代码中接收注解)
        String PATH = "path"; //用于restful接口）-->请求参数的获取：@PathVariable(代码中接收注解)
        String BODY = "body"; //请求参数的获取：@RequestBody(代码中接收注解)
        String FORM = "form";
    }

    interface HttpMethodType {
        String POST = "POST"; //请求参数的获取：@RequestHeader(代码中接收注解)
        String GET = "GET"; //请求参数的获取：@RequestParam(代码中接收注解)
        String DELETE = "DELETE"; //用于restful接口）-->请求参数的获取：@PathVariable(代码中接收注解)
        String PUT = "PUT"; //请求参数的获取：@RequestBody(代码中接收注解)
        String PATCH = "PATCH";
    }

    //短信模板类型
    interface TemplateType {
        String LOGIN = "1";
        String REGISTER = "2";
        String FORGET_PWD = "3";
        String TRANSFER_BANK_ARRIVED = "4";
        String TRANSFER_PRISONER_ARRIVED = "5";
        String WARN_MSG = "6";
        String LEGAL_ADVICE_ACCEPT_NOTICE = "7";
        String RECEIVE_CHAT_MESSAGE_MARKETING_APP = "8";
        String BROADCASTING_FOR_OPENING_TRANSFER = "9";
        String CHECK_OLD_MOBILE = "11";
        String CHECK_NEW_MOBILE = "12";
    }

    interface LogType {
        String SUZHOU_FACE_RECOGNITION = "99";
        String TRANSFER_RESULT = "98";
    }

    /**
     * 渠道（第三方来源）
     * */
    interface Origin {
        Integer OWN = 1;
        Integer MICROPOLICE = 2;
    }

    /**
     * 终端
     * */
    interface Terminal {
        Integer H5 = 1;
        Integer ANDROID = 2;
        Integer IOS = 3;
        Integer WECHAT_H5 = 4;
        Integer APPLETS = 5;
    }
}

