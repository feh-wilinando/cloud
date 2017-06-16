package br.com.domineospring.cloud.consumer.domains;

import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created by nando on 26/05/17.
 */
public class Sentence {

    private TreeMap<ServiceNameOrder, String> words = new TreeMap<>();

    public void add(Word word){
        words.put(word.getServiceName(), word.getValue());
    }

    public String getSentence(){
        return words.values().stream().collect(Collectors.joining(" "));
    }

}
