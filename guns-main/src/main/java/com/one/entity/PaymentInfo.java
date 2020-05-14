package com.one.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 账户信息表
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("payment_info")
public class PaymentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("customer")
    private Integer customer;

    @TableField("accountName")
    private String accountName;

    @TableField("phoneNum")
    private String phoneNum;

    @TableField("wechat")
    private String wechat;

    @TableField("alipay")
    private String alipay;


}
