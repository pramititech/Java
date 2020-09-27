package com.pramititech.polymorphism;

abstract class RBI 
{
	abstract void withdrawMoney();
	abstract void checkBalance();
	 
	void checkMiniStatemnt() {
		 
	 }
}

class SBI extends RBI
{

	@Override
	void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money withdrawed from SBI");
		
	}

	@Override
	void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance displayed from SBI");
	}
	
}


class HDFC extends RBI
{

	@Override
	void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money withdrawed from HDFC");
	}

	@Override
	void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance displayed from HDFC");
		
	}

}


public class DisplayBank {

	void contactBank(RBI bank)
	{
		bank.withdrawMoney();
		bank.checkBalance();  // Performance improved as , it will be 1 time method call
	}
}
