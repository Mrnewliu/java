package com.heima.bean;

import java.lang.reflect.Constructor;

import java.lang.reflect.Method;

public class Demo5_Method {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * class.getMethods
		 * */
		
		Class clazz = Class.forName("com.heima.bean.Person");
		
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person)c.newInstance("����",12);
		
		//��ȡeat����
		Method m = clazz.getMethod("eat");
		m.invoke(p);
		
		//��ȡ�вεķ���
		Method m2 = clazz.getMethod("eat", int.class);
		m2.invoke(p, 10);
		
		
		
	}

}
