package com.learn.decorate2;

public abstract class PhoneDecorate  implements Phone{

	private Phone p;
	
	public PhoneDecorate(Phone p){
		this.p = p;
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		this.p.call();
	}
}
