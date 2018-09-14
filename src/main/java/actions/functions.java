package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.inputdata.*;

public class functions {
	
	public static WebElement getFirstname (WebDriver driver)
	{
		return driver.findElement(By.name("Firstname"));
		
	}
	
		
	}

