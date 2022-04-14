package com.training.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	@Autowired
	private Animal animal;
	
	public Person() {}

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public String getDetails() {
		return "Person : " + this.firstName + this.lastName + " is " + this.age + " years old , have a pet name " + animal.getAnimalDetails();
		
	}
	

}