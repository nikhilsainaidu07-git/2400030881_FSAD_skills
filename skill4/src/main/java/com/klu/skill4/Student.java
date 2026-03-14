package com.klu.skill4;

public class Student {

    private int registerNo;
    private String name;

    public Student() {
        System.out.println("Inside Student Default Constructor");
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Student Details");
        System.out.println("Register No: " + registerNo);
        System.out.println("Name: " + name);
    }
}
