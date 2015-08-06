package com.di.examples.dependencyinjection.messageserviceDIIOC;

public interface MessageServiceConsumer {

	public boolean processMessage(String message, String receiver);
}
