package com.example.java.designpatterns.javadesignpatterns.behavioral.Visitor;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}