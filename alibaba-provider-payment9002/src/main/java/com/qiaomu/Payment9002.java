package com.qiaomu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: kexiong
 * @date: 2020/12/27 17:17
 * @Description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002 {
    public static void main(String[] str) {
        SpringApplication.run(Payment9002.class);
    }
}
