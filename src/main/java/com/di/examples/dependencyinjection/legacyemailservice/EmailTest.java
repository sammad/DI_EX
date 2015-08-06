package com.di.examples.dependencyinjection.legacyemailservice;

public class EmailTest {

	public static void main(String... args) {
		LegacyApplication legacyApplication = new LegacyApplication();
		legacyApplication.processMessages("Hi there", "madhurs@tpt.com");
	}

}
