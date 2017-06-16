package br.com.domineospring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nando on 26/05/17.
 */
@RestController
@RefreshScope
public class HomeController {


    @Value("${lucky-word}") String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckWorld(){
        return "The lucky word is: " + luckyWord;
    }
}
