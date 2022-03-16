package org.example.a_type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class BeanTypeConfiguration {

    @Bean
    public Child child() {
        return new Child();
    }
//    @Bean
//    public Toy ball() {
//        return new Ball("ball");
//    }

    @Bean
    public ToyFactoryBean toyFactoryBean() {
        ToyFactoryBean toyFactoryBean = new ToyFactoryBean();
        toyFactoryBean.setChild(child());
        return toyFactoryBean;
    }
}
