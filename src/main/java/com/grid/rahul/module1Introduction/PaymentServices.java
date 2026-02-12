package com.grid.rahul.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Service
//@Controller
//@Repository
public class PaymentServices {

    public void pay(){
        System.out.println("paying");
    }

    @PostConstruct
    public void afterInitaaa(){
        System.out.println("Before paying");
    }

    @PreDestroy
    public void beforeDestroyaa(){
        System.out.println("after payment is done");
    }
}
