package com.klu.skill5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Laptop laptop;

    public Student() {
        System.out.println("Inside Student Constructor");
    }

    @Autowired   // Setter Injection
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        laptop.compile();
    }
}
