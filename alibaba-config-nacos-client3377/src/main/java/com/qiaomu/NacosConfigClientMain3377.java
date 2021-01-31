package com.qiaomu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: kexiong
 * @date: 2020/12/27 19:42
 * @Description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main(String[] str) {
        SpringApplication.run(NacosConfigClientMain3377.class, str);
    }
}
