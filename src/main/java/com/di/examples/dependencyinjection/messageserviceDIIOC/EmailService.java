package com.di.examples.dependencyinjection.messageserviceDIIOC;

import com.google.inject.Inject;

public class EmailService implements MessageService{
	private ExchangeServer exchangeServer ;
	
	@Inject
	public EmailService(ExchangeServer paramExchangeServer){
		this.exchangeServer =paramExchangeServer;
	}
	public void sendMessage(String message, String receiver){
		exchangeServer.init();
		exchangeServer.synchEmails();
		//logic to send email
		System.out.println("Email sent to "+receiver+ " with Message="+message);
	}

}
