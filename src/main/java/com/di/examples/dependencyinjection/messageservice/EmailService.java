package com.di.examples.dependencyinjection.messageservice;

public class EmailService implements MessageService{
	private ExchangeServer exchangeServer = ExchangeServer.getInstance();
	public void sendMessage(String message, String receiver){
		exchangeServer.init();
		exchangeServer.synchEmails();
		//logic to send email
		System.out.println("Email sent to "+receiver+ " with Message="+message);
	}

}
