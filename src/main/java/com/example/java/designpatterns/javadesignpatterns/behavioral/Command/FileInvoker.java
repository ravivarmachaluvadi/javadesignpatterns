package com.example.java.designpatterns.javadesignpatterns.behavioral.Command;

public class FileInvoker {

	public Command command;
	
	public FileInvoker(Command c){
		this.command=c;
	}
	
	public void execute(){
		this.command.execute();
	}
}