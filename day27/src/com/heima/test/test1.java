package com.heima.test;

import java.util.ArrayList;

import java.lang.reflect.Method;




public class test1 {

	/**
	 * ArrayList<Integer>的一个对象，在这个集合中
	 * 添加一个字符串，如何实现？
	 * 泛型只在编译器有效，在运行期会被擦除掉
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(22);
		list.add(11);
		System.out.println(list);
		
		Class clazz = Class.forName("java.util.ArrayList");
		Method m = clazz.getMethod("add",Object.class);
		
		
		m.invoke(list, "abc");
		System.out.println(list);
		
		

		
		
		
	}

}
