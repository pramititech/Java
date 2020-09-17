package com.pramititech.inheritance;

public class Vegetables {

	
	void cook()
	{
		System.out.println("Cooking");
	}
	
	void chop()
	{
		System.out.println("Chopping");
	}
}

class Carrot extends Vegetables
{
	void prepareHalwa()
	{
		System.out.println("Prepare halwa");
	}
	
	void chop()
	{
		System.out.println("Carrot Chopping");
	}
}
