package org.example.anno;

import org.example.bean.Cat;
import org.example.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoConfigApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
        System.out.println(ctx.getBean(Person.class));
        System.out.println(ctx.getBean(Cat.class));
    }
}
