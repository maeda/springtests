package com.example;

import com.example.beans.autowired.Cake;
import com.example.beans.autowired.Cookies;
import com.example.beans.autowired.Dessert;
import com.example.beans.autowired.IceCream;
import com.example.beans.autowired.Popsicle;
import com.example.beans.conditional.ConditionalDisableExample;
import com.example.beans.conditional.ConditionalEnabledExample;
import com.example.beans.conditional.ConditionalExampleBean;
import com.example.beans.lifecycle.LifecycleExampleBean;
import com.example.beans.scopes.PrototypeConcreteClassBean;
import com.example.beans.scopes.PrototypeInterfaceBean;
import com.example.beans.scopes.PrototypeInterfaceBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfiguration {

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

    @Bean
    @Primary
    public Dessert iceCream() {
        return new IceCream();
    }

    @Bean
    public Dessert cake() {
        return new Cake();
    }

    @Bean
    public Dessert cookies() {
        return new Cookies();
    }

    @Bean
    public Dessert popsicle() {
        return new Popsicle();
    }

    @Bean
    public PrototypeInterfaceBean prototypeInterfaceBean() {
        return new PrototypeInterfaceBeanImpl();
    }

    @Bean
    public PrototypeConcreteClassBean prototypeConcreteClassBean() {
        return new PrototypeConcreteClassBean();
    }
}