package com.example.java.designpatterns.javadesignpatterns.structural.Composite;

public class Circle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color "+fillColor);
	}

}