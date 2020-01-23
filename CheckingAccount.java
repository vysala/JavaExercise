package com.flexon.javabasics;
import java.lang.Exception;

//Checking account minimum balance should be $50
//Allow maximum of $50 one time withdrawal from checking account
//Checking account maximum account balance is $100000
//Used Inheritance by extending the AccountType super class

public class CheckingAccount extends AccountType{
	private int chkAccNo;
	private int chkbalance = 0;
	private final int chk_minBalance=50;  // constant variable
	private final int chk_maxBalance=100000; //constant variable
	
	
	public int getChkAccNo() {
		return chkAccNo;
	}

	public void setChkAccNo(int chkAccNo) {
		this.chkAccNo = chkAccNo;
	}
	

    //override the method from superclass in this subclass
		public void DepositAmount(int chkamt)	{	
			if((chkbalance+chkamt)>100000)
			{
				System.out.println("The maximum balance cannot exceed 100000");
			}
			else
			{	
			this.chkbalance=this.chkbalance +chkamt;
			super.DepositAmount(chkamt);
			//this.setBalance(this.getBalance()+chkamt);
			System.out.println("----------- checking balance : "+chkbalance);
			}	
	}
		
		public void CheckingAccountDetails(){
			System.out.println(chkbalance);
		}
		
		public void WithdrawAmt(int amt) throws Exception{
			if(amt>50){
				throw new Exception("one time withdrawal cannot be greater than 50");	
			}
				
			if((chkbalance-amt)<50)
			{
				throw new Exception("The minimum balance should be 50");
			}
			this.chkbalance= this.chkbalance-amt;
			super.WithdrawAmt(amt);
			System.out.println(" ----------Checking balance:" +chkbalance);
			
			
		}
		
		
}
