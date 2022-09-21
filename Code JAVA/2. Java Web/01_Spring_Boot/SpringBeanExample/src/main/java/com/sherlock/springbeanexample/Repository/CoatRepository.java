package com.sherlock.springbeanexample.Repository;

import com.sherlock.springbeanexample.Entity.Coat;
import com.sherlock.springbeanexample.Entity.Outfit;
import org.springframework.stereotype.Repository;

@Repository
public class CoatRepository implements OutfitRepository{
    @Override
    public Outfit getOutfitFromRepo() {
        return new Coat();
    }
}
