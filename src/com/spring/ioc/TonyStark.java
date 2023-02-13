package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TonyStark {
	
	public static void main(String[] args)
	{
		//Step 2 :  Creating a spring Container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Applicationcontext.xml");// factory  or spring factory 
		
		
		Suit s = ctx.getBean("mySuit",Suit.class);  // abstraction 
		
		//Retreive Bean from container
		
	System.out.println(s.createIronManSuit());
	
	//System.out.println("THis is HashCode : "+s.hashCode());
	
	}
}
