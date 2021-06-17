package com.bridgelabz.user_registration_programs;

import java.util.ArrayList;
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
	public static boolean isvalidemail(String email) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid email address
		String  regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";	
		p = Pattern.compile(regex);
		m = p.matcher(email);
		return m.matches();
	}
	
	// UC4 Method to validate the mobile number
	public boolean isvalidmobileno(String mobileno) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid mobile number
		String  regex = "(0|91)?\\s([7-9][0-9]{9})";
		p = Pattern.compile(regex);
		m = p.matcher(mobileno);
		return m.matches();
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
		Pattern p;
		Matcher m;
		//Regex to check valid password
		String  regex = "^[a-zA-Z0-9]+[@#$%&*_+=!?]{0,8}$";
		p = Pattern.compile(regex);
		m = p.matcher(password);
		return m.matches();
	}
	
	// UC9 Method to validate all the types of email
	public static void emailslist(String email) 
	{
		
			ArrayList<String> arr = new ArrayList<String>();
			arr.add(email);
			for (int i=0;i<arr.size();i++) 
			{
				System.out.println(arr.get(i)+":"+isvalidemail(arr.get(i)));
			}
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
		
		// 8 valid emails
		
		emailslist("abc@yahoo.com");
		emailslist("abc-100@yahoo.com");
		emailslist("abc.100@yahoo.com");
		emailslist("abc111@abc.com");
		emailslist("abc-100@abc.net");
		emailslist("abc.100@abc.com.au");
		emailslist("abc@1.com");
		emailslist("abc@gmail.com.com");
		emailslist("abc+100@gmail.com");
        
		// 12 invalid emails
		emailslist("abc@.com.my");
		emailslist("abc123@gmail.a");
		emailslist("abc123@.com");
		emailslist("abc123@.com.com");
		emailslist(".abc@abc.com");
		emailslist("abc()*@gmail.com");
		emailslist("abc@%*.com");
		emailslist("abc..2002@gmail.com");
		emailslist("abc.@gmail.com");
		emailslist("abc@abc@gmail.com");
		emailslist("abc@gmail.com.1a");
		emailslist("abc@gmail.com.aa.au");
	}

}
