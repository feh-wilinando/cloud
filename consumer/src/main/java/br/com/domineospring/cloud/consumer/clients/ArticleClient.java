package br.com.domineospring.cloud.consumer.clients;

import br.com.domineospring.cloud.consumer.clients.fallback.ArticleFallback;
import br.com.domineospring.cloud.consumer.domains.ServiceNameOrder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.Order;

/**
 * Created by nando on 25/05/17.
 */
@FeignClient(value = "${article-id}", fallback = ArticleFallback.class)
@Order(3)
public interface ArticleClient extends WordServicesClient {
    @Override
    default ServiceNameOrder getServiceName(){
        return ServiceNameOrder.article;
    }
}
