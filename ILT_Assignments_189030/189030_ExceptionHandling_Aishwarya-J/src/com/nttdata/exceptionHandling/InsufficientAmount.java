package com.nttdata.exceptionHandling;

@SuppressWarnings("serial")
public class InsufficientAmount extends Exception {
	public InsufficientAmount(String message)
	{
		super(message);
	}
}
