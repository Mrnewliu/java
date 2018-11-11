package com.heima.dym;

import java.lang.reflect.Proxy;

public class test {

	/**
	 * 动态代理：在程序运行过程中产生的这个对象，而程序运行过程中产生对象就是我们
	 * 刚讲过的反射内容
	 * java.lang.reflect包下提供了Proxy类和一个InvocationHandler接口，通过使用这个类和
	 * 接口就可以生成动态代理对象。JDK提供的代理只针对接口做代理
	 * 
	 * ==
	 * cglib,Proxy类中的方法创建动态代理对象
	 * public static Object newProxyInstance(ClassLoader loader,
	 * Class<?>[] interfaces,InvocationHandler h);
	 * 最终会调用InvocationHndler的方法
	 * InvocatinHander Object invoke(Object proxy,Method method,Object[] args);
	 * 
	 * @param args
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*UserImp ui = new UserImp();
		ui.add();
		ui.delete();
		System.out.println("dddddddddddddddddddddd");
		MyInvocationHandler m =new MyInvocationHandler(ui);
		User u = (User)Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), m);
		u.add();
		u.delete();*/
		
		StudentImp si = new StudentImp();
		si.login();
		si.sumbit();

		
		System.out.println("ggggggggggggggggggggg");
		
		MyInvocationHandler m =new MyInvocationHandler(si);
		Student s = (Student)Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), m);
		s.login();
		s.sumbit();
		
		
		
	}

}














