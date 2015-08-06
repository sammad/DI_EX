package com.di.examples.dependencyinjection.messageserviceDICompatible;

public class SMSService implements MessageService{
	
	public void sendMessage(String message, String receiver){
		//logic to send SMS
		System.out.println("SMS sent to "+receiver+ " with Message="+message);
	}

}
