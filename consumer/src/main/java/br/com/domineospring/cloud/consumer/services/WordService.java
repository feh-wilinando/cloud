package br.com.domineospring.cloud.consumer.services;

import br.com.domineospring.cloud.consumer.clients.WordServicesClient;
import br.com.domineospring.cloud.consumer.domains.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by nando on 26/05/17.
 */
@Service
public class WordService {

    private final Predicate<WordServicesClient> isntFallback = client -> !client
                                                                            .getClass()
                                                                                .getSimpleName().endsWith("Fallback");

    private final Function<WordServicesClient, Word> toWord = client -> new Word(client.getWord(), client.getServiceName());

    private Function<WordServicesClient, Observable<Word>> toObservable = client -> Observable
                                                                                        .fromCallable(() -> toWord.apply(client));


    private List<Observable<Word>>clients;

    @Autowired
    public WordService(List<WordServicesClient> clients, Executor executor) {

        this.clients = clients.stream()
                            .filter(isntFallback)
                                .peek(w -> System.out.println(w.getClass().getSimpleName()) )
                                    .map(toObservable)
                                        .map(observable -> observable.subscribeOn(Schedulers.from(executor)))
                                            .collect(Collectors.toList());
    }


    public List<Observable<Word>> getClients() {
        return clients;
    }
}
