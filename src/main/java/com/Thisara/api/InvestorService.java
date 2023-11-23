package com.Thisara.api;

public class InvestorService {
    String Register(String name, float registerAmount){
        EligibilityService es = new EligibilityService();
        boolean result = es.isEligible(registerAmount);

        if(result){
            return "Hi "+name+" Welcome";
        }else {
            return "Try again "+name;
        }

    }
}
