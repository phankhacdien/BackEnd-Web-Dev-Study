package com.sherlock.springbeanexample.Entity;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
@Component("Shirt")
@Scope("prototype")
@Primary
public class Shirt implements Outfit{
    @PostConstruct
    public void postConstruct() {
        System.out.println("Shirt is worn");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Shirt will be destroy ");
    }

    @Override
    public void wear() {
        System.out.println("Wearing shirt");
    }
}
