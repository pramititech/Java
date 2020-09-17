package com.pramititech.polymorphism;

public class SeleniumWebDriver {
	
	void returnDriver()
	{
		
	}

}

class ChromeDriver extends SeleniumWebDriver   //1 inheritcance
{
	void returnDriver()
	{
		System.out.println("Chrome Driver returned");  //2 overriding
	}
}

class FireFox extends SeleniumWebDriver
{
	void returnDriver()
	{
		System.out.println("FireFox Driver returned");
	}
}

class Safari extends SeleniumWebDriver
{
	void returnDriver()
	{
		System.out.println("Safari Driver returned");
	}
}

class FetchDriver
{
	void getDriver(SeleniumWebDriver driver) 
	{
		if(driver instanceof ChromeDriver)
		{
			driver.returnDriver();
		}
		
		else if (driver instanceof FireFox)
		{
			driver.returnDriver();
		}
		
		else if (driver instanceof Safari)
		{
			driver.returnDriver();
		}
	}
}