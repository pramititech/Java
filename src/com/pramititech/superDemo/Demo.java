package com.pramititech.superDemo;

abstract class Alpha
{
	Alpha()
	{
		System.out.println("Alpha");
	}
}

class Beta extends Alpha
{
	Beta(int a)
	{
				//call parent class constructor
		System.out.println("Beta");
	}
}

class Gamma extends Beta
{
	Gamma()
	{		super(5);			//call parent constructor
		System.out.println("Gamma");
	}
}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamma obj=new Gamma();
	}

}
