package br.com.domineospring.cloud.consumer.helper;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by nando on 25/05/17.
 */
@Component
public class InstanceHandlerHelper {


    @Autowired
    private RestTemplate restTemplate;


    public String  consume(ServiceInstance instance){
        return getWord(instance);
    }


    public String consume(List<ServiceInstance> instances){
        ServiceInstance instance = instances
                                        .stream()
                                            .findFirst()
                                                .orElse(null);
        return getWord(instance);
    }


    @HystrixCommand(fallbackMethod = "fallback")
    private String getWord(ServiceInstance instance) {
        if (instance != null) return restTemplate.getForObject(instance.getUri(), String.class);
        return "";
    }


    public String fallback(ServiceInstance instance){
        System.out.println("FALBACK-------->" + instance.getServiceId());

        return "";
    }

}
