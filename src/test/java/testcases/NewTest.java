package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import base.TestBase;

public class NewTest extends TestBase{
  @Test
  public void f() throws IOException {
	  
	  LoginPage lPage;
		HomePage hPage;
		ContactsPage cPage;
		
	  initialization();
	  lPage= new LoginPage();
		lPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
	driver.findElement(By.xpath("//input[@name='cs_name' and @type='text']")).sendKeys("Kumar");

		
  }
}
