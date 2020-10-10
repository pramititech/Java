package com.pramititech.exception;

public class CustomExceptionDemo {
	
	public static void main(String[] args) {
		

		try {
		throw new MyException1();
		}
		catch(MyException1 e)
		{
			System.out.println(e);
		}
		
		finally {
			System.out.println("Connection Reset");
		}
//		try {
//		throw new MyException();
//		}
//		catch(MyException e)
//		{
//			System.out.println(e.toString());
//		}
		
		System.out.println("Pending Statement");
	}

}

class MyException1 extends RuntimeException   //1. 
{
	public String toString()
	{
		return " Error Code-> ECONNREFUSED : Connection is Refused from google";
	}
}

class MyException2 extends Exception
{
	public String toString()
	{
		return "This is a Custom Exception CLass: NullPointer Exception";
	}
}

class MyException3 extends Throwable
{
	public String toString()
	{
		return "This is a Custom Throwable Class: NullPointer Exception";
	}
}
