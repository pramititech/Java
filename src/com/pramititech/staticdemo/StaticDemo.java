package com.pramititech.staticdemo;

public class StaticDemo {

	 static void staticmethod1()
	{
		 (new StaticDemo()).nonstaticmethod2();
		System.out.println(" I am in Static Method");
	}
	 
	 static void staticmethod2()
	{
		 staticmethod1();  
		System.out.println(" I am in Static Method 2");
	}
	 
	  void nonstaticmethod1()
		{
		  StaticDemo.staticmethod1();  //outside the class with a class name
		  staticmethod2();  // within the class with direct name
			System.out.println("I am in Non Static Method 1 ");
		}
	  
	  void nonstaticmethod2()
		{
		  nonstaticmethod1();    // Non static method with a direct name
		  System.out.println("I am in Non Static Method 2 ");
		}
	  
	  public static void main(String[] args) {
		  StaticDemo obj=new StaticDemo();
		  obj.nonstaticmethod1();
	}
}

//OutSide 
class StaticDemoOuterClass
{
	static void staticCalling()
	{
		(new StaticDemo()).nonstaticmethod2();
	}
	
	void nonStaticCalling()
	{
		(new StaticDemo()).nonstaticmethod2();
	}
	
	//Staticmethod Callling
	static void staticCalling1()
	{
		StaticDemo.staticmethod1();
	}
	
	void nonStaticCalling1()
	{
		StaticDemo.staticmethod1();
	}
	
	
	
	
	
	
}