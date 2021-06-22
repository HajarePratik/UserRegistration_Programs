package com.bridgelabz.user_registration_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForTestcase {
	
	// UC1 Method to validate the firstname
	public String isvalidfirstname(String firstname) 
	{
		//Regex to check valid firstname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		if (firstname.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
	
	// UC2 Method to validate the lastname
	public String isvalidlastname(String lastname) 
	{
		//Regex to check valid lastname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		if (lastname.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
	
	// UC3 Method to validate the email address
	public String isvalidemail(String email) 
	{
		//Regex to check valid email address
		String  regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";	
		if (email.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
	
	// UC4 Method to validate the mobile number
	public String isvalidmobileno(String mobileno) 
	{
		//Regex to check valid mobile number
		String  regex = "[9]{1}[1]{1}\\s([7-9][0-9]{9})";
		if (mobileno.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
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
	public String isvalidpassword(String password) 
	{
		//Regex to check valid password
		String  regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,12}$";
		if (password.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
	}
}
