package com.pramititech.polymorphism;

public interface ATM {
//	
//	void withdrawMoney();
//	void checkStatment();
//
}
//
//interface Cashier extends ATM
//{
//	void checkBalance();
//}

interface HDFCBank
{
	public static final double cashAvailable = 0;
	abstract void withdrawCash();
	void checkStatement();
}

interface  YesBank

{

	 void withdrawCash(int amount);
	 void checkBalance();
	
	//it allows concrete method 
	
}

class  SBIBank implements HDFCBank,YesBank
{

	SBIBank()
	{
		
	}
	@Override
	public void withdrawCash() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw Cash from SBI");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawCash(int amount) {
		// TODO Auto-generated method stub
		
	}

	
	
}
