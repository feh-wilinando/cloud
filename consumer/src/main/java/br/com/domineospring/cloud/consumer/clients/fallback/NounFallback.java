package br.com.domineospring.cloud.consumer.clients.fallback;

import br.com.domineospring.cloud.consumer.clients.NounClient;
import org.springframework.stereotype.Component;

/**
 * Created by nando on 26/05/17.
 */
@Component
public class NounFallback implements NounClient {
    @Override
    public String getWord() {
        return "NOUN";
    }
}
