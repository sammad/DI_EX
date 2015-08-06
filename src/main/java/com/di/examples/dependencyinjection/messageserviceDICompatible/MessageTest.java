package com.di.examples.dependencyinjection.messageserviceDICompatible;

public class MessageTest {

	public static void main(String... args) {
		//Sending Email
		MessageServiceConsumer emailServiceConsumer = new EmailServiceConsumer(new EmailService(ExchangeServer.getInstance()));
		emailServiceConsumer.processMessage("Hi there", "madhurs@tpt.com");
		System.out.println();
		//Sending SMS
		MessageServiceConsumer smsServiceConsumer = new SMSServiceConsumer(new SMSService());
		smsServiceConsumer.processMessage("Hey!! U There", "976512345");
	}
}
