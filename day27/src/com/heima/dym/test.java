package com.heima.dym;

import java.lang.reflect.Proxy;

public class test {

	/**
	 * ��̬�����ڳ������й����в�����������󣬶��������й����в��������������
	 * �ս����ķ�������
	 * java.lang.reflect�����ṩ��Proxy���һ��InvocationHandler�ӿڣ�ͨ��ʹ��������
	 * �ӿھͿ������ɶ�̬�������JDK�ṩ�Ĵ���ֻ��Խӿ�������
	 * 
	 * ==
	 * cglib,Proxy���еķ���������̬�������
	 * public static Object newProxyInstance(ClassLoader loader,
	 * Class<?>[] interfaces,InvocationHandler h);
	 * ���ջ����InvocationHndler�ķ���
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














