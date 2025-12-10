package com.tca;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.dao.StudentDao;
import com.tca.dao.StudentDaoImpl;
import com.tca.entities.Student;
import com.tca.service.StudentService;
import com.tca.service.StudentServiceImpl;
import com.tca.util.LoggerAdvice;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
    
       Student student = new Student();
       student.setId(1);
       student.setName("Akash");
       
       StudentService studentService = (StudentService) context.getBean("studentService");
       studentService.addStudent(student);
       
       
       // This happens Behind the scenes
       
       // first the StudentDao is created (because target needs it, DI)
       StudentDao studentDao = new StudentDaoImpl();
       
       // Then target is created, with setting it's properties
       StudentServiceImpl target = new StudentServiceImpl();
       target.setStudentDao(studentDao);
       
       // Then ProxyFactoryBean is created
       ProxyFactoryBean factory = new ProxyFactoryBean();
       factory.setTarget(target);  // original object (setting target property)
       factory.setProxyInterfaces(new Class[]{StudentService.class}); // setting proxy interfaces
       //factory.setInterceptorNames(args);
       factory.addAdvice(new LoggerAdvice());  // and wrapping another methods in proxy, like logger, security, transaction etc.. 
    
       StudentService s = (StudentService)factory.getObject();
       s.addStudent(student);
       
    }
}
