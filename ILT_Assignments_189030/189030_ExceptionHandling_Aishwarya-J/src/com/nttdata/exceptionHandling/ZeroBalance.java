package com.nttdata.exceptionHandling;

@SuppressWarnings("serial")
public class ZeroBalance extends Exception {
	public ZeroBalance(String message)
	{
		super(message);
	}
}
