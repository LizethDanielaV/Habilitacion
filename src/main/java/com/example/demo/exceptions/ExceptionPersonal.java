package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;

public class ExceptionPersonal extends RuntimeException{
	
	private final HttpStatus status;
	
	 public ExceptionPersonal(String message, HttpStatus status) {
	        super(message);
	        this.status = status;
	   }
}
