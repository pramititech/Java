package com.pramititech.inheritance;

public class SeleniumDriverTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FetchDriver obj=new FetchDriver();
		obj.getDriver(new ChromeDriver());
		obj.getDriver(new FireFox());
		obj.getDriver(new Safari());
	}

}
