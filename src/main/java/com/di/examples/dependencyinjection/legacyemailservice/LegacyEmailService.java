package com.di.examples.dependencyinjection.legacyemailservice;

public class LegacyEmailService {

	public void sendEmail(String message, String receiver,ExchangeServer exchangeServer){
		exchangeServer.init();
		exchangeServer.synchEmails();
		//logic to send email
		System.out.println("Email sent to "+receiver+ " with Message="+message);
	}

}
