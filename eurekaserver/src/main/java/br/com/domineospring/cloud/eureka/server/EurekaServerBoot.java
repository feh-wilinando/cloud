package br.com.domineospring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by nando on 24/05/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerBoot {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBoot.class, args);
    }
}
