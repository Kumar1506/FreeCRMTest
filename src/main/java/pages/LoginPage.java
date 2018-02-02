package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{


	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	public HomePage login(String un, String pwd)
	{
		System.out.println("in login");
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		loginButton.submit();
		return new HomePage();
	}
	
	public String getLoginPageTitle(){
		return driver.getTitle();
	}

	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	//	System.out.println("in initelements");
	}
	
}
