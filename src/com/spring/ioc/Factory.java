package com.spring.ioc;

public class Factory implements Suit
{

	@Override
	public String createIronManSuit() {
		
		return "Createing and Configuring the Suit By objects in the Factory";
	}
}