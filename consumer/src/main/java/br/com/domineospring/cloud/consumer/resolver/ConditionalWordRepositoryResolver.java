package br.com.domineospring.cloud.consumer.resolver;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by nando on 26/05/17.
 */
public class ConditionalWordRepositoryResolver implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return metadata.isAnnotated("FeignClient");
    }
}
