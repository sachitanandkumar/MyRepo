package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App_Category {
	public static WebDriver  driver;
	public static void main(String[] args) {
		System.out.println("user");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\setup\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://india.managedmethods.com:7474");
		driver.findElement(By.id("key")).sendKeys("AIzaSyA5EsrX3jx5mWR4Y2AhITjb7TsinorG-QU");
		driver.findElement(By.xpath("html/body/div[1]/form/button")).click();
		driver.findElement(By.id("uncategorized_app_btn")).click();
		driver.findElement(By.xpath(".//*[@id='uncategorized']/div[2]/table/tbody/tr/td[1]/div/div/button")).click();
		
	}
	
}
