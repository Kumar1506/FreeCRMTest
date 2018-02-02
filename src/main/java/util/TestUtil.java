package util;

import org.openqa.selenium.WebElement;

import base.TestBase;

public class TestUtil extends TestBase{

	public static void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}
	
	public static void switchBackFromFrame(){
		driver.switchTo().defaultContent();
	}
	
	public static void verifyPageTitle(){
		//driver.getTitle();
		System.out.println(driver.getTitle());
	}
}
