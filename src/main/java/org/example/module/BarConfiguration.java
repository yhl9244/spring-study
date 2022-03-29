package org.example.module;

import org.example.module.vo.Bar;
import org.example.module.vo.Boss;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Conditional(ExistBossCondition.class)
//@ConditionalOnBean(beanNames = {"org.example.module.vo.Boss"})
public class BarConfiguration {
    
    @Bean
    @ConditionalOnBean(Boss.class)
    public Bar bbb() {
        return new Bar();
    }
    
}