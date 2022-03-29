package org.example.event.msg;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements ApplicationEventPublisherAware {
    
    ApplicationEventPublisher publisher;
    
    public void register(String username) {
        // 用户注册的动作。。。
        System.out.println(username + "注册成功。。。");
        // 发布事件
        publisher.publishEvent(new RegisterSuccessEvent(username));
    }
    
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}