package com.learn.decorate2;

public class MusicPhoneDecorate extends PhoneDecorate {

	public MusicPhoneDecorate(Phone p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("music ......");
	}
}
