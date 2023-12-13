package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

/**
 * @author suncen
 * @classname UserVo
 * @description
 * @date 2018/10/12 12:08
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserVo extends SimpleUserVo {

    private static final long serialVersionUID = 5932502338737505281L;

    /**
     * 所在部门ID
     */
    private List<Long> deptIds = new ArrayList<>();

    /**
     * 部门ID及子部门ID
     */
    private Set<Long> allDeptIds = new HashSet<>();

    /**
     * 权限ID集合
     */
    private List<String> permissionCodes = new ArrayList<>();

    /**
     * 用户角色ID集合
     */
    private List<RoleVo> roles = new ArrayList<>();

    /**
     * 数据权限集合
     */
    private Map<String, Integer> dpMap = new HashMap<>();
}
