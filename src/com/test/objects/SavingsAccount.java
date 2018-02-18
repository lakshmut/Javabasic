package com.test.objects;


public class SavingsAccount implements Account{

	
	public SavingsAccount()
	{
		super();
	}
	
	/**
	 * accountType
	 */
	public String accountType;
	
	/**
	 * balance
	 */
	public int balance;
	
	
	/**
	 * 
	 * @return
	 */
	public String getAccountType() {
		return accountType;
	}
	
	/**
	 * 
	 * @param accountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getBalance() {
		return balance;
	}
	
	/**
	 * 
	 * @param balance
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	/**
	 * check balance
	 */
	public int checkBalance(int balance) {

		this.balance = this.balance + deposit(100) - withdraw(50);
		return this.balance;
	}
	
	/**
	 * method to deposit
	 */
	public int deposit(int amount) {
		return amount;
		
	}
	
	/**
	 * method to withdraw
	 */
	public int withdraw(int amount) {
		
		return amount;
		
	}

	
	public String toString()
	{
		String savingAcct = new String();
		savingAcct = "The account typs is: "
		+ this.accountType + ", the balance in account is :"+ this.balance;
		return savingAcct;
	}
	
}
