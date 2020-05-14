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
 * 邀请信息表
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("invitation_info")
public class InvitationInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("owner")
    private Integer owner;

    @TableField("invited")
    private Integer invited;

    @TableField("createdAt")
    private LocalDateTime createdAt;


}
