package com.pramititech.collections;


public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] i=new int[0];

		i[0]= 10;  
		String[] s= {"Vikrant","Tejeshwar","Ankita","PramitiTech"}; 
		
		for(int j=0;j<s.length;j++)
		{
			System.out.println("Value of Array at index "+j+" "+ ":" +s[j]);
		}
		
		System.out.println(" For Each ");
		
		for(String itr :s)
		{
			System.out.println(itr);
		}
		
		for(int itr2 :i)
		{
			System.out.println(itr2);
		}
	}

	
	
}
