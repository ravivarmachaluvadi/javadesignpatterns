package com.example.java.designpatterns.javadesignpatterns.behavioral.Mediator;

public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}