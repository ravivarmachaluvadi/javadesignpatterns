package com.example.java.designpatterns.javadesignpatterns.behavioral.DependencyInjection;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}