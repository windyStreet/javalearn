package com.learn.decorate2;

public class DecorateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new IPhone();
		p.call();
		//�ӵ绰ǰ������
		//�ӵ绰��������
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
