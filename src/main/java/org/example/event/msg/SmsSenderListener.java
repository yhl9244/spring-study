package org.example.event.msg;

import org.example.event.msg.RegisterSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SmsSenderListener implements ApplicationListener<RegisterSuccessEvent> {
    
    @Override
    public void onApplicationEvent(RegisterSuccessEvent event) {
        System.out.println("监听到用户注册成功，发送短信。。。");
    }
}