package com.di.examples;

import com.di.examples.dependencyinjection.messageserviceDIIOC.ExchangeServer;
import com.google.inject.AbstractModule;

public class ServiceTestModule extends AbstractModule{

	@Override
	protected void configure() {
		ExchangeServer exchangeServer = ExchangeServer.getInstance();
		bind(ExchangeServer.class).toInstance(exchangeServer);
	}
}
