package br.com.domineospring.cloud.consumer.clients.fallback;

import br.com.domineospring.cloud.consumer.clients.SubjectClient;
import org.springframework.stereotype.Component;

/**
 * Created by nando on 26/05/17.
 */
@Component
public class SubjectFallback implements SubjectClient {
    @Override
    public String getWord() {
        return "SUBJECT";
    }
}
