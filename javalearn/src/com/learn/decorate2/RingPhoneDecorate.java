package com.learn.decorate2;

public class RingPhoneDecorate extends PhoneDecorate {

	public RingPhoneDecorate(Phone p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Ring ......");
		super.call();
	}
}
