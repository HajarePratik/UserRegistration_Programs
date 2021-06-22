package com.bridgelabz.user_registration_programs;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametersEmailTest 
{
	
	private String email;
	private boolean isEmailValid;
	private UserRegistrationForTestcase emailProgram = null;
	
	// initiallize the email program
	@Before
	public void initialize() 
	{
			emailProgram = new UserRegistrationForTestcase();
	}
	
	public ParametersEmailTest(String email, boolean isEmailValid) 
	{
		super();
		this.email = email;
		this.isEmailValid = isEmailValid;
	}
	
	// create a array for all emails
	@Parameterized.Parameters
	public static Collection input() 
	{
		return Arrays.asList(new Object[][] { 
			
			 {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true},
             {"abc111@abc.com", true}, {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true},
             {"abc@1.com", true}, {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true},
             {"abc.@gmail.com", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false},
             {"abc123@.com", false}, {"abc123@.com.com", false}, {".abc@abc.com", false},
             {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"abc..2002@gmail.com", false},
             {"abc.@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}}
		);
	}
	
	// check all email address with one test case 
	@Test
	public void email_shouldReturnValidInvalid() 
	{
		System.out.println("Is the emails: " + isEmailValid);
		Assert.assertEquals(isEmailValid, emailProgram.isvalidemail(email));
	}
	
}
