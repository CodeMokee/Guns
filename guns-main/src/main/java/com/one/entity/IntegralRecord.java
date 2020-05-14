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
 * 积分变化记录表
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("integral_record")
public class IntegralRecord implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("customer")
    private Integer customer;

    @TableField("delta")
    private Integer delta;

    @TableField("ClientIp")
    private String clientIp;

    @TableField("createdAt")
    private LocalDateTime createdAt;


}
