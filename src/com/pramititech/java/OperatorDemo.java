package com.pramititech.java;

public class OperatorDemo {

	public static void main(String[] args) {
		/*
		 * 1. The one which can join 2 or more than 2 variables and convert into
		 * expression( should have homogeneous type of vasriable) are called Operator
		 * Eg: int a; and int b; int c=a+b; a+b(Expression) + (Operator)
		 * 
		 * 2. to perform any operation on Variables , we need Operators
		 * 
		 * 1. Artihmetic Operator : + , - , * , / , % (Mathematical) 2. Relational
		 * Operator: >, <, <=,>=,!=,== ( Comparison) Q. What is the outcome of
		 * relational Operator ? Boolean (true/false) 3. Logical Operator : && AND , ||
		 * or 4. Ternary Operator/Conditional Operator :
		 * 
		 * a>b ? a : b ;
		 * 
		 * a>b=Condition True : Execute a False : Execute b
		 * 
		 * 5. Assignment Operator = +=,-=,*=,/= a+=10; /short hand expression int a=0;
		 * a=a+10; //Override initialized value
		 * 
		 * is to create a chain of expressions
		 */
		int a = 10;
		int b = 20;
		int c = a > b ? a : b;
		System.out.println("Greates No is " + c);

	}

}
