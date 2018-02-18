package com.test.objects;


public interface Account {

	public String accountType = new String();
	
	public int balance = 0;
	
	public int checkBalance(int balance);
	
	public int deposit(int amount);
	
	public int withdraw(int amount);
}
