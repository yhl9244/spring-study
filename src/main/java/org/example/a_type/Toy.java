package org.example.a_type;

import lombok.ToString;

@ToString
public abstract class Toy {

    private String name;

    public Toy(String name) {
        System.out.println("生产了一个" + name);
        this.name = name;
    }
}
