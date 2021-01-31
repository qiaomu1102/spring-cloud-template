package com.qiaomu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: kexiong
 * @date: 2020/12/27 17:22
 * @Description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order83 {
    public static void main(String[] str) {
        SpringApplication.run(Order83.class, str);
    }
}
