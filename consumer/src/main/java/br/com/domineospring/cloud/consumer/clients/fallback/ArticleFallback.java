package br.com.domineospring.cloud.consumer.clients.fallback;

import br.com.domineospring.cloud.consumer.clients.ArticleClient;
import org.springframework.stereotype.Component;

/**
 * Created by nando on 26/05/17.
 */
@Component
public class ArticleFallback implements ArticleClient {
    @Override
    public String getWord() {
        return "ARTICLE";
    }
}
