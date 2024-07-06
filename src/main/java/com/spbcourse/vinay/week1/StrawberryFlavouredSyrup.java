package com.spbcourse.vinay.week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Syrup.flavour", havingValue = "Strawberry")
public class StrawberryFlavouredSyrup implements Syrup{

    @Override
    public String getSyrupType(){
        return "Strawberry Flavoured Syrup";
    }

}
