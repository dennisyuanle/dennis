package org.example.constant;

/**
 * @author suncen
 * @classname DictionaryConstant
 * @description
 * @date 2018/12/5 9:27
 */
public interface DictionaryConstant {

    String DICT_DIR_CODE = "code";
    String DICT_DIR_NAME = "name";

    /**
     * 通用是或不是
     */
    interface Boolean {
        String CODE = "boolean";
        String NO = "0";
        String YES = "1";
    }

    /**
     * 性别
     */
    interface Gender {
        String CODE = "gender";
        Character FEMALE = '0';
        Character MALE = '1';
    }

    /**
     * 节假日类型
     */
    interface HolidayType {
        String CODE = "holiday_type";

        //节假日
        String HOLIDAY = "0";
        //休息日转工作日
        String WORKING_DAY = "1";
    }

    /**
     * 日志类型
     */
    interface LogType {
        String CODE = "log_type";

        //访问日志
        String VISIT = "0";
        //操作日志
        String OPERATE = "1";
    }

    /**
     * 触发器状态
     */
    interface TriggerState {
        String CODE = "trigger_state";

        //等待
        String WAITING = "WAITING";
        //暂停
        String PAUSED = "PAUSED";
        //执行中
        String DOING = "DOING";
    }

    /**
     * 发件状态
     */
    interface OutboxStatus {
        String CODE = "outbox_status";

        //草稿
        String DRAFT = "0";
        //已发送
        String SENT = "1";
        //已撤回
        String CANCELED = "2";
    }

    /**
     * 收件状态
     */
    interface InboxStatus {
        String CODE = "inbox_status";

        //未读
        String UNREAD = "0";
        //已读
        String READ = "1";
    }

    /**
     * 内容发布状态
     */
    interface PublishStatus {
        String CODE = "publish_status";

        //草稿
        String DRAFT = "0";
        //已发布
        String PUBLISHED = "2";
        //已撤销
        String CANCELED = "3";
    }

    /**
     * 内容发布状态
     */
    interface ContentPublishStatus {
        String CODE = "content_publish_status";

        //草稿
        String DRAFT = "0";
        //待发布
        String TO_PUBLISH = "1";
        //已发布
        String PUBLISHED = "2";
        //已撤销
        String CANCELED = "3";
    }

    /**
     * 创建状态
     */
    interface CreateStatus {
        String CODE = "create_status";

        //未创建
        String TO_CREATE = "0";
        //已创建
        String CREATED = "1";
    }

    /**
     * 内容类型
     */
    interface ContentType {
        String CODE = "content_type";

        //普通
        String NORMAL = "0";
        //图片集
        String PICTURE_SET = "1";
        //视频
        String VIDEO = "2";
        //音频
        String AUDIO = "3";
    }

    /**
     * 内容属性
     */
    interface ContentAttribute {
        String CODE = "content_attribute";

        //图片
        String PICTURE = "1";
        //视频
        String VIDEO = "2";
        //音频
        String AUDIO = "4";
        //附件
        String ATTACHMENT = "8";
        //置顶
        String TOP = "16";
        //热点
        String HOT = "32";
        //推荐
        String RECOMMENDED = "64";
    }

    /**
     * 数据权限类型
     */
    interface DataAccessType {
        String CODE = "data_access_type";

        //全部
        String ALL = "9";
        //只看自己
        String MYSELF = "0";
        //本部门
        String DEPARTMENT = "1";
        //本部门及子部门
        String DEPT_AND_SUB = "2";
        //本部门之上的层级
        String FATHER_DEPT = "3";
    }

    /**
     * 数据库类型
     */
    interface DatabaseType {
        String CODE = "database_type";

        String ORACLE = "oracle";
        String MYSQL = "mysql";
    }

    /**
     * oracle字段类型
     */
    interface OracleColumnType {
        String CODE = "oracle_column_type";

        String NVARCHAR2 = "nvarchar2(n)";
        String CHAR = "char(n)";
        String NUMBER = "number(p,s)";
        String DATE = "date";
        String TIMESTAMP = "timestamp";
        String CLOB = "clob";
        String BLOB = "blob";
    }

    /**
     * Mysql字段类型
     */
    interface MysqlColumnType {
        String CODE = "mysql_column_type";

        String VARCHAR = "varchar(n)";
        String CHAR = "char(n)";
        String TINYINT = "tinyint";
        String INT = "int";
        String BIGINT = "bigint";
        String FLOAT = "float";
        String DOUBLE = "double";
        String DATE = "date";
        String DATETIME = "datetime";
        String TEXT = "text";
        String BLOB = "blob";
    }

    /**
     * 表单类型
     */
    interface FormType {
        String CODE = "form_type";

        String LIST = "0";
        String LIST_EDIT = "1";
        String VIEW = "2";
    }

    /**
     * 监管模型中的元素类型
     */
    interface ElementType {
        String CODE = "element_type";

        String GATEWAY = "gateway";
        String MONITOR = "monitor";
        String LINE = "line";
        String TEXT = "text";
    }

    /**
     * 表单关联类型
     */
    interface FormLinkType {
        String CODE = "form_link_type";

        String NORMAL = "0"; //平铺
        String TAB = "1"; //Tab
    }

    /**
     * 属性类型
     */
    interface PropertyType {
        String CODE = "property_type";

        String STRING = "string";
        String TEXTAREA = "textarea";
        String INTEGER = "integer";
        String DOUBLE = "double";
        String DATE = "date";
        String DATETIME = "datetime";
        String BOOLEAN = "boolean";
        String SELECT = "select";
        String POPUP = "popup";
        String ATTACHMENT = "attachment";
    }

