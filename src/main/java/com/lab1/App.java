package com.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//Person person = new Person();
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/beans/beans.xml");
		
		Person person = (Person) context.getBean("personBean");
		person.sayHello();
		System.out.println(person);
		
		}
}
