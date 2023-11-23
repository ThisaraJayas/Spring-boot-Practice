package com.Thisara.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InvestorService {
@Autowired
    EligibilityService es;c
    String Register(String name, float registerAmount){

        boolean result = es.isEligible(registerAmount);

        if(result){
            return "Hi "+name+" Welcome";
        }else {
            return "Try again "+name;
        }

    }
}
