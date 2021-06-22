package com.bridgelabz.user_registration_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForTestcase {
	
	static Pattern pattern;
	static Matcher match;
	// UC1 Method to validate the firstname
	public boolean isvalidfirstname(String firstname) 
	{
		//Regex to check valid firstname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(firstname);
		return match.matches();
	}
	
	// UC2 Method to validate the lastname
	public boolean isvalidlastname(String lastname) 
	{
		//Regex to check valid lastname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(lastname);
		return match.matches();
	}
	
	// UC3 Method to validate the email address
	public static boolean isvalidemail(String email) 
	{
		//Regex to check valid email address
		String  regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";	
		pattern = Pattern.compile(regex);
		match = pattern.matcher(email);
		return match.matches();
	}
	
	// UC4 Method to validate the mobile number
	public static boolean isvalidmobileno(String mobileno) 
	{
		//Regex to check valid mobile number
		String  regex = "(0|91)?\\s([7-9][0-9]{9})";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(mobileno);
		return match.matches();
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
	public boolean isvalidpassword(String password) 
	{
		//Regex to check valid password
		String  regex = "^[a-zA-Z0-9]+[@#$%&*_+=!?]{0,8}$";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(password);
		return match.matches();
	}
}
