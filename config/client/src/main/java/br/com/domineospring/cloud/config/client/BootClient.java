package br.com.domineospring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nando on 23/05/17.
 */

@SpringBootApplication
public class BootClient {

    public static void main(String[] args) {
        SpringApplication.run(BootClient.class, args);
    }
}
