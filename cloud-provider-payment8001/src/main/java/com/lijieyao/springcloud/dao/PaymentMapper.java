package com.lijieyao.springcloud.dao;

import com.lijieyao.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
@Mapper
public interface PaymentMapper {

    /**
     * 插入一条记录
     * @param payment
     * @return
     */
    int creat(@Param("payment") Payment payment);

    /**
     * 根据id查询订单信息
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);


}
