package commonUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility {
	
	public static String  getScreenshotPath( WebDriver driver) {
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File src = screen.getScreenshotAs(OutputType.FILE);
		String srcfile = System.getProperty("user.dir")
				+ "/screenshots/"
				+System.currentTimeMillis()
				+ ".png";
		
		File dest = new File(srcfile);
		
		/*try {
			FileUtils.copyFile(src,dest);
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}*/
		
		return srcfile;
		
		
		
		
		
		
		
		
	}
	
	

}
