package com.qiaomu.service;

import com.qiaomu.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: kexiong
 * @date: 2020/10/8 17:49
 * @Description: TODO
 */
public interface PaymentService {

    int create(Payment payment); //写

    Payment getPaymentById(@Param("id") Long id);  //读取
}

