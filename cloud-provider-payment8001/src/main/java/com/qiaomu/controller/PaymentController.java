package com.qiaomu.controller;

import com.alibaba.fastjson.JSON;
import com.qiaomu.common.CommonResult;
import com.qiaomu.entities.Payment;
import com.qiaomu.entities.TestDTO;
import com.qiaomu.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: kexiong
 * @date: 2020/10/8 17:51
 * @Description: TODO
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult test(@RequestBody TestDTO testDTO){
        log.info(JSON.toJSONString(testDTO));
        return new CommonResult(200,"插入数据库成功",null);
    }

    @PostMapping(value = "/payment/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result>0){  //成功
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }
    }
}
