package com.klu.skill5;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
 
 public Laptop()
 {
  System.out.println("Inside laptop constructor");
 }
 
 public void compile()
 {
  System.out.println("Compiled successfully.");
 }
 
 

}
