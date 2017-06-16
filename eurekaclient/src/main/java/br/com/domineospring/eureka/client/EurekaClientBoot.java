package br.com.domineospring.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by nando on 24/05/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class EurekaClientBoot {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientBoot.class, args);
    }

}
