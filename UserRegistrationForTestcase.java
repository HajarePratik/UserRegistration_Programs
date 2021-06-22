package com.bridgelabz.user_registration_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForTestcase
{
	
	// UC1 Method to validate the firstname
	public boolean isvalidfirstname(String name) throws UserRegistrationExceptions 
	{
		//Regex to check valid first name
		String pattern = "(^[A-Z])[A-Za-z]{2,}$";
		boolean match = regexMatch(name, pattern);
		
		if (match == false) 
		{
			throw new UserRegistrationExceptions(UserRegistrationExceptions.ExceptionType.NAME_INVALID, "Enter proper first name");
		} 
		return match;
	}
	
	// UC2 Method to validate the lastname
	public boolean isvalidlastname(String name) throws UserRegistrationExceptions 
	{
		//Regex to check valid last name
		String pattern = "(^[A-Z])[A-Za-z]{2,}$";
		boolean match = regexMatch(name, pattern);
		
		if (match == false) 
		{
			throw new UserRegistrationExceptions(UserRegistrationExceptions.ExceptionType.NAME_INVALID, "Enter proper last name");
		} 
		return match;
	}
	
	// UC3 Method to validate the email address
	public boolean isvalidemail(String email) throws UserRegistrationExceptions 
	{
		//Regex to check valid email address
		String  pattern = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";	
		boolean match = regexMatch(email, pattern);
		
		if (match == false) 
		{
			throw new UserRegistrationExceptions(UserRegistrationExceptions.ExceptionType.EMAIL_INVALID, "Enter proper email");
		} 
		return match;
	}
	
	// UC4 Method to validate the mobile number
	public boolean isvalidmobileno(String mobileno) throws UserRegistrationExceptions
	{
		//Regex to check valid mobile number
		String  pattern = "[9]{1}[1]{1}\\s([7-9][0-9]{9})";
		boolean match = regexMatch(mobileno, pattern);
		if (match == false) 
		{
			throw new UserRegistrationExceptions(UserRegistrationExceptions.ExceptionType.MOBILE_NO_INVALID, "Enter proper mobile no.");
		} 
		return match;
	}
	
	/* 
	 * UC5 Method to validate the password :
	 * Rule 1 : should have atleast 8 characters
	 * 
	 * UC6 Rule 2 : should have atleast one uppercase letter
	 * 
	 * UC7 Rule 3 : should have atleast one number
	 * 
	 * UC8 Rule 4 : should have atleast one special character
	 */
	public boolean isvalidpassword(String password) throws UserRegistrationExceptions
	{
		//Regex to check valid password
		String  pattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,12}$";
		boolean match = regexMatch(password, pattern);
		if (match == false) 
		{
			throw new UserRegistrationExceptions(UserRegistrationExceptions.ExceptionType.PASSWORD_INVALID, "Enter proper password");
		} 
		return match;
	}
	
	public static boolean regexMatch(String matchContent, String patternString)
	{  	
		Pattern pattern = Pattern.compile(patternString);
	    Matcher match = pattern.matcher(matchContent);
	    boolean isMatch = match.find();		   
		return isMatch;
	}
}
