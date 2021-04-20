package com.test.Utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {

	public static void takesscreenshot(WebDriver driver, String screenshot) {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String correntdir = System.getProperty("user.dir");
		try {
			FileUtils.copyFile(srcfile, new File(correntdir+"/ScreenShot/"+screenshot+".png"));
		}catch(IOException e) {
			e.getStackTrace();
		}
	}	
	
	
	
}
