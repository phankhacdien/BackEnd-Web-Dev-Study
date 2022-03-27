package com.sherlock.springbeanexample.Controller;

import com.sherlock.springbeanexample.Entity.Outfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Man {
    @Autowired
    private Outfit outfit;

    public Man() {
    }

    public Man(Outfit outfit) {
        this.outfit = outfit;
    }

//    public Man(@Qualifier("Coat") Outfit outfit) {
//        this.outfit = outfit;
//    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
