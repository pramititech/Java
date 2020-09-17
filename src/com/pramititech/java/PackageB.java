package com.pramititech.java;

public class PackageB {
	
	public int i=10;
	protected int j=20;
	private int p=30;
	int q=40;
	
public void pubmethod()
{
	 int k=40;
	System.out.println("Public");
}

private void privatemethod()
{
	System.out.println("Private");
}

 void defmethod()
{
	System.out.println("Default");
}
 
 protected void protectedMethod()
{
	System.out.println("Protected");
}
 
 public static void main(String[] args) {
	 PackageB obj=new PackageB();
	 System.out.println("**************Inside Class*****************************");
	 obj.pubmethod();
	 obj.privatemethod();
	 obj.protectedMethod();
	 obj.defmethod();
}
}

