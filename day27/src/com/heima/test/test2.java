package com.heima.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test2 {

	/**
	 * 写一个Properties格式的配置文件，配置类的完整名称。
	 * 写一个程序，读取这个properties配置文件，获得类的完整名称并加载这个类，用
	 * 反射的方式运行run方法
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new FileReader("xxx.properties"));
		
		Class clazz = Class.forName(br.readLine());
		
		//通过字节码创建对象
		//DemoClass dc = clazz.newInstance();
		
		
	}

}
