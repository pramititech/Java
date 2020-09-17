package com.pramititech.java;

public class ElseIfLadderDemo {

	public static void main(String[] args) {

		int marks=35;
		
		if (marks>90 && marks<=100)
		{
			System.out.println("GRADE A");
		}
		else if (marks>80 && marks <=90)
		{
			System.out.println("GRADE B");
		}
		
		else if (marks>70 && marks<=80)
		{
			System.out.println("GRADE C");
		}
		
		else
		{
			System.out.println("You are Failed!");
		}
		
		System.out.println("After Else");
		
		//Write one Program if the number is divisible by 3 , Display Shahrukh , if No divisible by 5 Display Salman , 
		//If Not Divisble display Hrithik
}
}
