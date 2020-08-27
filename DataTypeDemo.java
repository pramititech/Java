
public class DataTypeDemo {
public static void main(String[] args) {
		
byte b=5;  //initialization
short s=312;
int i=214748364;
long l= 300000000000000l;
char c ='Y';
boolean flag=true;
float f= 30.04f;
double d=45.0008;

String name="PramitiSoft";

byte defaultbyteValue = 0;  //define
short defaultShortValue = 0;
int defaultIntValue = 0;
long defaultlongValue = 0;
char defaultCharValue = 0;
boolean defaultbooleanValue = false;
float defaultfloatValue = 0;
double defaultdoubleValue = 0;

System.out.println("Value of byte variable="+b);
System.out.println("Value of Short variable="+s);
System.out.println("Value of int variable="+i);
System.out.println("Value of long variable="+l);
System.out.println("Value of char variable="+c);
System.out.println("Value of boolean variable="+flag);
System.out.println("Value of float variable="+f);
System.out.println("Value of double variable="+d);
System.out.println("**********************************************");

System.out.println(" Deafult Value of byte variable="+defaultbyteValue);
System.out.println("Default Value of Short variable="+defaultShortValue);
System.out.println("Default Value of int variable="+defaultIntValue);
System.out.println("Default Value of long variable="+defaultlongValue);
System.out.println("Default Value of char variable="+defaultCharValue);
System.out.println("Default Value of boolean variable="+defaultbooleanValue);
System.out.println("Default Value of float variable="+defaultfloatValue);
System.out.println("Default Value of double variable="+defaultdoubleValue);

System.out.println("**********************************************");

System.out.println(" Bytes in Interger variable ="+Integer.BYTES);
System.out.println("Size in Interger variable ="+Integer.SIZE);
System.out.println("Max Value of Interger variable ="+Integer.MAX_VALUE);
System.out.println(" Min Value Interger variable ="+Integer.MIN_VALUE);


}
}
