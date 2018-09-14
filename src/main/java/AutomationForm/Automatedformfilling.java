package AutomationForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import actions.actions.*;

public class Automatedformfilling {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		actions.actions.getFirstname(driver);
		
	}
}
