package com.learn.pattern;

public class PatternTest {
	public static void main(String[] args) {
		// GetTime gt = new GetTime();
		// System.out.println(gt.getTime()+"����");
		GetTime gt = new ForDemo();
		System.out.println(gt.getTime() + "����");
		GetTime fgt = new FileDemo();
		System.out.println(fgt.getTime() + "����");

	}
}
