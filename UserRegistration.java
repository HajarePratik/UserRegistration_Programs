package com.bridgelabz.user_registration_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	
	// UC1 Method to validate the firstname
	public boolean isvalidfirstname(String firstname) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid firstname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		p = Pattern.compile(regex);
		m = p.matcher(firstname);
		return m.matches();
	}
	
	// UC2 Method to validate the lastname
	public boolean isvalidlastname(String lastname) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid lastname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		p = Pattern.compile(regex);
		m = p.matcher(lastname);
		return m.matches();
	}
	// UC3 Method to validate the email address
	public boolean isvalidemail(String email) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid email address
		String  regex = "^([a-zA-Z0-9.])+([0-9a-zA-Z]{0,1}+@([a-zA-Z0-9.])+[a-zA-Z]{2,3})+([a-z]{0,2}){0,1}$";
		p = Pattern.compile(regex);
		m = p.matcher(email);
		return m.matches();
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
		
		
		
	}

}
