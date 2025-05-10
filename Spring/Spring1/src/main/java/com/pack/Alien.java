package com.pack;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	
	private Computer com;
	
//	private laptop lap;
	
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		//System.out.println("Setter method called");
		this.age = age;
	}

	public Alien() {
		//System.out.println("Object Created");
	}


	public Computer getCom() {
		return com;
	}


	public void setCom(Computer com) {
		this.com = com;
	}
	
	
	public void Code() {
		System.out.println("Coding");
		com.Compile();
	}
	
	
	
//	
//	// Constructor injector
//	
//	@ConstructorProperties({"age","lap"}) // it helps to values correctly even the seq is wrong in beans.xml
//	public Alien(int age, Computer lap) {
//		System.out.println("Para-Constructor");
//		this.age = age;
//		this.lap = lap;
//	}

}
