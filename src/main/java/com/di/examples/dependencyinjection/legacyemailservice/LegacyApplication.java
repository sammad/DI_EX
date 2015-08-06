package com.di.examples.dependencyinjection.legacyemailservice;

public class LegacyApplication {

	public void processMessages(String msg, String rec){
		LegacyEmailService email = new LegacyEmailService();
		ExchangeServer exchangeServer = ExchangeServer.getInstance();
		
		//do some msg validation, manipulation logic etc
		email.sendEmail(msg, rec,exchangeServer);
	}

}
