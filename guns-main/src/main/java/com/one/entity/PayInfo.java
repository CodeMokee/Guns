package com.one.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 支付信息表
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pay_info")
public class PayInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer  id;

    @TableField("customer")
    private Integer customer;

    @TableField("isOpen")
    private Boolean isOpen;

    @TableField("integralsDecrease")
    private Integer integralsDecrease;

    @TableField("createdAt")
    private LocalDateTime createdAt;

    @TableField("modifiedAt")
    private LocalDateTime modifiedAt;

    @TableField("closeAt")
    private LocalDateTime closeAt;

    @TableField("closeBy")
    private Integer closeBy;


}
