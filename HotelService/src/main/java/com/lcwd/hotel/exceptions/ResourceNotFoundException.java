package com.lcwd.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException()
	{
		super("Resource Not found");
	}
	
	
	public ResourceNotFoundException(String s) {
		super(s);
	}
}
