package testPackage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testNgClass {
	
	WebDriver driver;
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
  @Test
  public void googletest() {
	  
	  extentTest  = reports.createTest("googletest");
	  System.out.println("hello");
	  
	  
	  
  }
  
  @Test
  public void googletest3() {
	  
	  extentTest  = reports.createTest("googletest3");
	  System.out.println("hello");
	  
	  
	  
  }
  @Test
  public void googletest1() {
	  
	  extentTest  = reports.createTest("googletest1");
	  System.out.println("hello");
	  
	  
	  
  }
  @Test
  public void googletes2t() {
	  
	  extentTest  = reports.createTest("googletest2");
	  System.out.println(2/0);
	  
	  
	  
  }
  
  
  

  

  @BeforeTest
  public void setupExtent(){
	  
	  reports=  new ExtentReports();
	spark = new ExtentSparkReporter("target/SparkReport.html")
			.viewConfigurer()
			.viewOrder()
			.as(new ViewName[] {
					
					ViewName.DASHBOARD,
					ViewName.TEST,
					ViewName.AUTHOR,
					ViewName.DEVICE,
					ViewName.LOG
			}
					).apply();
	
	
		 reports.attachReporter(spark);
	  
	  
	  
  }
  
  @AfterTest
  public void finishExtent() {
  reports.flush();
  
  }
  
  @AfterMethod
  
  public void tearDown(ITestResult result) {
	  
	//write the extent report thing characteristic
	  
	  extentTest.assignAuthor("AutoTester1")
	  .assignCategory("regression")
	  .assignDevice(System.getProperty("os.name"))
	  .assignDevice(System.getProperty("os.version"));
	  
	  if (ITestResult.FAILURE==result.getStatus())
	  {
		  
		  extentTest.log(Status.FAIL, result.getThrowable().getMessage());
		  
		  String strPath = Utility.getScreenshotPath(driver);
		  extentTest.fail(
				  MediaEntityBuilder.createScreenCaptureFromPath(strPath).build());
		  
				  
		  
		  
		  
	  }
	  
	  driver.close();
	  
  }

}
