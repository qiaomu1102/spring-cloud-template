package com.qiaomu.dao;

import com.qiaomu.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: kexiong
 * @date: 2020/10/8 17:42
 * @Description: TODO
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
