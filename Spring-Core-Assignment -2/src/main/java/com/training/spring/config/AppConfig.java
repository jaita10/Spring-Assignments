package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.bean.Animal;
import com.training.spring.bean.Bird;
import com.training.spring.bean.Dog;
import com.training.spring.bean.Person;

@Configuration
public class AppConfig {
	
	@Bean("person1")
	public Person getPerson() {
		Person p = new Person();
		p.setFirstName("Peter");
		p.setLastName("Parker");
		p.setAge(12);
		return p;
		
	}
	
	@Bean("bird1")
	public Bird getBird() {
		Bird b = new Bird();
		b.setName("Titu");
		b.setAge(3);
		b.setBreed("Parrot");
		return b;
		
	}
	
	@Bean("dog1")
	public Dog getDog() {
		Dog d = new Dog();
		d.setName("Alpha");
		d.setAge(3);
		d.setBreed("Beagle");
		return d;
		
	}
	
	@Bean("animal")
	public Animal getAnimal() {
		Animal a = new Animal();
		a.setName("Leo");
		a.setAge(5);
		return a;
		
	}
}
