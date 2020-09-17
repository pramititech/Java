package com.pramititech.polymorphism;

import java.util.Scanner;

public class SeleniumDriverTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser;
		boolean Flag=true;
		
		while(Flag)
		{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Browser :");
		browser=scn.nextLine();
		
		FetchDriver obj=new FetchDriver();
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
		obj.getDriver(new ChromeDriver());
		}
		else if (browser.equalsIgnoreCase("FireFox"))
		{
		obj.getDriver(new FireFox());
		}
		else if (browser.equalsIgnoreCase("Safari"))
		{
		obj.getDriver(new Safari());
		}
		else 
		{
			System.out.println("Browser not found");
		}
		
//		SeleniumWebDriver obj=new ChromeDriver(); //Upcasting
//		obj.returnDriver();
		System.out.println("Do you want to search more browser ? Y/N");
		if (scn.nextLine().contains("N"))
				{
			Flag=false;
				}
//		
		}
		
		System.out.println("*******Thanks for visiting Selenium Webdriver Service********");
	}

}
