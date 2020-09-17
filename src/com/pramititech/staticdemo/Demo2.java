package com.pramititech.staticdemo;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ParentClass obj=new ChildClass();
//		obj.m1(); 
		
		ChildClass obj2=new ChildClass();
		obj2.m1();
		obj2.m1(5);
		
		
		

	}

}


class ChildClass {
	static void m1()
	{
		System.out.println("Child Method");
	}
	
	static void m1(int a)
	{
		System.out.println("Child Method overloaded");
	}
	static void m1(int a,int b)
	{
		System.out.println("Child Method overloaded");
	}

}