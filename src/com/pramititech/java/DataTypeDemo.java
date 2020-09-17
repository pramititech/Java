package com.pramititech.java;

public class DataTypeDemo {
	
	
	byte defaultbyteValue;  //define
	short defaultShortValue;
	int defaultIntValue;
	long defaultlongValue;
	char defaultCharValue;
	boolean defaultbooleanValue;
	float defaultfloatValue ;
	double defaultdoubleValue ;
	String defaultStringValue;
	
public static void main(String[] args) {
	
	//1. Class Name starts with a Capital Letter--  Noun
	//2. variable name should start with small letter 
	//3. method name should start small letters  --verb
	//4. packages name should start from small letter
	//5. you can follow camel case style of Identifier or name : "strItemId"
	//6. Interfaces-- Capital start 
	DataTypeDemo obj=new DataTypeDemo();
	
byte b=5;  //initialization
short s=312;
int i=214748364;
long l= 300000000000000l;
char c ='Y';
boolean flag=true;
float f= 30.04f;
double d=45.0008;

String name="PramitiSoft";



System.out.println("Value of byte variable="+b);
System.out.println("Value of Short variable="+s);
System.out.println("Value of int variable="+i);
System.out.println("Value of long variable="+l);
System.out.println("Value of char variable="+c);
System.out.println("Value of boolean variable="+flag);
System.out.println("Value of float variable="+f);
System.out.println("Value of double variable="+d);
System.out.println("**********************************************");

System.out.println(" Deafult Value of byte variable="+obj.defaultbyteValue);
System.out.println("Default Value of Short variable="+obj.defaultShortValue);
System.out.println("Default Value of int variable="+obj.defaultIntValue);
System.out.println("Default Value of long variable="+obj.defaultlongValue);
System.out.println("Default Value of char variable="+obj.defaultCharValue);
System.out.println("Default Value of boolean variable="+obj.defaultbooleanValue);
System.out.println("Default Value of float variable="+obj.defaultfloatValue);
System.out.println("Default Value of double variable="+obj.defaultdoubleValue);
System.out.println("Default Value of String variable="+obj.defaultStringValue);

System.out.println("**********************************************");

System.out.println(" Bytes in Interger variable ="+Byte.BYTES);
System.out.println("Size in Interger variable ="+Byte.SIZE);
System.out.println("Max Value of Interger variable ="+Byte.MAX_VALUE);
System.out.println(" Min Value Interger variable ="+Byte.MIN_VALUE);


}

void pramitiTechTutorials() {
	// TODO Auto-generated method stub
	
}
}
