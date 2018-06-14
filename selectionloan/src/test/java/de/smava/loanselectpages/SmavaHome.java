package de.smava.loanselectpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmavaHome {
	
	private WebDriver driver = null;

	
	@FindBy(xpath="//*[@id='myselect']")
	private WebElement loan;
	
	@FindBy(xpath="//*[@id='myselect2']")
	private WebElement months;
	
	@FindBy(xpath="//*[@id='myselect3']")
	private WebElement wohnen;
	
	@FindBy(xpath="//*[@id='forwardButtonkredit2day']/button")
	private WebElement forwardButtonkredit2day;
	
	/*
	 * Normally we would also define all other variables/elements in the smava home page
	 * in the actual organization project
	 * 
	 * Not defining those for this test project(considering time constraints and relevance)
	 * 
	 */
	
	
	//1
	public void setLoan(String loanamount)
	{
		Actions actionloan = new Actions(driver);
		actionloan.moveToElement(loan);
		actionloan.click();
		
		
		actionloan.sendKeys(loanamount).build().perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actionloan.sendKeys(Keys.ENTER).build().perform();//Pressing enter after setting loan value example: 2750
		
	}
	
	//2
	public void setMonths(String totalmonths)
	{
		Actions actionmonths = new Actions(driver);
		actionmonths.moveToElement(months);
		actionmonths.click();
		
		
		actionmonths.sendKeys(totalmonths).build().perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actionmonths.sendKeys(Keys.ENTER).build().perform();//Pressing enter after setting months value example: 24
		
	}
	
	//3
	public void setUse(String purpose)
	{
		Actions actionUse = new Actions(driver);
		actionUse.moveToElement(wohnen);
		actionUse.click();
		
		
		actionUse.sendKeys(purpose).build().perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actionUse.sendKeys(Keys.ENTER).build().perform();//Pressing enter after setting Use Verwendung value example: wohnen
		
	}
	
	public KreditanFrage Kredit2DayForward()
	{
		forwardButtonkredit2day.click(); //Pressing weiter (forward) for Kredit2Day
		
		KreditanFrage kfrag=new KreditanFrage(driver);
		return kfrag;
	}
	
	
	/*
	 * Normally we would also define all other methods/functions in the smava home page
	 * in the actual organization project
	 * 
	 * Not defining those for this test project(considering time constraints and relevance)
	 * 
	 */
	
	public SmavaHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
