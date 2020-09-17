package com.pramititech.java;
public class Remote
{
//		String remoteColor="Black";  //Instance Variable ,Data Members ,States
//		int remoteSize=20;
//		int remoteKeys=100;
	
	String remoteColor;  //Instance Variable ,Data Members ,States
	int remoteSize;
	int remoteKeys;
	
	Remote(String remoteColor1,int remoteSize2,int remoteKeys2)
	{
		this.remoteColor=remoteColor1;
		this.remoteSize=remoteSize2;
		this.remoteKeys=remoteKeys2;
		
	}
		
		void switchon()
		{								//Behaviour , Functional Member,Actions
			
			System.out.println("TV Switched on !");
		}
		
		void switchoff()
		{								//Behaviour , Functional Member,Actions
			
			System.out.println("TV Switched off !");
		}
		
			
		
}