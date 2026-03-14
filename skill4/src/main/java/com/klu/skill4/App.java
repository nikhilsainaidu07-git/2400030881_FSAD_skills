package com.klu.skill4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static ApplicationContext context;

	public static void main(String[] args) {

        System.out.println("Hello World!");

        context = new ClassPathXmlApplicationContext("springbeans.xml");

        // First Bean
        Student st1 = (Student) context.getBean("student");
        st1.setRegisterNo(101);
        st1.setName("Kiran");
        st1.displayInfo();

        // Second Bean
        Student st2 = (Student) context.getBean("student1");
        st2.displayInfo();
    }
}
