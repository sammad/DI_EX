package com.di.examples.dependencyinjection.messageserviceDICompatible;

public class EmailService implements MessageService{
	private ExchangeServer exchangeServer ;
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
