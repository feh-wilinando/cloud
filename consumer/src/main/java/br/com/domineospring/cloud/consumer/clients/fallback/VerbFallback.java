package br.com.domineospring.cloud.consumer.clients.fallback;

import br.com.domineospring.cloud.consumer.clients.VerbClient;
import org.springframework.stereotype.Component;

/**
 * Created by nando on 26/05/17.
 */
@Component
public class VerbFallback implements VerbClient {
    @Override
    public String getWord() {
        return "VERB";
    }
}
