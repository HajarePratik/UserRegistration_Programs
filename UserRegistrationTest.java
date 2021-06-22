package com.bridgelabz.user_registration_programs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistrationForTestcase user = null;
	
	@Before
	public void initialize() 
	{
		user = new UserRegistrationForTestcase();
	}
	
	// Test 1 : First name starts with capital letter and has minimum 3 characters with Try and Catch
	@Test
    public void firstName_whenValid_returnValid()
	{
    	boolean firstname;
		try 
		{
			 firstname = user.isvalidfirstname("Pratik");
			 Assert.assertEquals(true, firstname);
		}
		catch (UserRegistrationExceptions e) 
		{
			System.out.println(e.exceptionType);
		}
    }
    
    @Test
    public void firstName_whenInValid_returnInValid()
    {
    	boolean firstname;
		try 
		{
			firstname = user.isvalidfirstname("pra");
		} 
		catch (UserRegistrationExceptions e) 
		{
			System.out.println(e.getMessage() + " " + e.exceptionType);
			Assert.assertEquals(UserRegistrationExceptions.ExceptionType.NAME_INVALID, e.exceptionType);
		}
    } 

	// Test 2 : Last name starts with capital letter and has minimum 3 characters with Try and Catch
    @Test
    public void lastName_whenValid_returnValid()
	{
    	boolean lastname;
		try 
		{
			 lastname = user.isvalidlastname("Hajare");
			 Assert.assertEquals(true, lastname);
		}
		catch (UserRegistrationExceptions e) 
		{
			System.out.println(e.exceptionType);
		}
    }
    
    @Test
    public void lastName_whenInValid_returnInValid()
    {
    	boolean lastname;
		try 
		{
			lastname = user.isvalidlastname("haj");
		} 
		catch (UserRegistrationExceptions e) 
		{
			System.out.println(e.getMessage() + " " + e.exceptionType);
			Assert.assertEquals(UserRegistrationExceptions.ExceptionType.NAME_INVALID, e.exceptionType);
		}
    } 
	
	// Test 3 : Testing Email Address with Try and Catch
    @Test
    public void email_whenValid_returnValid() 
    {
    	boolean email;
		try 
		{
			email = user.isvalidemail("pratikhajare09@gmail.com");
	        Assert.assertEquals(true, email);
		} 
		catch (UserRegistrationExceptions e)
		{
			System.out.println(e.getMessage() + " " + e.exceptionType);
		}
    } 
    
    @Test
    public void email_whenInValid_returnInValid() 
    {
    	boolean email;
		try 
		{
			email = user.isvalidemail("pratik.co.in");
		} 
		catch (UserRegistrationExceptions e) 
		{
			System.out.println(e.getMessage() + " " + e.exceptionType);
			Assert.assertEquals(UserRegistrationExceptions.ExceptionType.EMAIL_INVALID, e.exceptionType);
		}
    }
	
	// Test 4 : Testing Mobile No. with Try and Catch
    @Test
    public void mobileNo_whenValid_returnValid() 
    {
    	boolean mobileno;
		try 
		{
			mobileno = user.isvalidmobileno("91 9850962452");
			Assert.assertEquals(true, mobileno);
		} 
		catch (UserRegistrationExceptions e)
		{
			System.out.println(e.getMessage() + " " + e.exceptionType);
		}
    }
    
    @Test
    public void mobileNo_whenNoSpace_returnInValid() 
    {
    	boolean mobileno;
		try 
		{
			mobileno = user.isvalidmobileno("919850962452");
		} 
		catch (UserRegistrationExceptions e) 
		{
			System.out.println(e.getMessage() + " " + e.exceptionType);
			Assert.assertEquals(UserRegistrationExceptions.ExceptionType.MOBILE_NO_INVALID, e.exceptionType);
		}
    	
    }
	
	 // Test 5 : Testing Password with Try and Catch
    @Test
    public void password_whenLengthEightAUpperCaseANumber_returnValid() 
    {
    	boolean password;
		try 
		{
			password = user.isvalidpassword("Pratik@0907");
	    	Assert.assertEquals(true, password);
		} 
		catch (UserRegistrationExceptions e) 
		{
			System.out.println(e.getMessage() + " " + e.exceptionType);
		}
    }
    
    @Test
    public void password_whenNoUpperCase_returnInValid() 
    {
    	boolean password;
		try 
		{
			password = user.isvalidpassword("0907*@pratik");
		} 
		catch (UserRegistrationExceptions e) 
		{
			System.out.println(e.getMessage() + " " + e.exceptionType);
			Assert.assertEquals(UserRegistrationExceptions.ExceptionType.PASSWORD_INVALID, e.exceptionType);
		}
    }
	
}
