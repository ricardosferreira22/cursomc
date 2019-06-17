package com.ricardoferreira.cursomc.services.exceptions;

public class objectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public objectNotFoundException(String msg) {
		super(msg);
	}
	public objectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
