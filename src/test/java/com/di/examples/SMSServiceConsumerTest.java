package com.di.examples;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.di.examples.dependencyinjection.messageserviceDIIOC.MessageServiceConsumer;
import com.di.examples.dependencyinjection.messageserviceDIIOC.SMSServiceConsumer;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class SMSServiceConsumerTest extends TestCase{

	private Injector testInjector;
	private Module serviceTestModule; 

	@Before
	public void setUp() throws Exception {
		serviceTestModule = new ServiceTestModule();
		testInjector= Guice.createInjector(serviceTestModule);
	}

	@After
	public void tearDown() throws Exception {
		serviceTestModule=null;
		testInjector =null;
	}

	@Test
	public void test() {
		MessageServiceConsumer serviceConsumer = testInjector.getInstance(SMSServiceConsumer.class);
		testIfMessageSentIsSuccessfulToMobileNumber(serviceConsumer);
		testMessageSentFailsWhenMobileNumberIsNotValid(serviceConsumer);
	}

	private void testMessageSentFailsWhenMobileNumberIsNotValid(MessageServiceConsumer serviceConsumer) {
		assertFalse(serviceConsumer.processMessage("TestingService", "987654"));

	}

	private void testIfMessageSentIsSuccessfulToMobileNumber(MessageServiceConsumer serviceConsumer) {
		assertTrue(serviceConsumer.processMessage("TestingService", "9812121212"));

	}

}
