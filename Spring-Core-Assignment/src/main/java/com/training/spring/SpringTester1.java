package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester1 {
	
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		
		Person person3 = (Person)context.getBean("person3");
		
		Dog dog1 = (Dog)context.getBean("dog1");
		
		Bird bird2 = (Bird)context.getBean("bird2");
		
		System.out.println(person3.getDetails());
		
		System.out.println(dog1.getAnimalDetails());
		
		System.out.println(bird2.getAnimalDetails());

}

}
