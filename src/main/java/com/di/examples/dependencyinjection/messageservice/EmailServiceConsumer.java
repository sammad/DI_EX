package com.di.examples.dependencyinjection.messageservice;

public class EmailServiceConsumer implements MessageServiceConsumer{

	public void processMessage(String msg, String rec){
		EmailService email = new EmailService();
		
		//do some msg validation, manipulation logic etc
		email.sendMessage(msg, rec);
	}

}
