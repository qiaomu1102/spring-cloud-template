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
@RequestMapping("/consumer")
public class OrderController {

    public static final String payment_url = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
//        log.info("/consumer/payment/create=====================");
        return restTemplate.postForObject(payment_url + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(payment_url + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/payment/test")
    public CommonResult<Payment> test() {
        return restTemplate.getForObject(payment_url + "/payment/test", CommonResult.class);
    }

}
