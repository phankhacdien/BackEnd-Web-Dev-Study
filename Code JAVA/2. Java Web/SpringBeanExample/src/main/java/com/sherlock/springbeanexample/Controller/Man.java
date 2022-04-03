package com.sherlock.springbeanexample.Controller;

import com.sherlock.springbeanexample.Entity.Outfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class Man {
//    @Autowired
//    @Qualifier("Coat")
    private Outfit outfit;

//    public Man(Outfit outfit) {
//        this.outfit = outfit;
//    }
//    @Autowired
    public Man( Outfit outfit) {
        this.outfit = outfit;
    }

    public Man() {
    }

    public Outfit getOutfit() {
        return outfit;
    }

    @Autowired
    public void setOutfit(@Qualifier("Shirt") Outfit outfit) {
        this.outfit = outfit;
    }
}