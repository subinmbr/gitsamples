package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTwo {
	
	
	WebDriver driver= new ChromeDriver();
	
  @Test(retryAnalyzer = RetryAnalyzer.class)
  public void searchtest() throws InterruptedException {
	  
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.cssSelector("#APjFqb")).sendKeys("hi");
	  
	  
	  //token  - - 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
	 Thread.sleep(2000);
	 
	  driver.close();
	  
	  
  }
}
