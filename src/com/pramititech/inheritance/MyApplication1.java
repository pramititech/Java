package com.pramititech.inheritance;

public class MyApplication1 {
	
	int i=20;
	
	public void register()
	{
		System.out.println(" We should have username of 4 character and no special characters");
		System.out.println(" We should have password of 4 character and special characters");
	}
	
	void login(String username,String password)
	{
		if (username=="Vikrant" && password=="Vikrant@123")
		{
			System.out.println("Successfully Login !");
		}
	}

}

class MyApplication2 extends MyApplication1
{
	int i=10;
	public void register()
	{
		System.out.println(" We should have username of 6 character and no special characters");
		System.out.println(" We should have password of 6 character and special characters");

	}

	

	
	void register(boolean flag)
	{
		System.out.println(" We should have username of 4 character and no special characters");
		System.out.println(" We should have password of 4 character and special characters");

	}
	
	//method overloading and method overriding
	void login(String username,String password,String otp)
	{
		if (username=="Vikrant" && password=="Vikrant@123"  && otp=="123")
		{
			System.out.println("Successfully Login !");
		}
	}
	
	void show()
	{
		System.out.println(super.i);
		System.out.println(i);
	}
	
}

