package com.flexon.javabasics;

public class BankAccount {

		public double account_number;
		public double balance;
		public String customer_name;
		public String email;
		public double phone_number;
		
		//To allow the customer to deposit funds (this should increment the balance field).
		//To allow the customer to withdraw funds. This should deduct from the balance field, but not allow the withdrawal to complete if their are insufficient funds and print the balance with name of customer
		//Create another method to print Customer Name, Account Number, Balance, Email and Phone Number	

		public void DepositAmount(double amt)
		{
			balance=balance+amt;
			System.out.println("The new balance after deposit: " + balance);
		}
		
		public void WithdrawAmt(double w_amt)
		{
			balance=balance-w_amt;
			System.out.println("The new balance after withdrawal: " +balance);
		}
		
		public void AccountDetails()
		{
			System.out.println("Name of the Account Holder: " +customer_name);
			System.out.println("Account Number: " +account_number);
			System.out.println("New Balance: " +balance);
			System.out.println("Email Address: " +email);
			System.out.println("Contact No: " +phone_number);
		}
// since the main class is written in this file, it has to be static. 
static class MainClass {		
	public static void main(String[] args) {
			 BankAccount user1=new BankAccount();
			 user1.account_number=12345;
			 user1.balance=50000;
			 user1.customer_name="Anu";
			 user1.email="vysala.anu@gmail.com";
			 user1.phone_number=646392507;
			 
			 user1.DepositAmount(1000);
			 user1.WithdrawAmt(500);
			 user1.AccountDetails();		 
			 
		 }
	 }
}


