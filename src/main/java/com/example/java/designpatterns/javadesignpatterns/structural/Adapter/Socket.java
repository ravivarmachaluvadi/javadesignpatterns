package com.example.java.designpatterns.javadesignpatterns.structural.Adapter;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}