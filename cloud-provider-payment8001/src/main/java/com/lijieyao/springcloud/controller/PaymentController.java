package com.lijieyao.springcloud.controller;

import com.lijieyao.springcloud.entity.Payment;
import com.lijieyao.springcloud.pojo.base.CommonResult;
import com.lijieyao.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lijieyao
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/test")
    public String test() {
        return "hellow!";
    }

    @PostMapping("/creat")
    public CommonResult<Integer> creat(@RequestBody Payment payment) {
        int result = paymentService.creatPaymentInfo(payment);
        return new CommonResult<>(200, "", result);
    }

    @PostMapping("/get/{id}")
    public CommonResult<Payment> getPaymentInfo(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentInfoById(id);
        int a = 123 / 2;
        return new CommonResult<>(200, "", result);
    }
}
