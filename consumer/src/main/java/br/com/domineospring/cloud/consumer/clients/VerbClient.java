package br.com.domineospring.cloud.consumer.clients;

import br.com.domineospring.cloud.consumer.clients.fallback.VerbFallback;
import br.com.domineospring.cloud.consumer.domains.ServiceNameOrder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.Order;

/**
 * Created by nando on 25/05/17.
 */
@FeignClient(value = "${verbs-id}", fallback = VerbFallback.class)
@Order(2)
public interface VerbClient extends WordServicesClient {

    @Override
    default ServiceNameOrder getServiceName() {
        return ServiceNameOrder.verb;
    }

}
