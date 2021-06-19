package com.bridgelabz.user_registration_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	Pattern pattern;
	Matcher match;
	
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
	public boolean isvalidemail(String email) 
	{
		//Regex to check valid email address
		String  regex = "^([a-zA-Z0-9.])+([0-9a-zA-Z]{0,1}+@([a-zA-Z0-9.])+[a-zA-Z]{2,3})+([a-z]{0,2}){0,1}$";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(email);
		return match.matches();
	}
	
	// UC4 Method to validate the mobile number
	public boolean isvalidmobileno(String mobileno) 
	{
		//Regex to check valid mobile number
		String  regex = "[9]{1}[1]{1}\\s([7-9][0-9]{9})";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(mobileno);
		return match.matches();
	}
	
	/* 
	 * UC5 Method to validate the password :
	 * Rule 1 : should have atleast 8 characters
	 */
	public boolean isvalidpassword(String password) 
	{
		//Regex to check valid mobile number
		String  regex = "^[a-z]{8}$";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(password);
		return match.matches();
	}
	public static void main(String[] args) 
	{
		
		UserRegistration user = new UserRegistration();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a First Name :");
		String firstname = sc.nextLine();
		
		System.out.println("Given First Name is :"+user.isvalidfirstname(firstname));
		
		System.out.println("Enter a Last Name :");
		String lastname = sc.nextLine();
		
		System.out.println("Given Last Name is :"+user.isvalidlastname(lastname));
		
		System.out.println("Enter a Email Address :");
		String email = sc.nextLine();
		
		System.out.println("Given Email Address is :"+user.isvalidemail(email));
		
		
		System.out.println("Enter a Mobile No :");
		String mobileno = sc.nextLine();
		
		System.out.println("Given Mobile No is :"+user.isvalidmobileno(mobileno));
		
		System.out.println("Enter a Password :");
		String password = sc.nextLine();
		
		System.out.println("Given Passsword is :"+user.isvalidpassword(password));
		
	}

}
