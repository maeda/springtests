package com.example.beans.conditional;

import org.springframework.stereotype.Component;

/**
 * A good example about how to use the condition is @Profile annotation. That profile have a @Conditional annotation
 * that point to ProfileCondition class where have the logic to decide bean creation by profile.
 *
 * @see org.springframework.context.annotation.Profile
 * @see org.springframework.context.annotation.ProfileCondition
 */
@Component
public class ConditionalExampleBean {

    public String sayHello() {
        return "Hello";
    }

}
