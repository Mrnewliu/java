package com.heima.test;

import java.util.ArrayList;

import java.lang.reflect.Method;




public class test1 {

	/**
	 * ArrayList<Integer>��һ�����������������
	 * ���һ���ַ��������ʵ�֣�
	 * ����ֻ�ڱ�������Ч���������ڻᱻ������
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
