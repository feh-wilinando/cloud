package br.com.domineospring.cloud.consumer.clients.fallback;

import br.com.domineospring.cloud.consumer.clients.AdjectiveClient;
import org.springframework.stereotype.Component;

/**
 * Created by nando on 26/05/17.
 */
@Component
public class AdjectiveFallback implements AdjectiveClient {
    @Override
    public String getWord() {
        return "ADJECTIVE";
    }
}
