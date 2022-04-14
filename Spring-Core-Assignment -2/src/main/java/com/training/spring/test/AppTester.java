package com.training.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.bean.Bird;
import com.training.spring.bean.Dog;
import com.training.spring.bean.Person;
import com.training.spring.config.AppConfig;

public class AppTester {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Bird bird1 = (Bird)context.getBean("bird1");
		
		Dog dog1 = (Dog)context.getBean("dog1");
		
		Person person1 = (Person)context.getBean("person1");
		
		System.out.println(bird1.getAnimalDetails());

		System.out.println(dog1.getAnimalDetails());
		
		System.out.println(person1.getDetails());

	}
	
}
