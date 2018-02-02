package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import util.TestUtil;
import base.TestBase;

public class ContactPageTest extends TestBase{
	
	public ContactPageTest(){
		super();
	}
	
	LoginPage lPage;
	HomePage hPage;
	ContactsPage cPage= new ContactsPage();
	
	
	@BeforeMethod
	public void setup() throws IOException{
		initialization();
		lPage= new LoginPage();
		hPage=lPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("mainpanel");
		cPage=hPage.clickOnContactLink();
	}
	
	@Test
	public void validateCreateNewContact(){	
		hPage.clickOnNewContactLink();
		cPage.createNewContact("Mr.", "Bob1", "Marley1");
	}
	
	/*@Test
	public void validateAdvanceSearchInContactsPage(){	

		cPage.enterValuesInAdvanceSearch();
	}*/
	
	
	
	
}
