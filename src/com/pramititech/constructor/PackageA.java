package com.pramititech.constructor;

import com.pramititech.java.PackageB;

public class PackageA extends PackageB{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************OutSide Package*****************************");
		PackageA obj=new PackageA();
	obj.protectedMethod();
	obj.pubmethod();

	}

}
