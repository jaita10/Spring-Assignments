package com.training.spring;

public class Animal {
	
	private String name;
	
	private int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAnimalDetails() {
		// TODO Auto-generated method stub
		return this.name + " who is "+ this.age +" years old";
	}
	

}
