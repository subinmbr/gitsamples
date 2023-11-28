package testPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.log.Log;
import org.openqa.selenium.devtools.v118.emulation.Emulation;
import org.openqa.selenium.devtools.v118.network.Network;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class devtoolProtocol {
	
	
	
	
	ChromiumDriver driver;
	
	DevTools devTools;
	
	
@BeforeTest

public void setup() {
	  
	driver = new ChromeDriver();
	
	devTools =  driver.getDevTools();
	
devTools.createSession();
	

	  
}
  @Test
  public void deviceModeTest() {
	  
	  Map deviceMetrics = new HashMap() {{
		  
		  put("width",600);
		  put("height",800);
		  
		  put("deviceScaleFactor",800); 
		  put("mobile",true); 
		  
	  }};
	  
	  driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
	  driver.get("https://www.selenium.dev/");
	  }
  
  
 @Test
 
 //latlong.net
 
 //store- oldnavy.gap.com/stores
 
 public void geoLocation() {
	
	 
  Map deviceMetrics1 = new HashMap() {{
		  
		  put("latitude",18.335766);
		  put("longitude",-64.896332);
		  
		  put("accuracy",100);
		  
	  }};
	  
	  driver.executeCdpCommand("Emulation.setGeolocationOverride", deviceMetrics1);
	  
	  driver.get("https://oldnavy.gap.com/stores");
	 
	 
 }
	  
	  
	 /* @Test
	  
	  //latlong.net
	  
	  //store- oldnavy.gap.com/stores
	  
	  public void logError() {
	 	
	 	 
	   devTools.send(Log.enable());
	   devTools.addListener(Log.entryAdded(),
			   new Consumer<logEntry>() {
		   
		   public void accept (LogEntry logEntry) {
			   
			   System.out.println("log : "+ LogEntry);
		   }
	   }
	 	  
	
 
 @Test
 
 //latlong.net
 
 //store- oldnavy.gap.com/stores
 
 public void basiAuth() {
	
	 
  devTools.send(Network.enable(Optional.empty(),Optional.empty(), Optional.empty()));
  Map<String , Object>  headers = new HashMap();
  String strUser ="admin";
  String strpwd =  "admin";
  
  
  String basiAuth = "basic"+ new String(new Base64().encode(
		  String.format()
		  
		  
		  ))
		  
	 
 }
 */
 
 
 }
 
	  
  

