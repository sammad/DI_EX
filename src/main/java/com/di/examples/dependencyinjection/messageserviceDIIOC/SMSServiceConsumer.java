package com.di.examples.dependencyinjection.messageserviceDIIOC;

import com.google.inject.Inject;

public class SMSServiceConsumer implements MessageServiceConsumer{
	private SMSService smsService;
	
	@Inject
	public SMSServiceConsumer(SMSService paramEmailService){
		this.smsService = paramEmailService;
	}
	public boolean processMessage(String msg, String rec){
		boolean messageSent = Boolean.FALSE;
		//do some msg validation, manipulation logic etc
		if(rec.length()==10){
			smsService.sendMessage(msg, rec);
			messageSent=Boolean.TRUE;
		}
		
		return messageSent;
	}

}
