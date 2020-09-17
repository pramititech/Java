package com.pramititech.constructor;


import com.pramititech.java.*;  //user defined package

public class ConstructorUse {


	int a;
	String name;  //instance variable//global variabla
	String password;
	ConstructorUse()  //local variable 
	{

	}
	
	ConstructorUse(int a,String name)  //local variable 
	{
		this.a=a;  //this clear the confusion when Local and Instance variables name are same, and it refer to instance variable
		this.name=name;
	}
	
	int ConstructorMethod(int a,int b )  //local variable 
	{
		int c=a+b;
		return c;
	}
	

public static void main(String[] args) {

		
		//ConstructorUse obj=new ConstructorUse(5,"PramitiTech");
		

		
		Environment obj=new Environment("PramitiTech", "Password", "Selenium", "Chrome");
		Environment obj2=new Environment("PramitiTech", "Password", "Selenium", "FireFox");
		Environment obj3=new Environment("PramitiTech", "Password", "Selenium", "InternetExplorer");
		
		ParentClass obj4=new ParentClass();
		System.out.println();
		
		ConstructorUse obj5=new ConstructorUse();
	

	//	System.out.println(obj.a);
	//	System.out.println(obj.name);
		
	}

}
