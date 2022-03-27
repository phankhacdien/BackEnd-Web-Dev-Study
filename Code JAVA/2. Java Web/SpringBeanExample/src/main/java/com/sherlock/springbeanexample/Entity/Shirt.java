package com.sherlock.springbeanexample.Entity;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("Shirt")
@Scope("prototype")
@Primary
public class Shirt implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wearing shirt");
    }
}
