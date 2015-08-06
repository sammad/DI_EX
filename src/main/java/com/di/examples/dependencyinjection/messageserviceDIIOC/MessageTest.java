package com.di.examples.dependencyinjection.messageserviceDIIOC;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MessageTest {

	public static void main(String... args) {
		Injector injector = Guice.createInjector(new DIModule());
		//Sending Email
		MessageServiceConsumer emailServiceConsumer = injector.getInstance(EmailServiceConsumer.class);//new EmailServiceConsumer(new EmailService(ExchangeServer.getInstance()));
		emailServiceConsumer.processMessage("Hi there", "madhurs@tpt.com");
		System.out.println();
		//Sending SMS
		MessageServiceConsumer smsServiceConsumer = injector.getInstance(SMSServiceConsumer.class);//new SMSServiceConsumer(new SMSService());
		smsServiceConsumer.processMessage("Hey!! U There", "9765123459");
	}
}
