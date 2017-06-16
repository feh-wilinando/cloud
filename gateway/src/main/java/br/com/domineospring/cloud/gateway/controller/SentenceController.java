package br.com.domineospring.cloud.gateway.controller;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by nando on 28/05/17.
 */
@Controller
@EnableZuulProxy
public class SentenceController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
