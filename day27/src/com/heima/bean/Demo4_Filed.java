package com.heima.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;










public class Demo4_Filed {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class clazz =  Class.forName("com.heima.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		
		Person p = (Person)c.newInstance("sad",123);
		
		//Field f = clazz.getField("name");
		
	
		/*f.set(p,"aaa");
		System.out.println(p);*/
		//±©Á¦»ñÈ¡×Ö¶Î
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(false);
		f.set(p, "aaaa");
		
		System.out.println(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
