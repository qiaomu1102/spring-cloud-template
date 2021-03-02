package com.qiaomu.controller;

import com.qiaomu.common.CommonResult;
import com.qiaomu.entities.Payment;
import com.qiaomu.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: kexiong
 * @date: 2020/10/9 15:54
 * @Description: TODO
 */

@RestController
@RequestMapping(value = "/orderFeign")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {

        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/test/loadBalance")
    public CommonResult loadBalance() {

        return paymentFeignService.loadBalance();
    }

    @GetMapping(value = "/timeout")
    public String timeout() {
        return paymentFeignService.feignTimeout();
    }

}
