package com.learn.proxy;

public class WorkerImpl implements Worker {


	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("worker add");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("worker modify");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("worker delete");
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("worker search");
	}

}
