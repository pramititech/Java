package com.pramititech.exception;

import java.util.Scanner;

public class CIBILScoreDemo {
	
	public static void main(String[] args) throws CustomException  {
		Scanner sc=new Scanner(System.in);

		boolean flag=true;
		while(flag)
		{		System.out.println("Enter your cibil score :");
		int cibil=sc.nextInt();
//			try
//			{
			Display.showCibil(cibil);
//			}
//			catch(Exception e)
//			{
//				System.out.println(e.toString());
//			}
			System.out.println("Do you want to Try again : Y/N");
			sc.nextLine();
			String response=sc.nextLine();
			if (response.contains("N"))
			{
				flag=false;
			}
		}
		
		System.out.println("Thanks for Checking cibil");
	}

}


class CustomException extends Exception
{
	public String toString()
	{
		return "Sorry you are not Eligible!";
	}
}

class Display
{

	public static void showCibil(int cibil) throws CustomException
	{
//	try {	
		if(cibil<=6)
		{
			throw new CustomException();
		}
		else
		{
			System.out.println("You are Eligible");
		}
		
//	}
//	catch(CustomException e)
//	{
//		System.out.println(e);
//	}
//	
//	catch(Exception e)
//	{
//		System.out.println(e.toString());
//	}

	}
}