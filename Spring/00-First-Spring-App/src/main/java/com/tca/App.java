package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.service.GreetingService;

public class App {
    public static void main(String[] args) {
    	/*
    	  // Ye hai aam jindagi...
    	  
	    	GreetingServiceImpl greet = new GreetingServiceImpl();
	    	greet.setMessage("Welcome to Spring !");
	    	greet.greet();
    	 */
    
    	
    	
    	// creating bean factory
    	// bean factory will provide beans (Components)
    	/*
    		BeanFactory beanFactory = new  XmlBeanFactory(new FileInputStream("greet.xml"));
    	 */
    	/*
    	  In Spring 6.x the XmlBeanFactory is completely removed, we can use 
    	  ApplicationContext to get Beans 
    	 */
    	
    	try {    		
    		// I say it, class path - resource folder, xml - xml config file, application context
    		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("greet.xml");
    		
    		GreetingService greetingService = (GreetingService) applicationContext.getBean("greetingService");
    		greetingService.greet(); /// and it worked !!
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
}
