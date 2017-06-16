package br.com.domineospring.cloud.consumer.infra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nando on 25/05/17.
 */
@Configuration
public class RegistredServices {

    @Value("${all-services-ids}")
    private String services;

    @Bean(name = "services")
    public List<String> getServices() {
        return Arrays.asList(services.split(","));
    }
}
