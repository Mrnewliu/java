package com.heima.bean;

import java.lang.reflect.Constructor;


public class test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.out.println("Hello");
		Person person = new Person();
		System.out.print(person);*/
		
		Class c =  Class.forName("com.heima.bean.Person");
		//Person p = (Person)c.newInstance();
		
		//System.out.println(p);
		Constructor t = c.getConstructor(String.class,int.class);
		
		Person p = (Person)t.newInstance("sad",123);
		System.out.println(p);
		
		
		
	}

}
