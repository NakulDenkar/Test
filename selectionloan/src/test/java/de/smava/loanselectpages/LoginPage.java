package de.smava.loanselectpages;

import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver = null;

	@FindBy(id = "applicant0.loginForm.email")
	private WebElement email;

	@FindBy(id = "applicant0.loginForm.password")
	private WebElement password;

	@FindBy(xpath = ".//button[@class='button login-form__submit']")
	private WebElement SignIN;
	
	/*
	 * Normally we would also define all other variables/elements in the LoginPage
	 * in the actual organization project
	 * 
	 * Not defining those for this test project(considering time constraints and relevance)
	 * 
	 */
	

	public void Login() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid email");
		String emailtext = sc.next();

		while (!(emailtext.contains("@") 
				&& 
				(emailtext.contains("yahoo.com") || emailtext.contains("yahoo.de") || (emailtext.contains("gmail.com") || emailtext.contains("gmail.de"))))) 
		{
			System.out.println("Enter the valid email address with @   yahoo,gmail etc  example john.smith@gmail.com");
			emailtext = sc.next();
		}

		String enteredemail = emailtext;
		String pass;
		String passw = "null";

		if (enteredemail.contains("@")) {
			System.out.println("Enter your password");
			pass = sc.next();
			passw = pass;
		}
		
		sc.close();

		email.sendKeys(enteredemail);
		password.sendKeys(passw);
		SignIN.click();

		if (driver.getPageSource().contains("Ihre Benutzername oder Passwort ist falsch")) {
			System.out.println("Your Login is incorrect i.e  Ihre Benutzername oder Passwort ist falsch");
		} else {
			System.out.println("You have logged in successfully");
		}
		/*
		 * Normally we would also define all other methods/functions in the LoginPage
		 * in the actual organization project
		 * 
		 * Not defining those for this test project(considering time constraints and
		 * relevance)
		 * 
		 */

	}
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
