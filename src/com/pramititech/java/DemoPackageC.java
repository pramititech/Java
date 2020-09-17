package com.pramititech.java;

public class DemoPackageC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("**************OutSide Class*****************************");
		PackageB obj=new PackageB();
		obj.defmethod();
		obj.protectedMethod();
		obj.pubmethod();

	}

}
