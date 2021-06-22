package com.bridgelabz.user_registration_programs;

public class UserRegistrationExceptions extends Exception {
	
	private static final long serialVersionUID = 1L;

	enum ExceptionType 
	{
		ENTERED_NULL, ENTERED_EMPTY, NAME_INVALID, 
		EMAIL_INVALID, MOBILE_NO_INVALID, PASSWORD_INVALID
	}
	ExceptionType exceptionType;
	
	public UserRegistrationExceptions(ExceptionType exceptionType,  String message) {
		super(message);
		this.exceptionType = exceptionType;
	}
	
}
