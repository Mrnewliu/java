package com.heima.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test2 {

	/**
	 * дһ��Properties��ʽ�������ļ�����������������ơ�
	 * дһ�����򣬶�ȡ���properties�����ļ����������������Ʋ���������࣬��
	 * ����ķ�ʽ����run����
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new FileReader("xxx.properties"));
		
		Class clazz = Class.forName(br.readLine());
		
		//ͨ���ֽ��봴������
		//DemoClass dc = clazz.newInstance();
		
		
	}

}
