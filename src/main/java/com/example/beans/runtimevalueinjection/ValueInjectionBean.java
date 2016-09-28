package com.example.beans.runtimevalueinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Operator type for Spring Expression Language
 *
 * Operators
 *
 * Arithmetic	+, -, *, /, %, ^
 * Comparison	<, lt, >, gt, ==, eq, <=, le, >=, ge
 * Logical	and, or, not, |
 * Conditional	?: (ternary), ?: (Elvis)
 * Regular expression	matches
 * <br/>
 * Example of 'matches':
 * #{admin.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com'}
 */
@Component
public class ValueInjectionBean {

    @Autowired
    private Environment env;

    @Value("${my.property}")
    private String myProperty;

    @Value("#{T(System).currentTimeMillis()}")
    private long currentTimeMillis;

    @Value("#{valueInjectionBean.currentTimeMillis}")
    private long currentTimeMillisFromSpEL;

    public Environment getEnv() {
        return env;
    }

    public String getMyProperty() {
        return myProperty;
    }

    public long getCurrentTimeMillis() {
        return currentTimeMillis;
    }

    public long getCurrentTimeMillisFromSpEL() {
        return currentTimeMillisFromSpEL;
    }

}
