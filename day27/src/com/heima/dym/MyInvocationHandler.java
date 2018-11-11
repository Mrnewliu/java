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
		
		System.out.println("权限校验");
		method.invoke(target, arg2);
		System.out.println("日志记录");
		
		
		return null;
	}

	private Object tg;

}
