package com.Todo.demo.customException;

public class ResourceNotFoundException  extends RuntimeException{
	
	 public ResourceNotFoundException(String message) {
	        super(message);
	    }

}