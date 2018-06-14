package de.smava.loanselectpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Person {

	private WebDriver driver = null;

	@FindBy(xpath = ".//span[@class='login-form__link']")
	private WebElement LogIN;

	/*
	 * Normally we would also define all other variables/elements in the Person home
	 * page in the actual organization project
	 * 
	 * Not defining those for this test project(considering time constraints and
	 * relevance)
	 * 
	 */

	public LoginPage LogINClick() {
		LogIN.click();// Pressing Login hyperlink on Kreditanfrage2 Person
		
		LoginPage lpage=new LoginPage(driver);
		return lpage;
	}

	/*
	 * Normally we would also define all other methods/functions in the Person
	 * page in the actual organization project
	 * 
	 * Not defining those for this test project(considering time constraints and
	 * relevance)
	 * 
	 */
	
	public Person(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
