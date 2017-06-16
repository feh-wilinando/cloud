package br.com.domineospring.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by nando on 24/05/17.
 */
@RestController
public class WordController {

    @Value("${words}")
    private String words;
    //private String words = "icicle,refrigerator,blizzard,snowball"; //hard-coded two noun for ribbon
    private Random random = new Random();

    @GetMapping("/")
    public String getWord(){
        String[] wordArray = words.split(",");
        int randomPosition = getRandomPositionOf(wordArray);

        return wordArray[randomPosition];

    }

    private int getRandomPositionOf(String[] wordArray) {
        return random.ints(0, wordArray.length).findAny().orElse(0);
    }

}
