package com.di.examples.dependencyinjection.messageservice;

public interface MessageServiceConsumer {

	public void processMessage(String message, String receiver);
}
