package com.example.beans.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.INTERFACES)
public class PrototypeInterfaceBeanImpl implements PrototypeInterfaceBean {

    @Override
    public String id() {
        return this.getClass().getSimpleName();
    }
}
