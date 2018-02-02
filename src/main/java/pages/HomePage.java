package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	public WebElement contactsLink;
	
	@FindBy(xpath="//td[contains(text(),'User: Kumar Swamy')]")
	public WebElement usernameText;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	public WebElement newContactLink; 
	
	@FindBy(name="mainpanel")
	public WebElement frameForContactsLink;
	
	
	public ContactsPage clickOnContactLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public ContactsPage clickOnNewContactLink(){
		Actions actions=new Actions(driver);
		actions.moveToElement(contactsLink).build().perform();;
		newContactLink.click();
		return new ContactsPage();
	}
	
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
}
