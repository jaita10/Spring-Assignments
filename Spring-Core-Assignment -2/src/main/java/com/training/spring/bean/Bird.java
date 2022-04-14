package com.training.spring.bean;

public class Bird extends Animal{
	
	private String breed;
	
	public Bird() {}

	public Bird(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public String getAnimalDetails() {
		// TODO Auto-generated method stub
		return "Bird : " + this.getName() + " is " + this.getAge() + " years old , breed " + this.breed;
	}

}
