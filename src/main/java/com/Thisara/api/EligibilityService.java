package com.Thisara.api;

import org.springframework.stereotype.Component;

@Component
public class EligibilityService {
    boolean isEligible(float amount){
        return(amount>100000);
    }
}
