package com.Thisara.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public void test(){
        InvestorService is = new InvestorService();
        String s1 = is.Register("Thisara", 140000);
        String s2 = is.Register("Kamal", 90000);

        System.out.println(s1);
        System.out.println(s2);
    }
}
