package com.pramititech.staticdemo;

public class StaticBlockDemo {
//	
	int i;
	static int j;
	
	

	static {
		System.out.println("I am static block 1");
//		j=100;
	}
	
	static {
		System.out.println("I am static block 2");
	}
	
	StaticBlockDemo()
	{
		this.j=100;
		this.i=20;
		System.out.println(" I am in Constructor");
	}
	
	{
		this.j=100;
		this.i=20;
		System.out.println(" I am non static Block");
	}
	

}

