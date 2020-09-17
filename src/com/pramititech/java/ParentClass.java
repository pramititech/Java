package com.pramititech.java;

public class ParentClass {
	
	int a;
	int b;
	
	void display(int a , int b)
	{
		//100 lines code
	}

}

class ChildClass extends ParentClass {
	
	int p;
	int q;
	
	void displayImage()
	{
		//100 lines code
		
		//200 more lines
	}
	
	void playSound()
	{
		//100 lines code
		
		//200 more lines
	}
	
}

//if we create object of subclass,that object has propeties of SuperClass and SubClass
class Test
{
	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		
		
	}
}
