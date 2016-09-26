package com.example.beans.lifecycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Spring Bean to help understand Spring Beans Lifecycle.
 * <br/>
 * <br/>
 * Lifecycle image: http://i.stack.imgur.com/kpcdR.png <br/>
 *
 */
@Component
public class LifecycleExampleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {
    @Override
    public void setBeanName(String name) {
        System.out.println(BeanNameAware.class.getSimpleName() + "#setBeanName" + " - " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(BeanFactoryAware.class.getSimpleName() + "#setBeanFactory" + " - " + beanFactory.toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(ApplicationContextAware.class.getSimpleName() + "#setApplicationContext" + " - " + applicationContext);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(BeanPostProcessor.class.getSimpleName() + "#postProcessBeforeInitialization" + " - " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(BeanPostProcessor.class.getSimpleName() + "#postProcessAfterInitialization" + " - " + bean);
        return bean;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(InitializingBean.class.getSimpleName() + "#afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(DisposableBean.class.getSimpleName() + "#destroy");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(PostConstruct.class.getSimpleName() + "#postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(PreDestroy.class.getSimpleName() + "#preDestroy");
    }
}
