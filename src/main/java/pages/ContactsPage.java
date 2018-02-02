package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(name="title")
	WebElement titleDropdown;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	@FindBy(xpath="//input[@name='cs_name' and @type='text']")
	public WebElement nameFieldInAdvanceFilter;
	
	public void createNewContact(String title, String fname, String lname){
		Select sel= new Select(titleDropdown);
		sel.selectByVisibleText(title);
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		saveBtn.click();
	}
	
	public void enterValuesInAdvanceSearch(){
		//Select sel= new Select(titleDropdown);
		//sel.selectByVisibleText(title);
		System.out.println("in advanced field");
		nameFieldInAdvanceFilter.sendKeys("Kumar");
		System.out.println("out of advanced field");
		
	}
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
