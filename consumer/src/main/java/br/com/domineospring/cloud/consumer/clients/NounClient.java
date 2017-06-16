package br.com.domineospring.cloud.consumer.clients;

import br.com.domineospring.cloud.consumer.clients.fallback.NounFallback;
import br.com.domineospring.cloud.consumer.domains.ServiceNameOrder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.Order;

/**
 * Created by nando on 25/05/17.
 */
@FeignClient(value = "${noun-id}", fallback = NounFallback.class)
@Order(5)
public interface NounClient extends WordServicesClient {
    @Override
    default ServiceNameOrder getServiceName(){
        return ServiceNameOrder.noun;
    }
}
