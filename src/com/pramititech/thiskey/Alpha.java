package com.pramititech.thiskey;

public class Alpha {
	
	Alpha()
	{
		this(10);
		System.out.println("Alpha Constructor");
	
	}
	
	Alpha(int i)
	{
		this("Vikrant");
		System.out.println(i);
	}
	
	Alpha(String  name)
	{
		System.out.println(name);
	}

}
