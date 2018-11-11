package com.heima.bean;

public class Person {
	String name;
	int age;
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	public void eat()
	{
		System.out.println("今天吃了一顿金钱豹");
	}
	
	public void eat(int num)
	{
		System.out.println("今天吃了"+ num +"顿金钱豹");
	}
	
	
	
}
