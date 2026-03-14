package com.klu.skill5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.klu.skill5")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        
        Student s1 = context.getBean(Student.class);
        
        Laptop l1 = context.getBean(Laptop.class);
        
        s1.build();
    }
}