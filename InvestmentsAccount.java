package com.flexon.javabasics;

public class InvestmentsAccount extends AccountType {
	//Investments account minimum balance should be $5000
	//Allow maximum of $1000 one time withdrawal from investment account
	//Investment account maximum account balance is $1000000
	 
	private int invAccNo;
	private int invbalance = 0;
	private final int inv_minBalance=5000;  // constant variable
	private final int inv_maxBalance=100000; // constant variable
	
	public void WithdrawAmt(int amt) throws Exception{
		if(amt>1000){
			throw new Exception("one time withdrawal cannot be greater than 1000");	
		}
			
		if((invbalance-amt)<5000)
			
		{
			throw new Exception("The minimum balance in Investment account should be 5000");
		}
		this.invbalance= this.invbalance-amt;
		super.WithdrawAmt(amt);
		System.out.println(" ----------Investment balance :" +invbalance);
		
		
	}
}
