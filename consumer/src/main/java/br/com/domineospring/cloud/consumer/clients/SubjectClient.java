package br.com.domineospring.cloud.consumer.clients;

import br.com.domineospring.cloud.consumer.clients.fallback.SubjectFallback;
import br.com.domineospring.cloud.consumer.domains.ServiceNameOrder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.Order;

/**
 * Created by nando on 25/05/17.
 */
@FeignClient(value = "${subject-id}", fallback = SubjectFallback.class)
@Order(1)
public interface SubjectClient extends WordServicesClient {

    @Override
    default ServiceNameOrder getServiceName(){
        return ServiceNameOrder.subject;
    }
}
