package com.di.examples.dependencyinjection.messageserviceDICompatible;

public class SMSServiceConsumer implements MessageServiceConsumer{
	private SMSService smsService;
	
	public SMSServiceConsumer(SMSService paramEmailService){
		this.smsService = paramEmailService;
	}
	public void processMessage(String msg, String rec){
		//do some msg validation, manipulation logic etc
		smsService.sendMessage(msg, rec);
	}

}
