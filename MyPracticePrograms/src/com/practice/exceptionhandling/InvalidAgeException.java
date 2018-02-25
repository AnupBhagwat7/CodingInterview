package com.practice.exceptionhandling;

public class InvalidAgeException extends Exception {

	InvalidAgeException(String message) {
		super(message);
	}
}