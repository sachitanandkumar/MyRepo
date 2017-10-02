package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Takescreenshot {
	

	@Test
	public void snapshot() throws Exception{
		//WebDriver driver = null;
		WebDriver driver = new ChromeDriver();
//		driver = new RemoteWebDriver(new URL("http://"+ "192.168.2.10"/*InetAddress.getLocalHost().getHostAddress()*/ +":4444/wd/hub/"), DesiredCapabilities.chrome());
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Selenium\\setup\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://dev.acko.in/");
		driver.get("https://www.salesforce.com/in/?ir=1");
		snapchat(driver,"C:/Users/Kuliza/Desktop/Custom/Snapshot");
		
	}
	
	public void snapchat(WebDriver webdriver, String filepath) throws IOException{
		TakesScreenshot snp = ((TakesScreenshot)webdriver);
		File src = snp.getScreenshotAs(OutputType.FILE);
		File destfile = new File(filepath);
		FileUtils.copyFile(src, destfile);
		
		
	}
		
		
}
	
