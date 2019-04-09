package com.revature.beans;

public class Account {

	public Account(int id, int accountNum, double balance) {
		super();
		this.id = id;
		this.accountNum = accountNum;
		this.balance = balance;
	}

	private int id;
	private int accountNum;
	private double balance;
	
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public int getAccountNum() {return accountNum;}
	public void setAccountNum(int accountNum) {this.accountNum = accountNum;}
	
	public double getBalance() {return balance;}
	public void setBalance(double balance) {this.balance = balance;}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNum=" + accountNum + ", balance=" + balance + "]";
	}
	
	
	
}
