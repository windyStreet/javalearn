package com.learn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

	private Object traget;
	 public MyInvocationHandler(Object traget) {
		// TODO Auto-generated constructor stub
		this.traget = traget;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("前置处理");
		Object result = method.invoke(traget, args);
		System.out.println("后置处理");
		return result;
	}

}
