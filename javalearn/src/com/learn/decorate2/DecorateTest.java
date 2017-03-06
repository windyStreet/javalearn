package com.learn.decorate2;

public class DecorateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new IPhone();
		p.call();
		//接电话前听彩铃
		//接电话后听音乐
		System.out.println("======================");
		Phone mp = new MusicPhoneDecorate(p);
		mp.call();
		System.out.println("######################");
		Phone mrp = new RingPhoneDecorate(mp);
		mrp.call();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		Phone ph = new RingPhoneDecorate(new MusicPhoneDecorate(new IPhone()));
		ph.call();
	}

}
