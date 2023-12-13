package org.example.constant;

/**
 * @author suncen
 * @classname RegularExpression
 * @description
 * @date 2019/3/1 13:34
 */
public interface RegularExpression {

    //允许数字
    String EXP_NUM = "^[0-9]*$";

    //允许大小写字母和数字
    String EXP_ENG_NUM = "^[A-Za-z0-9]+$";

    //允许大小写字母、数字和“-”
    String EXP_ENG_NUM_0 = "^[A-Za-z0-9\\-]+$";

    //允许大小写字母、数字和“_”
    String EXP_ENG_NUM_1 = "^[A-Za-z0-9_]+$";

    //允许大小写字母、数字、“-”、“_”
    String EXP_ENG_NUM_2 = "^[A-Za-z0-9_\\-]+$";

    //允许大小写字母、数字、“_”、“-”和“.”
    String EXP_ENG_NUM_3 = "^[A-Za-z0-9_\\-\\.]+$";

    //允许大小写字母、数字、“_”、“-”、“,”、“（”、“）”
    String EXP_ENG_NUM_4 = "^[A-Za-z0-9_\\-\\,\\(\\)]+$";

    //联系方式允许格式:13888888888、88888888或010-88888888
    String EXP_PHONE = "^(((1[0-9]{2})+\\d{8})|((\\d{3,4}-?)?\\d{7,9}))?$";

    //手机号码允许格式:13888888888
    String EXP_MOBILE = "^((1[0-9]{2})+\\d{8})?$";

    //邮箱允许格式：xxx@xx.com
    String EXP_MAIL = "^([a-zA-Z0-9.!#$%&\'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)?$";

    //图片格式，jpg和png，不区分大小写
    String IMG = "^([jJ][pP][eE][gG]|[jJ][pP][gG]|[pP][nN][gG])?$";
}
