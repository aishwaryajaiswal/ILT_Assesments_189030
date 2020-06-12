package com.nttdata.exceptionHandling;

public class Account {
	private int accountId;
	private double accountBalance;
	private int accountPin;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountPin() {
		return accountPin;
	}
	public void setAccountPin(int accountPin) {
		this.accountPin = accountPin;
	}
	public Account(int accountId, double accountBalance, int accountPin) {
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.accountPin = accountPin;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountBalance=" + accountBalance + ", accountPin=" + accountPin
				+ "]";
	}
	
}
