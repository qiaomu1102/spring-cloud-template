package com.qiaomu.controller;

import com.qiaomu.common.CommonResult;
import com.qiaomu.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: kexiong
 * @date: 2020/10/8 19:21
 * @Description: TODO
 */
@Slf4j
@RestController
public class OrderController {

    public static final String payment_url = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        return restTemplate.postForObject(payment_url + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(payment_url + "/payment/get/" + id, CommonResult.class);
    }

}
