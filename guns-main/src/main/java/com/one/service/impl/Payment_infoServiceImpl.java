package com.one.service.impl;

import com.one.entity.PaymentInfo;
import com.one.mapper.Payment_infoMapper;
import com.one.service.IPayment_infoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账户信息表 服务实现类
 * </p>
 *
 * @author andy
 * @since 2020-05-14
 */
@Service
public class Payment_infoServiceImpl extends ServiceImpl<Payment_infoMapper, PaymentInfo> implements IPayment_infoService {

}
