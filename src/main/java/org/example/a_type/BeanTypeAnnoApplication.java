package org.example.a_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTypeAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        //Toy toy = ctx.getBean(Toy.class);
        //System.out.println(toy);
        ctx.getBeansOfType(Toy.class).forEach((name, bean) -> System.out.println(name + " : " + bean));

    }
}