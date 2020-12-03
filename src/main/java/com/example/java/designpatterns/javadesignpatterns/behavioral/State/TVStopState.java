package com.example.java.designpatterns.javadesignpatterns.behavioral.State;

public class TVStopState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}

}