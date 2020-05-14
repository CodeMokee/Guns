package com.one.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 注册码
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RegisterCode implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "regCode")
    private String regCode;

    @TableField(value = "createdBy")
    private Integer createdBy;

    @TableField("createdAt")
    private LocalDateTime createdAt;

    @TableField(value = "isAvailable")
    private Boolean isAvailable;

    @TableField(value = "isDelete")
    private Boolean isDelete;

}
