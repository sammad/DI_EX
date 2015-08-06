package com.di.examples.dependencyinjection.messageserviceDIIOC;

import com.google.inject.AbstractModule;

public class DIModule extends AbstractModule {

	@Override
	protected void configure() {
		ExchangeServer exchangeServer = ExchangeServer.getInstance();
		bind(ExchangeServer.class).toInstance(exchangeServer);
	}

}
