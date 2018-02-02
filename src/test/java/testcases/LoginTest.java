package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import base.TestBase;

public class LoginTest extends TestBase{
	
	LoginPage lPage;
	
	public LoginTest() throws IOException {
		super();
	}


	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		lPage= new LoginPage();
	}
	
	/*
	@Test
	public void verifyLoginPageTitle(){
		String title=lPage.getLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}*/
	
	
	
  @Test
  public HomePage loginTest() {  
   // System.out.println("creating object");
	  lPage.login(prop.getProperty("username"), prop.getProperty("password"));
	  return new HomePage();
   // System.out.println("in @Test");
  }
  
  @AfterMethod
  public void teardown(){
	  driver.quit();
  }
}
