package br.com.domineospring.cloud.consumer.controller;

import br.com.domineospring.cloud.consumer.services.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nando on 25/05/17.
 */
@RestController
@Profile("feign")
public class SentenceControllerFeign implements SentenceController {

    @Autowired
    private SentenceService service;


    @GetMapping("/sentence")
    public String getSentence(){
        return service.getSentence();
    }
}
