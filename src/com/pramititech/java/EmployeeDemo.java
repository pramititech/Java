package com.pramititech.java;
//Hierarchy Inheritance
public class EmployeeDemo {
	
		int bonus=20000;
		
		void status()
		{
			System.out.println("Employee working");
		}
		
		void giveHealthInsurance()
		{
			System.out.println("Health insurance Granted!");
		}
	
}

class Developer extends EmployeeDemo
{
	double salary=40000;
	
	void development()
	{
		System.out.println("Developing Code");
	}
}

class TesterDemo1 extends EmployeeDemo
{
	double salary=30000;
	
	void testing()
	{
		System.out.println("Test Code");
	}
}




