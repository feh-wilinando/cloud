package br.com.domineospring.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by nando on 28/05/17.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayBoot {

    public static void main(String[] args) {
        SpringApplication.run(GatewayBoot.class, args);
    }
}
