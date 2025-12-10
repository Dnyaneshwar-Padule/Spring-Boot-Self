package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.entities.Student;

public class App {
    public static void main(String[] args) {
    	ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
    	
    	Student s = (Student)context.getBean("student");
    	
    	System.out.println("Name : " + s.getName());
    	System.out.println("City : " + s.getAddress().getCity());
    	
    }
}
