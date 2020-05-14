package com.one.service.impl;

import com.one.entity.Customer;
import com.one.mapper.CustomerMapper;
import com.one.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
