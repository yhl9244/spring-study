package org.example.event.msg;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderListener {
    
    @EventListener
    public void onRegisterSuccess(RegisterSuccessEvent event) {
        System.out.println("监听到用户注册成功！发送邮件中。。。");
    }
}