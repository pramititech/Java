package com.pramititech.constructor;

public class ConstructorDemo {
	
String username;
String password;

//	
	ConstructorDemo()
	{
		System.out.println("I am in Non Parametrized Constructor");
		
		//UD Non Parametrized constructor
		//It has some implementation
	}
	
	ConstructorDemo(int i)
	{
		System.out.println("I am in  Parametrized Constructor");
		
		//UD  Parametrized constructor
	}
	
	ConstructorDemo(int i,int j)
	{
		System.out.println("I am in  Parametrized Constructor");
		
		//UD  Parametrized constructor
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo obj=new ConstructorDemo();
		
		ConstructorDemo obj2=new ConstructorDemo(5);

	}

}
