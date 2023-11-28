package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTwo {
	
	
	WebDriver driver= new ChromeDriver();
	
  @Test(retryAnalyzer = RetryAnalyzer.class)
  public void searchtest() {
	  
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.cssSelector("#APjFqwwb"));
	  driver.close();
	  
	  
  }
}
