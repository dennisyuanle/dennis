package org.example.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author suncen
 * @classname RoleVo
 * @description
 * @date 2018/10/12 12:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("角色对象Vo")
public class RoleVo implements Serializable, Cloneable {

    /**
     * 角色ID
     */
    private Long id;

    /**
     * 角色名称
     */
    @ApiModelProperty("角色名称")
    private String name;

    /**
     * 领域
     */
    @ApiModelProperty("领域")
    private Integer scope;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private Long tenantId;
}
