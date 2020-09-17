package com.pramititech.staticdemo;

public class Demo {
	
	static int k=20;
	
	static
	{
		System.out.println("i am static block of Demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2.m4();
		System.out.println(Employee2.firmName);

	}

}
