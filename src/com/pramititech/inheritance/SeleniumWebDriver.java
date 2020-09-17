package com.pramititech.inheritance;

public class SeleniumWebDriver {

}

class ChromeDriver extends SeleniumWebDriver
{
	
}

class FireFox extends SeleniumWebDriver
{
	
}

class Safari extends SeleniumWebDriver
{
	
}

class FetchDriver
{
	void getDriver(SeleniumWebDriver driver) 
	{
		if(driver instanceof ChromeDriver)
		{
			System.out.println("Chrome Driver returned");
		}
		
		else if (driver instanceof FireFox)
		{
			System.out.println("FireFox Driver returned");
		}
		
		else if (driver instanceof Safari)
		{
			System.out.println("Safari Driver returned");
		}
	}
}