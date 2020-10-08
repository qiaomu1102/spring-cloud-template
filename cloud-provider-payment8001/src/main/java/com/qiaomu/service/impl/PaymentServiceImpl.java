package com.qiaomu.service.impl;

import com.qiaomu.dao.PaymentDao;
import com.qiaomu.entities.Payment;
import com.qiaomu.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: kexiong
 * @date: 2020/10/8 17:50
 * @Description: TODO
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}
