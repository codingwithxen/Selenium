package Infinite.SeleniumAssessment.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Control {
public static void main(String[] args)  {
	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions options=new FirefoxOptions();
	options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver=new FirefoxDriver(options);
	
		
	
	
//	WebDriverManager.chromedriver().setup();
//	ChromeOptions options =new ChromeOptions();
//	options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
//	WebDriver driver= new ChromeDriver(options);
	driver.get("https://www.bikewale.com/");
	
	WebElement button=driver.findElement(By.xpath("//input[@type=\"text\" and @value=\"\" and @placeholder=\"Search\" and @maxselectedwidth=\"100%\"]"));
	
	button.sendKeys("Royal Enfield Bullet");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
//	WebElement searchButton=driver.findElement(By.xpath("//div[@class=\"o-bXKmQE o-cWRslo o-eZTujG o-bkmzIL o-dqrENu o-duzCJV o-bWgajq\"]"));
//	searchButton.click();
	
	
//	List<WebElement> divFounder=driver.findElements(By.tagName("div"));
//	
//	for (WebElement webElement : divFounder) {
//		System.out.println(webElement.toString());
//		
//	}
//	
	
	WebElement cssSelect=driver.findElement(By.cssSelector("a[href*='\\l'"));
	cssSelect.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
}
}