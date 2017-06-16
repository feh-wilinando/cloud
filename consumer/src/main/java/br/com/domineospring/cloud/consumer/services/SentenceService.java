package br.com.domineospring.cloud.consumer.services;

import br.com.domineospring.cloud.consumer.domains.Sentence;
import br.com.domineospring.cloud.consumer.domains.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by nando on 25/05/17.
 */
@Service
public class SentenceService {


    @Autowired
    private WordService wordService;


    public String getSentence(){
        Sentence sentence = new Sentence();

        List<Observable<Word>> observables = wordService.getClients();

        CountDownLatch downLatch = new CountDownLatch(observables.size());


        Observable.merge(observables)
                .subscribe( word -> {
                            sentence.add(word);
                            downLatch.countDown();
                        });


        waitForAll(downLatch);

        return sentence.getSentence();

//        return wordService
//                    .getClients().stream()
//                        .map(WordServicesClient::getWord)
//                                .collect(Collectors.joining(" "));
    }

    private void waitForAll(CountDownLatch downLatch) {
        try {
            downLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
