package com.pramititech.staticdemo;

public class Employee1 {
	
	String name="Vikrant";
	static String companyName="PramitiTech";
	
	void m1()
	{
		System.out.println("m1");
	}
	
	static void m2()
	{
		System.out.println("m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accessing Static members Inside the Class");
		System.out.println(companyName);
		m2();
		System.out.println("Accessing Static members Outside the Class");
		System.out.println(Employee2.firmName);
		Employee2.m4();
		System.out.println("Accessing Non Static members Inside the Class");
		Employee1 obj=new Employee1();  //object get a memory/copy of non static members
		System.out.println(obj.name);
		obj.m1();
		
		System.out.println("Accessing Non Static members Outside the Class");
		Employee2 obj1=new Employee2();
		System.out.println(obj1.name);
		obj1.m3();
		
	}

}

class Employee2
{
	String name="Ankita";
	static String firmName="PramitiTech";
	
	void m3()
	{
		System.out.println("m3");
	}
	
	static void m4()
	{
		System.out.println("m4");
	}
}
