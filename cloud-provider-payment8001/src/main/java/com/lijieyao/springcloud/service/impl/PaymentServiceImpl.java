package com.lijieyao.springcloud.service.impl;

import com.lijieyao.springcloud.dao.PaymentMapper;
import com.lijieyao.springcloud.entity.Payment;
import com.lijieyao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author : LiJieYao
 * @className : PaymentServiceImpl
 * @description : 订单服务服务实现层
 * @date: 2020-09-26 21:34
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public int creatPaymentInfo(Payment payment) {
        if (Objects.isNull(payment)) {
            throw new RuntimeException("参数不能为空!!");
        }
        return paymentMapper.creat(payment);
    }

    @Override
    public Payment getPaymentInfoById(Long id) {
        if (Objects.isNull(id)) {
            throw new RuntimeException("订单id不能为空!!");
        }
        return paymentMapper.getPaymentById(id);
    }
}
