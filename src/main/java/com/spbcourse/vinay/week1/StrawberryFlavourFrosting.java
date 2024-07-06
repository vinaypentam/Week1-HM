package com.spbcourse.vinay.week1;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Frost.flavour", havingValue = "Strawberry")

public class StrawberryFlavourFrosting implements Frosting{

    @Override
    public String getFrostingType(){
        return "Strawberry flavour frosting";
    }
}
