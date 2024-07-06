package com.spbcourse.vinay.week1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
    @Autowired
    private Frosting frost;
    @Autowired
    private Syrup syrup;

//    public CakeBaker(Frosting frost, Syrup syrup){
//        this.frost = frost;
//        this.syrup = syrup;
//    }
    String bakeCake(){
      return frost.getFrostingType()+" "+syrup.getSyrupType();
    }

}
