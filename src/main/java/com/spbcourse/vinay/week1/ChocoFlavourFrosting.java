package com.spbcourse.vinay.week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Frost.flavour", havingValue = "Choco")
public class ChocoFlavourFrosting implements Frosting{

    @Override
    public String getFrostingType(){
        return "Choco flavour frosting";
    }
}
