package com.qiaomu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: kexiong
 * @date: 2020/12/27 17:03
 * @Description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9001 {

    public static void main(String[] str) {
        SpringApplication.run(Payment9001.class, str);
    }
}
