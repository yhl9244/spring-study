package org.example.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedApplicationListener {

    @EventListener
    public void onApplicationEvent(ContextClosedEvent contextRefreshedEvent) {
        System.out.println("ContextClosedApplicationListener监听到ContextClosedEvent事件！");
    }
}