    /**
     * 水平位置
     */
    interface Align {
        String CODE = "align";

        String LEFT = "left";
        String CENTER = "center";
        String RIGHT = "right";
    }

    /**
     * 文件类型
     */
    interface DocType {
        String CODE = "doc_type";

        String PIC = "pic";
        String DOC = "doc";
        String ZIP = "zip";
        String PDF = "pdf";
    }

    /**
     * 流程操作
     */
    interface ProcessOperate {
        String CODE = "process_operate";

        String SUBMIT = "1";//提交
        String APPROVE = "2";//通过
        String RETURN = "3";//退回
        String REJECT = "4";//驳回
        String CANCEL = "5";//作废
        String REBUILD = "6";//再提交
        String SKIP = "7";//跳转
        String ASSIGN = "8";//指派
    }

    /**
     * 流程操作
     */
    interface ProcessStatus {
        String CODE = "process_status";

        String DRAFT = "0"; //草稿
        String HANDLING = "1"; //处理中
        String END = "2"; //已完成
        String CANCELED = "3"; //已作废
        String REJECTED = "4"; //已退回
    }

    /**
     * 参数类型
     */
    interface WorkflowParamType {
        String CODE = "workflow_param_type";

        String GLOBAL = "global"; //全局参数
        String LOCAL = "local"; //局部参数
        String FORM = "form"; //表单参数
    }

    /**
     * 运行状态
     */
    interface RunStatus {
        String CODE = "run_status";

        String RUNNING = "0"; //运行中
        String OVER = "1"; //已结束
    }

    /**
     * 领域，对应oauth2的领域
     */
    interface Scope {
        String CODE = "scope";

        int ADMIN = 1; //集群管理后台
        int FAMILY = 2; //家属端后台
        int FAMILY_APP = 4; //家属端前台
        int SUPERMARKET = 8; //商超后台
        int LAWYER = 16; //律师后台
        int LAWYER_APP = 32; //律师前台
        int MARKETING_CENTER_APP = 128;//营销中心

    }

    /**
     * 区域类型
     */
    interface AreaType {
        String CODE = "area_type";

        String PROVINCE = "0"; //省级
        String CITY = "1"; //地级
        String DISTRICT = "2"; //县级
        String STREET = "3"; //乡级
        String COMMUNITY = "4"; //村级
    }

    /**
     * 角色数据权限
     */
    interface RoleDp {
        String CODE = "role_dp";

        int SELF = 1; //个人
        int DEPARTMENT = 2; //本部门
        int DPT_INCLUDE_SUB = 3; //本部门和下属部门
        int WHOLE = 99; //全公司
    }

    /**
     * 客户来源
     */
    interface CustomerSource {
        String CODE = "customer_source";
    }

    /**
     * 销售阶段
     */
    interface SaleStep {
        String CODE = "sale_step";
    }

    /**
     * 客户等级
     */
    interface CustomerLevel {
        String CODE = "customer_level";
    }

    /**
     * 客户关系
     */
    interface ParentRelationship {
        String CODE = "parent_relationship";
    }

    /**
     * 年级
     */
    interface GradeCode {
        String CODE = "grade_code";
    }

    /**
     * 资源状态
     */
    interface ResStatus {
        String CODE = "res_status";
        String WFP = "1";
        String YFP = "2";
        String GJZ = "3";
        String ZF = "0";
    }

    /**
     * 跟进类型
     */
    interface FollowType {
        String CODE = "follow_type";
        String BACK = "0";
    }

    /**
     * 跟进方法
     */
    interface FollowWay {
        String CODE = "follow_way";
    }

    interface ConfirmStatus {
        String CODE = "confirm_status";
        String UNCONFIRM_STATUS = "0";
        String CONFIRM_STATUS = "1";

        String CONFIRMED = "2";
    }

    interface TenantType {
        String CODE = "tenant_type";
        String ADMIN = "admin";
        String SUPERMARKET = "supermarket";
        String LAWYER = "lawyer";
    }

    interface OrderStatus {
        String CODE = "order_status";
        String TO_SEND = "0";
        String SENT = "1";
        String CONFIRMED = "2";
    }

    interface ChildOrderStatus {
        String CODE = "child_order_status";
        String TO_SEND = "0"; //待发货
        String DISPATCH_CASE_ADD = "1"; //已加入发货车
        String DISPATCH_ORDER_ADD = "2"; //已加入发货单
        String SENT = "3"; //已发货
        String CONFIRMED = "4"; //所内已确认
        String RETURN = "5"; //退货
    }

    /*
     * 商品类型
     */
    interface GoodsType {
        String CODE = "goods_type";
        String FAMILY = "0"; //家属购物
        String PRISON = "1"; //所内购物
    }

    interface RollbackType {
        String CODE = "rollback_type";
        String SALES_RETURN = "0";
        String REFUND = "1";
        String EXCHANGE_GOODS = "2";
    }

    /*
     *订单类型
     */
    interface OrderType {
        String CODE = "order_type";
        String FAMILY = "1";//家属购物
        String PRISON = "2";//所内购物
    }

    /*
     *咨询类型
    */
    interface AdviceType {
        Integer INTERVIEW = 1;  //家属会见
        Integer ADVICE = 2; //律师咨询
        Integer DEFENSE = 3; //律师辩护
        Integer OTHER =4; //其他
    }
}
