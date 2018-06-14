package de.smava.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import de.smava.loanselectpages.KreditanFrage;
import de.smava.loanselectpages.LoginPage;
import de.smava.loanselectpages.Person;
import de.smava.loanselectpages.SmavaHome;

public class homework {

	@Test
	public void homeworkscenario() {

		System.setProperty("webdriver.chrome.driver",
				"executable\\chromedriver.exe");//set property of chrome driver using the current project directory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.smava.de/");
		
		driver.manage().window().maximize();
		
		SmavaHome home= new SmavaHome(driver);
		
		home.setLoan("2750");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		home.setMonths("24");
		
		home.setUse("Wohnen");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		KreditanFrage krfrage=home.Kredit2DayForward();//Every page will have a method to take you to the next page.
														//Every page will have a method which will return the object of the next page
		
		Person persson=krfrage.KreditanFrageNextbuttonClick();//Every page will have a method to take you to the next page.
																//Every page will have a method which will return the object of the next page
		
		
		LoginPage lgpage=persson.LogINClick();//hyperlink click
												//Every page will have a method to take you to the next page.
												//Every page will have a method which will return the object of the next page
		
		
		lgpage.Login();  //Verify the login
		

	}
}
