package br.com.domineospring.cloud.consumer.domains;

/**
 * Created by nando on 26/05/17.
 */
public class Word {
    private String value;
    private ServiceNameOrder serviceName;


    public Word(String value, ServiceNameOrder serviceName) {
        this.value = value;
        this.serviceName = serviceName;
    }

    public String getValue() {
        return value;
    }

    public ServiceNameOrder getServiceName() {
        return serviceName;
    }
}
