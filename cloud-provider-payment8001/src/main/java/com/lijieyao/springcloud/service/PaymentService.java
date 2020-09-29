package com.lijieyao.springcloud.service;

import com.lijieyao.springcloud.entity.Payment;

/**
 * @author : LiJieYao
 * @className : PaymentService
 * @description : 订单服务服务层
 * @date: 2020-09-26 21:32
 */
public interface PaymentService {

    /**
     * 插入一条记录
     * @param payment
     * @return
     */
    int creatPaymentInfo(Payment payment);

    /**
     * 根据id查询订单信息
     * @param id
     * @return
     */
    Payment getPaymentInfoById(Long id);
}
