package com.pramititech.finaldemo;

public   class ParentClass {

	final int i=10;  
	final String name = "Vikrant";
	
	public static String loginXpath2 = "/opt/html/login";
	public final static  String loginXpath = "";
	
	
	 void  login()
	{
		//final int j=100;
		System.out.println("Login to Parent PramitiTech");
		
	}
	
	final void  login(int a)
	{
		//final int j=100;
		System.out.println("Login to  PramitiTech");
		
	}
	
	final void  login(int a,int b)
	{
		//final int j=100;
		System.out.println("Login to  a b  PramitiTech");
		
	}
	
	public static void main(String[] args) {
		ParentClass obj=new ParentClass();
		obj.login();
		obj.login(5);
		obj.login(5,10);
	}
}

class ChildClass extends ParentClass
{
	void  login()
	{
		//final int j=100;
		System.out.println("Login to Child  PramitiTech");
		
	}
}
