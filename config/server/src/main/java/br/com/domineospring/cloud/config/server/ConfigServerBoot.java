package br.com.domineospring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by nando on 23/05/17.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerBoot {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBoot.class, args);
    }
}
