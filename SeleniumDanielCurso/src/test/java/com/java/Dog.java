package com.java;

public class Dog {
	
	// Identity
	String name;
	
	// States
	String breed;
	String size;
	int age;
	String color;
	boolean isTired;
	
	// Behavior

	
	public void eat() {
		System.out.println("My dog "+ this.name + " is eating");
	}
	
	public void run() {
		if(this.isTired) {
			System.out.println("My dog "+ this.name + " is tired");
		}else {
			System.out.println("My dog "+ this.name + " is running");
		}
		
	}
	
	public void sit() {
		System.out.println("My dog "+ this.name + " is sitting");
	}

}
