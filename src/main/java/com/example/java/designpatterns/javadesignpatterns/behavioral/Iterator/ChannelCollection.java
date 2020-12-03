package com.example.java.designpatterns.javadesignpatterns.behavioral.Iterator;

public interface ChannelCollection {

	public void addChannel(Channel c);
	
	public void removeChannel(Channel c);
	
	public ChannelIterator iterator(ChannelTypeEnum type);
	
}