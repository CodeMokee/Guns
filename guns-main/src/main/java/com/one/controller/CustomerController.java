package com.one.controller;


import cn.stylefeng.roses.core.base.controller.BaseController;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.one.entity.Customer;
import com.one.service.ICustomerService;
import org.apache.poi.ss.usermodel.IgnoredErrorType;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/one/customer")
public class CustomerController extends BaseController {

    @AutoConfigureOrder
    ICustomerService customerService;

    @RequestMapping("/get/{id}")
    public Customer getById(@PathVariable(name = "id") Integer id) {
        return customerService.getById(1);
    }


}

