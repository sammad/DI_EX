package com.di.examples.dependencyinjection.legacyemailservice;

public class ExchangeServer {

	private static ExchangeServer the;
	private ExchangeServer(){}
	
	/**
	 * @return
	 */
	public static ExchangeServer getInstance(){
		if(the==null){
			
				if(the==null)
				the = new ExchangeServer();	
			
		}
		
		return the;
	}
	
	
	public void init(){
		System.out.println("Exchange Server initializing");
	}
	public void synchEmails(){
		System.out.println("Exchange Server synching emails");
	}
}
