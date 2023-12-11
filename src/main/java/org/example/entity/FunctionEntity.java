package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@TableName("fc_function")
@ApiModel(value = "FunctionEntity对象", description = "功能信息")
public class FunctionEntity {

    @ApiModelProperty("id")
    private int id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("链接")
    private String url;

    @ApiModelProperty("icon链接")
//    @TableField("icon_url")
    private String iconUrl;

    @ApiModelProperty("创建者id")
//    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("创建时间")
//    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty("修改者id")
//    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("修改时间")
//    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty("版本")
    private String version;

    @ApiModelProperty("是否删除")
//    @TableField("del_flag")
    private Boolean delFlag;

}
