package com.di.examples;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.di.examples.dependencyinjection.messageserviceDIIOC.EmailServiceConsumer;
import com.di.examples.dependencyinjection.messageserviceDIIOC.MessageServiceConsumer;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class EmailServiceConsumerTest extends TestCase{

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
		
	}

	@Test
	public void testMessageSentFailsWhenEmailIdIsNotValid() {
		MessageServiceConsumer serviceConsumer = testInjector.getInstance(EmailServiceConsumer.class);
		assertFalse(serviceConsumer.processMessage("TestingService", "Pankaj.soni#sony.com"));

	}

	@Test
	public void testIfMessageSentIsSuccessfulToValidEmailId() {
		MessageServiceConsumer serviceConsumer = testInjector.getInstance(EmailServiceConsumer.class);
		assertTrue(serviceConsumer.processMessage("TestingService", "Pankaj.soni@sony.com"));

	}

}
