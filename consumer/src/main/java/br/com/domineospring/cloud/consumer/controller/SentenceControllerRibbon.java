package br.com.domineospring.cloud.consumer.controller;

import br.com.domineospring.cloud.consumer.helper.InstanceHandlerHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nando on 25/05/17.
 */
@RestController
@Profile("ribbon")
public class SentenceControllerRibbon implements SentenceController{

    @Autowired
    private InstanceHandlerHelper handler;

    @Autowired
    private LoadBalancerClient client;

    @Autowired @Qualifier("services")
    private List<String> services;

    @GetMapping("/sentence")
    public String getSentence(){
        return services.stream()
                .map(client::choose)
                .map(handler::consume)
                .collect(Collectors.joining(" "));
    }





}
