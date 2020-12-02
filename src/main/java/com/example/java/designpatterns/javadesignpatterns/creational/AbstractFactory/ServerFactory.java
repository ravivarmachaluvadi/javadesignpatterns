package com.example.java.designpatterns.javadesignpatterns.creational.AbstractFactory;

import com.example.java.designpatterns.javadesignpatterns.creational.factory.Computer;
import com.example.java.designpatterns.javadesignpatterns.creational.factory.Server;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram,hdd,cpu);
	}

}