package net.jdevel.springripperpart1.config;

import net.jdevel.springripperpart1.quoters.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Bean
    public BeanPostProcessor getInjectRandomIntPostProcessor() {
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }

    @Bean
    public BeanPostProcessor getProfilingHandlerBeanPostProcessor() throws Exception {
        return new ProfilingHandlerBeanPostProcessor();
    }

    @Bean
    public ApplicationListener<ContextRefreshedEvent> getPostProxyInvokerContextListener() {
        return new PostProxyInvokerContextListener();
    }

    @Bean
    public Quoter getQuoter() {
        TerminatorQuoter quoter = new TerminatorQuoter();
        quoter.setMessage("i'll be back!!!");
        return quoter;
    }


}
