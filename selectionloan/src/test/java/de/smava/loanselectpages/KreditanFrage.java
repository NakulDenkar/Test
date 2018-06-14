package de.smava.loanselectpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KreditanFrage {

	private WebDriver driver = null;
	
	@FindBy(xpath="//*[@id='cta_btn_0']")
	private WebElement Nextbutton;
	
	
	/*
	 * Normally we would also define all other variables/elements in the KreditanFrage page
	 * in the actual organization project
	 * 
	 * Not defining those for this test project(considering time constraints and relevance)
	 * 
	 */
	
	
	public Person KreditanFrageNextbuttonClick()
	{
		Nextbutton.click(); //Pressing weiter (forward) for Kredit2Day
		
		Person pson=new Person(driver);
		return pson;
	}
	
	/*
	 * Normally we would also define all other methods/functions in the KreditanFrage
	 * page in the actual organization project
	 * 
	 * Not defining those for this test project(considering time constraints and
	 * relevance)
	 * 
	 */
	public KreditanFrage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
