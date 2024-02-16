package Infinite.SeleniumAssessment.Day1;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	
	WebElement SearchInput=driver.findElement(By.cssSelector("textarea#APjFqb"));
	SearchInput.sendKeys("Hero Honda Splendor");
	
//	WebDriverWait wait1=new WebDriverWait(driver, );
//	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"lJ9FBc\"]//center//*[@class=\"gNO89b\"]")));
	
	WebElement SearchButton=driver.findElement(By.xpath("//div[@class=\"lJ9FBc\"]//center//*[@class=\"gNO89b\"]"));
	SearchButton.click();
	
	JavascriptExecutor scroller=(JavascriptExecutor) driver;
	scroller.executeScript("window.scrollTo({top:document.body.scrollHeight,behavior:'smooth'});",SearchButton );
	
//	WebDriverWait wait2=new WebDriverWait(driver, 3);
//	wait2.until(ExpectedConditions.elementToBeClickable("//span[@class='RVQdVd']"))
	
	driver.close();
	
}
}
