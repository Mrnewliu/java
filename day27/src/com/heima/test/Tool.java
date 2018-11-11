package com.heima.test;

import java.lang.reflect.Field;

public class Tool
{

	/**
	 * @param args
	 * @throws Exception 
	 * @throws SecurityException 
	 */
	
	// TODO Auto-generated method stub
	public void setProperty(Object obj,String propertyName, Object value) throws SecurityException, Exception
	{
		
		Class clazz = obj.getClass();
		Field f = clazz.getDeclaredField(propertyName);
		f.setAccessible(true);
		f.set(obj, value);
													
	}
	
	public static void main(String[] args) throws Exception
	{
		Student s = new Student("ÕÅÈý", 23);
		System.out.println(s);
		
		Tool t =  new Tool();
		t.setProperty(s, "name", "dsfds");
		System.out.println(s);
		
		
	}
	
									
}

class Student
{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	

	
}

