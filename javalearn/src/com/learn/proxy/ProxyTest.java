package com.learn.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		Stuent st  = new StuentImpl();
		st.add();
		st.modify();
		st.delete();
		st.search();
		
		//==================
		System.out.println("========================");
		MyInvocationHandler handler = new MyInvocationHandler(st);
		Stuent proxy = (Stuent) Proxy.newProxyInstance(st.getClass().getClassLoader(), st.getClass().getInterfaces(), handler);
		proxy.add();
		proxy.modify();
		proxy.delete();
		proxy.search();

	}

}
