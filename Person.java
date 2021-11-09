package com.qa.qacommunity;

public class Person {
	
	private String name;
	private int age;
	private String jobtitle;
	private double height;
	private int shoesize;
	
	public Person(String name, int age, double height, int shoesize, String jobtitle) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoesize = shoesize;
		this.jobtitle = jobtitle;
		
		
	}
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
    public void greet() {
    	System.out.println("My name is " + name + ",I'm " + age + " and " + height + "cm tall. My shoe size is " + shoesize + " and I work as a " + jobtitle);
    	
    }
}
