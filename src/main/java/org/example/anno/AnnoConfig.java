package org.example.anno;

import org.example.bean.Cat;
import org.example.bean.Person;
import org.springframework.context.annotation.Bean;

public class AnnoConfig {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setAge(13);
        person.setName("aaaa");
        return person;
    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("test-cat-anno");
        // 直接拿上面的person()方法作为返回值即可，相当于ref
        cat.setMaster(person());
        return cat;
    }
}
