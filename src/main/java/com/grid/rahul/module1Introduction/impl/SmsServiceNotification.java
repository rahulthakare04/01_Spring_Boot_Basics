package com.grid.rahul.module1Introduction.impl;

import com.grid.rahul.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsnotif")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")

public class SmsServiceNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("sms sending "+message);
    }
}
