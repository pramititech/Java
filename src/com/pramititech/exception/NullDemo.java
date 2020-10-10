package com.pramititech.exception;

public class NullDemo

{
	public static void main(String[] args) 
	{
		String s= null;
		
		try {
		System.out.println(s.length());
		    }
		

		catch(NullPointerException e)     //inherit Exception
		{
			//System.out.println(e.getMessage());  //overriding
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		catch(Exception e)     //3. upcasting
		{
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}

	}
	
}


