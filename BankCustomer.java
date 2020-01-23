package com.flexon.javabasics;

public class BankCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	CheckingAccount cuser1=new CheckingAccount();
    cuser1.setAccNumber(2345678);
    cuser1.setUserName("Anu");
    cuser1.setPhonenumber("3434383590");
    cuser1.setSsn(319546786);
    cuser1.DepositAmount(50);
    //System.out.println("Account Number: " + cuser1.getAccNumber() + ", Balance: " + cuser1.getBalance());
	cuser1.DepositAmount(150);
	cuser1.WithdrawAmt(5);
	 
	SavingsAccount suser1=new SavingsAccount();
    suser1.setAccNumber(2345678);
    suser1.setUserName("Anu");
    suser1.setPhonenumber("3434383590");
    suser1.setSsn(319);
    suser1.DepositAmount(100);
    //System.out.println("Account Number: " + suser1.getAccNumber() + ", Balance: " + suser1.getBalance());
	suser1.DepositAmount(100);
	suser1.WithdrawAmt(10);
	
	cuser1.CheckBalance();
	
	suser1.CheckBalance();
	
	 
	}
}

	

