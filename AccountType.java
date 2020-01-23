package com.flexon.javabasics;

public class AccountType {
	private int accNumber;
	private String userName;
	private String phonenumber;
	private long ssn;
	private int balance =0 ;
	
	//for encapsulation use getter & setter methods (go to source and click generate getter setter methods)
	
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber)throws Exception {
		if(phonenumber.length()>10)
		{
			throw new Exception("Phone number field cannot exceed 10");
		}
		 this.phonenumber = phonenumber;
	}
	public double getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void DepositAmount(int amt)
	{
		balance=getBalance()+amt;
		System.out.println("The total balance after deposit: " + balance);
	}
	
	public void WithdrawAmt(int w_amt) throws Exception
	{
		balance=balance-w_amt;
		System.out.println("The total balance after withdrawal: " +balance);
	}
	
	public void CheckBalance(){
		System.out.println("The total Account balance for "+ userName +" : "+ balance);
	}
	
	
}





	
	
