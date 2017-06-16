package br.com.domineospring.cloud.consumer.clients;

import br.com.domineospring.cloud.consumer.domains.ServiceNameOrder;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by nando on 26/05/17.
 */
public interface WordServicesClient {

    @GetMapping("/")
    String getWord();

    ServiceNameOrder getServiceName();

}
