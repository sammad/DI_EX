package com.di.examples.dependencyinjection.messageservice;

public class MessageTest {

	public static void main(String... args) {
		MessageServiceConsumer serviceConsumer = new EmailServiceConsumer();
		serviceConsumer.processMessage("Hi there", "madhurs@tpt.com");
	}

}
