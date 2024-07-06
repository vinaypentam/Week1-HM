package com.spbcourse.vinay.week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Syrup.flavour", havingValue = "Choco")
public class ChocoFlavouredSyrup implements Syrup{

    @Override
    public String getSyrupType(){
        return "Choco Flavoured Syrup";
    }

}
