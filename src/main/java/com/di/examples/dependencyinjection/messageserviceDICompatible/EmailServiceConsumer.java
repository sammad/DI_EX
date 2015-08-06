package com.di.examples.dependencyinjection.messageserviceDICompatible;

public class EmailServiceConsumer implements MessageServiceConsumer{
	private EmailService emailService;
	
	public EmailServiceConsumer(EmailService paramEmailService){
		this.emailService = paramEmailService;
	}
	public void processMessage(String msg, String rec){
		//do some msg validation, manipulation logic etc
		emailService.sendMessage(msg, rec);
	}

}
