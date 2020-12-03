package com.example.java.designpatterns.javadesignpatterns.behavioral.DependencyInjection;

public class EmailService {

	public void sendEmail(String message, String receiver){
		//logic to send email
		System.out.println("Email sent to "+receiver+ " with Message="+message);
	}
}