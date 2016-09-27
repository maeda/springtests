package com.example;

import com.example.beans.conditional.ConditionalDisableExample;
import com.example.beans.conditional.ConditionalEnabledExample;
import com.example.beans.conditional.ConditionalExampleBean;
import com.example.beans.lifecycle.LifecycleExampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringTestsConfiguration {

    @Bean
    public LifecycleExampleBean lifecycleExampleBean() {
        return new LifecycleExampleBean();
    }

    @Bean
    @Conditional(ConditionalEnabledExample.class)
    public ConditionalExampleBean conditionalEnableExampleBean() {
        return new ConditionalExampleBean();
    }

    @Bean
    @Conditional(ConditionalDisableExample.class)
    public ConditionalExampleBean conditionalDisableExampleBean() {
        return new ConditionalExampleBean();
    }
}
