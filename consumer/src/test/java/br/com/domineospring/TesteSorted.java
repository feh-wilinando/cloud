package br.com.domineospring;

import org.junit.Test;

import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created by nando on 26/05/17.
 */
public class TesteSorted {


    @Test
    public void test(){

        Sentence sentence = new Sentence();


        sentence.add(Services.noun, "e");
        sentence.add(Services.article, "c");
        sentence.add(Services.adjective, "d");
        sentence.add(Services.subject, "a");
        sentence.add(Services.verb, "b");


        System.out.println(sentence.getSentence());

    }



    class Sentence{
        TreeMap<Services, String> words = new TreeMap<>();


        public void add(Services services, String word){
            words.put(services, word);
        }

        public String getSentence(){
            return words.values().stream().collect(Collectors.joining(" "));
        }
    }

    enum Services {
        subject, verb, article, adjective, noun;
    }
}
