package com.heima.dym;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target;
	
	public MyInvocationHandler(Object target)
	{
		
		this.target = target;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Ȩ��У��");
		method.invoke(target, arg2);
		System.out.println("��־��¼");
		
		
		return null;
	}

	private Object tg;

}
