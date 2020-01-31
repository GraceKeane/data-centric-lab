package com.lab1;

public class Person {
	String name;
	String surname;
		
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}

	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public void sayHello() {
		System.out.println("Hello from Person");
	}

}
