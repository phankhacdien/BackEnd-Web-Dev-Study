package com.sherlock.springbeanexample.Entity;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("Coat")
@Scope("prototype")
//@Primary
public class Coat implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wearing Coat");
    }
}
