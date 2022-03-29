package org.example.module;

import org.example.module.vo.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("city")
public class BartenderConfiguration {
    
    @Bean
    public Bartender zhangxiaosan() {
        return new Bartender("张小三");
    }
    
    @Bean
    public Bartender zhangdasan() {
        return new Bartender("张大三");
    }
    
}