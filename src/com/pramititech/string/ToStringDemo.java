package com.pramititech.string;

public class ToStringDemo {
	
	String empName;
	
	ToStringDemo(String empName)
	{
		this.empName=empName;
	}
	
	public String toString()
	{
		return empName;
	}
	
	public boolean equals(Object obj)
	{
		boolean flag=false;
		if (obj instanceof ToStringDemo)
		{
		ToStringDemo obj2=(ToStringDemo) obj;
		if (this.empName==obj2.empName)
		{
		flag=true;
		}
		else {
			flag=false;
		}
		}
		else
		{
			String obj3=(String)obj;
			if (this.empName==obj3)
			{
			flag=true;
			}
			else {
				flag=false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringDemo obj1=new ToStringDemo("Vikrant");
		ToStringDemo obj2=new ToStringDemo("Vikrant");
		ToStringDemo obj3=new ToStringDemo("Tejeshwar");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1.equals("Vikrant"));
		System.out.println(obj1.equals("Ankita"));
//		String s1="abc";
//		String s2="abc";
//				System.out.println(s1.equals(s2));
		
//		String obj2=new String ("abc");
//		System.out.println(obj2);
//		System.out.println(obj);

	}

}
