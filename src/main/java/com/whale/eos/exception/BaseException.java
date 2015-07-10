package com.whale.eos.exception;

public class BaseException extends RuntimeException {
	public BaseException(String message, Throwable throwable) {
		super(message, throwable);
	}
}