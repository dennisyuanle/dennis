package org.example.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.example.entity.UserVo;
import org.example.constant.CommonConstant;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.UserVo;

/**
 * 登陆用户信息
 * 
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionUser extends UserVo {

    public static final SessionUser DEFAULT = new SessionUser();

    static {
//        DEFAULT.setId(CommonConstant.LONG_NULL);
//        DEFAULT.setUsername("anonymous");
//        DEFAULT.setName("匿名用户");
//        DEFAULT.setTenantId(CommonConstant.DEFAULT_TENANT_ID);

        DEFAULT.setId(999L);
        DEFAULT.setUsername("anonymous");
        DEFAULT.setName("周星星");
        DEFAULT.setTenantId(CommonConstant.DEFAULT_TENANT_ID);
        DEFAULT.setMobile("18515580581");
        DEFAULT.setIdCard("320982198712058149");
        DEFAULT.setAddress("addres-saaaaaaaaaaaaa");
        DEFAULT.setGender('1');
        DEFAULT.setJgId("0");
    }

    private String rcToken; //rocketChat登录token
}
