package com.bridgelabz.user_registration_programs;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	 // Test 1 : First name starts with capital letter and has minimum 3 characters with Happy and Sad Test
	 @Test
	 public void givenFirstName_WhenProper_ShouldReturnHappy()
	 {
	        UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String firstname = user.isvalidfirstname("Pratik");
	        Assert.assertEquals("HAPPY", firstname);
	 }

	 @Test
	 public void givenFirstName_WhenNotProper_ShouldReturnSad()
	 {
	    	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String firstname = user.isvalidfirstname("pra");
	        Assert.assertEquals("SAD", firstname);
	 }

	 // Test 2 : Last name starts with capital letter and has minimum 3 characters with Happy and Sad Test
	 @Test
	 public void givenLastName_WhenProper_ShouldReturnHappy()
	 {
		 	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String lastname = user.isvalidlastname("Hajare");
	        Assert.assertEquals("HAPPY", lastname);
	 }

	 @Test
	 public void givenLastName_WhenNotProper_ShouldReturnSad()
	 {
		 	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String lastname = user.isvalidlastname("haj");
	        Assert.assertEquals("SAD", lastname);
	 }
	
	 // Test 3 : Testing Email Address with Happy and Sad Test
	 @Test
	 public void givenEmailId_WhenProper_ShouldReturnHappy()
	 {
		 	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String emailId = user.isvalidemail("pratikhajare09@gmail.com");
	        Assert.assertEquals("HAPPY", emailId);
	 }

	 @Test
	 public void givenEmailId_WhenNotProper_ShouldReturnSad()
	 {
		 	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String emailId = user.isvalidemail("pratikhajare09@gmail.com.yahoo");
	        Assert.assertEquals("SAD", emailId);
	 }
	
	 // Test 4 : Testing Mobile No. with Happy and Sad Test
	 @Test
	 public void givenMobileNo_WhenProper_ShouldReturnHappy()
	 {
		 	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String mobileNo = user.isvalidmobileno("91 9850962452");
	        Assert.assertEquals("HAPPY", mobileNo);
	 }

	 @Test
	 public void givenMobileNo_WhenNotProper_ShouldReturnSad()
	 {
		 	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String mobileNo = user.isvalidmobileno("919850962452");
	        Assert.assertEquals("SAD", mobileNo);
	 }
	
	 // Test 5 : Testing Password with Happy and Sad Test
	 @Test
	 public void givenPasswordShouldHaveAtLeastOne_SpecialCharacter_ThenReturnHappy()
	 {
		 	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String password = user.isvalidpassword("paT09@#&");
	        Assert.assertEquals("HAPPY", password);
	 }

	 @Test
	 public void givenPasswordShouldHaveAtLeastOne_SpecialCharacter_OtherwiseReturnSad()
	 {
		 	UserRegistrationForTestcase user = new UserRegistrationForTestcase();
	        String password = user.isvalidpassword("pra@");
	        Assert.assertEquals("SAD", password);
	 }
	
}
