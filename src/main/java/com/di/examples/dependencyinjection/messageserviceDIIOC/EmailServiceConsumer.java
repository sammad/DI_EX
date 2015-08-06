package com.di.examples.dependencyinjection.messageserviceDIIOC;

import com.google.inject.Inject;

public class EmailServiceConsumer implements MessageServiceConsumer{
	private EmailService emailService;
	
	@Inject
	public EmailServiceConsumer(EmailService paramEmailService){
		this.emailService = paramEmailService;
	}
	public boolean processMessage(String msg, String rec){
		boolean messageSent = Boolean.FALSE;
		//do some msg validation, manipulation logic etc
		if(rec.indexOf("@")>-1){
			emailService.sendMessage(msg, rec);
			messageSent =Boolean.TRUE;
		}
		return messageSent;
	}

}
