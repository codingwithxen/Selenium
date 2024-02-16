package Selenium_Assessment_Day_4;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class asess {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.firefoxdriver().setup();
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
//	WebElement home=driver.findElement(By.xpath("//a//button[@class=\"btn btn-primary\"]"));
//	home.click();
//	WebElement scroll=driver.findElement(By.xpath("//button[@ id='mousehover']"));
//	WebElement From=driver.findElement(By.xpath("//li[4]//a[@class='button button-orange']"));
//	WebElement To=driver.findElement(By.xpath("//ol[@id=\"amt7\"]//li[@class='placeholder']"));
	
	WebElement inputs=driver.findElement(By.xpath("//button[@id='mousehover']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView();",inputs);
	js.executeScript("window.scrollBy(0,1000)");
	
	Actions actions=new Actions(driver);
	actions.moveToElement(inputs).perform();
	
//	Action inputs1=actions.keyDown(inputs,Keys.SHIFT).sendKeys(inputs,"hello").keyUp(inputs,Keys.SHIFT).build();
//	inputs1.perform();
//	actions.dragAndDrop(From, To).build().perform();
//	Dimension dim=new Dimension(80,60);
//	driver.manage().window().setSize(dim);
//	js.executeScript("window.resizeTo(90,100);");
	
//	Action mouseAction=actions.moveToElement(inputs).bui
	

	
//	Thread.sleep(1000);
//	driver.navigate().back();
//	Thread.sleep(1000);
//	driver.navigate().forward();

	Thread.sleep(1000);
	driver.quit();
	
}
}
