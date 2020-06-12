package com.nttdata.exceptionHandling;

public class Bank {
public void transfer(User user1,User user2,double amount) throws InsufficientAmount, ZeroBalance
{
	if(user1.getAccount().getAccountBalance()<amount)
	{
		throw new InsufficientAmount("Insufficient Blance!!Enter Valid Amount to be transfered..");
	}
	else if(user1.getAccount().getAccountBalance()==0)
	{
		throw new ZeroBalance("Zero Balance!!Try to maintain the minimum balance..");
	}
	else
	{
		double balance1=user1.getAccount().getAccountBalance();
		double balance2=user2.getAccount().getAccountBalance();
		user1.getAccount().setAccountBalance(balance1-amount);
		user2.getAccount().setAccountBalance(balance2+amount);
	}
}
}
