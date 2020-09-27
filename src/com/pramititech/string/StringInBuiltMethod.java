package com.pramititech.string;

public class StringInBuiltMethod {
	
	static void  sendName(String s10)
	{
		String [] s15=s10.split(" ");
		System.out.println("Name is " +s15[0]+s15[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JavaDevelopers";
		String s1="Java   ";
		String s6="Vikrant Upadhyay";
		
	System.out.println("Length of String :"+s.length());
	System.out.println("To UpperCase :"+s.toUpperCase());
	System.out.println("To LowerCase :"+s.toLowerCase());
	System.out.println("Start with :"+s.startsWith("J"));  //case sensitive
	System.out.println("Ends with :"+s.endsWith("s")); 
	System.out.println("Char At  :"+s.charAt(5));   //index , start with 0 
	System.out.println("Index of :"+s.indexOf("l"));
	System.out.println("SubString :"+ s.substring(3));  //index start with 1 
	System.out.println("SubString with range:"+ s.substring(2,7));
	System.out.println("replace :"+s.replace('e', 'p'));
	System.out.println("Trim "+ s1.trim());

	sendName("Vikrant Upadhyay teaches Java");
	sendName("Dhawal Sarwate teaches Python");
	
	
	String s2=new String("java");
	String s3=new String("java");
	//compare 2 strings content with equals sign always
	
	
//	for(int i=0;i<s5.length;i++)
//	{
//		System.out.println(i +" Split Value is : "+s5[i]);
//	}
//	
//	for( String s7:s5)
//	{
//		System.out.println(s7);
//	}
	if (s2==s3)
	{
		System.out.println("String Equal");
	}
	else
	{
		System.out.println("String not Equal");
	}
	

	}


	
	
	
	}
	
