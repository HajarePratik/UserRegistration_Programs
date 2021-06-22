package com.bridgelabz.user_registration_programs;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	
	// Test 1 : First name starts with capital letter and has minimum 3 characters
	@Test
	public void Testing_validatefirstname() 
	{
		UserRegistrationForTestcase firstname = new UserRegistrationForTestcase();
		boolean result = firstname.isvalidfirstname("Pratik");
		Assert.assertEquals(true, result);
	}

	// Test 2 : Last name starts with capital letter and has minimum 3 characters
	@Test
	public void Testing_validatelastname() 
	{
		UserRegistrationForTestcase lastname = new UserRegistrationForTestcase();
		boolean result = lastname.isvalidlastname("Hajare");
		Assert.assertEquals(true, result);
	}
	
	// Test 3 : Testing Email Address
	@Test
	public void Testing_validateemail() 
	{
		UserRegistrationForTestcase email = new UserRegistrationForTestcase();
		boolean result = UserRegistrationForTestcase.isvalidemail("pratikhajare09@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	// Test 4 : Testing Mobile No.
	@Test
	public void Testing_validatemobileno() 
	{
		UserRegistrationForTestcase mobileno = new UserRegistrationForTestcase();
		boolean result = UserRegistrationForTestcase.isvalidmobileno("91 9850962452");
		Assert.assertEquals(true, result);
	}
	
	// Test 5 : Testing Password, Rule 1 : should have atleast 8 characters
	@Test
	public void testValidPassword() {
		UserRegistrationForTestcase password = new UserRegistrationForTestcase();
		boolean result = password.isvalidpassword("pratik09");
		Assert.assertEquals(true, result);
	}

	//UC7 Rule 2 & 3 : should have atleast one number & should have atleast one uppercase letter
	@Test
	public void testValidPassword2() {
		UserRegistrationForTestcase password = new UserRegistrationForTestcase();
		boolean result = password.isvalidpassword("Pra09");
		Assert.assertEquals(true, result);
	}
	
	//UC8 Rule 4 : should have atleast one special character
	@Test
	public void testValidPassword3() {
		UserRegistrationForTestcase password = new UserRegistrationForTestcase();
		boolean result = password.isvalidpassword("prA09@$");
		Assert.assertEquals(true, result);
	}
	
	
}
