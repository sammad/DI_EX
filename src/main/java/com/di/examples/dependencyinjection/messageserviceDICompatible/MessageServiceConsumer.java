package com.di.examples.dependencyinjection.messageserviceDICompatible;

public interface MessageServiceConsumer {

	public void processMessage(String message, String receiver);
}
