package com.example.java.designpatterns.javadesignpatterns.behavioral.DependencyInjection;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}