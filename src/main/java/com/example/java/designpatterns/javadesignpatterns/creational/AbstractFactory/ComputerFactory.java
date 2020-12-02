package com.example.java.designpatterns.javadesignpatterns.creational.AbstractFactory;

import com.example.java.designpatterns.javadesignpatterns.creational.factory.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}