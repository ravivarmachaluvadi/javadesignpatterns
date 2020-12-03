package com.example.java.designpatterns.javadesignpatterns.behavioral.Visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}