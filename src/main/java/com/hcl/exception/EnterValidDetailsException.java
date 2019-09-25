package com.hcl.exception;

public class EnterValidDetailsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EnterValidDetailsException(String message) {
		super(message);
	}
}
