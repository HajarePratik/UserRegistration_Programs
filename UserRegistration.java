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
		
		
		
	}

}
