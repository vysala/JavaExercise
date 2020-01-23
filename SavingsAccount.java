package com.flexon.javabasics;

//Savings account minimum balance should be $100
//Allow maximum of $5000 one time withdrawal from checking account
//savings account maximum account balance is $1000000

public class SavingsAccount extends AccountType {
	
	private int savAccNo;
	private int savbalance = 0;
	private final int sav_minBalance=100;  // constant variable
	private final int sav_maxBalance=100000; //constant variable
	private int interestrate;
	
	public int getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(int interestrate) {
		this.interestrate = interestrate;
	}
	
	public void addInterest()
	{
		int interest=this.savbalance*getInterestrate()/100;
		DepositAmount(interest);
		
	}
	
	//override the method from superclass in this subclass
			public void DepositAmount(int savamt)	{
				if((savbalance+savamt)>100000)
				{
					System.out.println("The maximum balance cannot exceed 100000");
				}
				else
				{
				this.savbalance=this.savbalance +savamt;
				super.DepositAmount(savamt);
				//this.setBalance(this.getBalance()+savamt);
				System.out.println("----------- Saving Account balance : "+savbalance);
				}	
			}

   public void WithdrawAmt(int amt) throws Exception{
	if((savbalance-amt)<100)
	{
		throw new Exception("The minimum balance shld be 100");
	}
	this.savbalance= this.savbalance-amt;
	super.WithdrawAmt(amt);
	System.out.println(" ----------Checking balance :" +savbalance);
   }
}
   
	
	


