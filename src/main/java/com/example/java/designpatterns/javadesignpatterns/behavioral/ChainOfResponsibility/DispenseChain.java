package com.example.java.designpatterns.javadesignpatterns.behavioral.ChainOfResponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}