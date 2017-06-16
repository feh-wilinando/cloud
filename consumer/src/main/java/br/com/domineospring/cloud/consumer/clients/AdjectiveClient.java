package br.com.domineospring.cloud.consumer.clients;

import br.com.domineospring.cloud.consumer.clients.fallback.AdjectiveFallback;
import br.com.domineospring.cloud.consumer.domains.ServiceNameOrder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.Order;

/**
 * Created by nando on 25/05/17.
 */
@FeignClient(value = "${adjective-id}", fallback = AdjectiveFallback.class)
@Order(4)
public interface AdjectiveClient extends WordServicesClient {
    @Override
    default ServiceNameOrder getServiceName(){
        return ServiceNameOrder.adjective;
    }
}
