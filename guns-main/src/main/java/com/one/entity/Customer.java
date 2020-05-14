package com.one.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 客户表
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("customer")
public class Customer implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("invitationCode")
    private String invitationCode;

    @TableField("inviterCode")
    private String inviterCode;

    @TableField("integrals")
    private Integer integrals;

    @TableField("inviter")
    private Integer inviter;

    @TableField("phoneNum")
    private String phoneNum;

    @TableField("createdAt")
    private LocalDateTime createdAt;

    @TableField("modifiedAt")
    private Integer modifiedAt;


}
