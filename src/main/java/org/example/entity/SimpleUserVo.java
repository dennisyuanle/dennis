package org.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.example.constant.DictionaryConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author suncen
 * @classname SimpleUserVo
 * @description
 * @date 2019/7/15 20:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleUserVo implements Serializable, Cloneable {

    private static final long serialVersionUID = 644508096829984980L;

    public SimpleUserVo(Long id, String username, String name, String mobile) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.mobile = mobile;
    }

    /**
     * 用户ID
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * ("性别，0：女，1：男")
     */
    private Character gender = DictionaryConstant.Gender.MALE;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 用户手机
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * 职位
     */
    private String position;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * openId
     */
    private String openId;

    /**
     * 用户是否启用
     */
    private Boolean enable;

    /**
     * 用户状态
     */
    private String status;

    /**
     * 用户简介
     */
    private String summary;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 租户名称
     */
    private String tenantName;

    /**
     * 领域
     */
    private Integer scope;

    /**
     * rocketChat id
     */
    private String rcId;

    /**
     * 极光id
     */
    private String jgId;

    /**
     * 推荐码
     */
    private String referCode;
}
