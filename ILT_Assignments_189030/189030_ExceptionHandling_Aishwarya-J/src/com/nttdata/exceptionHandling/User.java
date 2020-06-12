package com.nttdata.exceptionHandling;

public class User {
	private String userName;
	private String userAddress;
	private Account account;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public User(String userName, String userAddress, Account account) {
		super();
		this.userName = userName;
		this.userAddress = userAddress;
		this.account = account;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userAddress=" + userAddress + ", account=" + account + "]";
	}
	
}
