package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.entities.Student;
import com.tca.service.StudentService;

public class App {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
    
       Student student = new Student();
       student.setId(1);
       student.setName("Akash");
       
       StudentService studentService = (StudentService) context.getBean("studentService");
       studentService.addStudent(student);
    }
}
