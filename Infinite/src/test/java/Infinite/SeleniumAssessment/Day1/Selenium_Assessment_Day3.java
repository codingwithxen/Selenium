package Infinite.SeleniumAssessment.Day1;

import java.time.Duration;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Assessment_Day3 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
//	WebDriverManager.chromedriver().setup();
	
	FirefoxDriver driver=new FirefoxDriver();
//	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	driver.get("https://demo.automationtesting.in/Static.html");
//	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.get("https://www.google.com/");

//	WebElement alrtButton=driver.findElement(By.xpath("//input[@id=\"alertbtn\"]"));
//	alrtButton.click();
//	WebElement Placeholder=driver.findElement(By.xpath("//input[@id=\"name\"]"));
//	String s=driver.switchTo().alert().getText();
	
//	System.out.println(s);
//	driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).sendKeys(Keys.F5);
//	driver.manage().window().minimize();
//	driver.manage().window().maximize();
	
//	Placeholder.sendKeys(Keys.RETURN);
	WebElement SearchDABBA=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
	Actions action=new Actions(driver);
	
	Action keyInCaps=action.keyDown(SearchDABBA,Keys.SHIFT).sendKeys(SearchDABBA,"Hero Honda").keyUp(SearchDABBA,Keys.SHIFT).build();
	keyInCaps.perform();
	SearchDABBA.sendKeys(Keys.RETURN);
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.titleContains("HERO HONDA - Google Search"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement searchResutlts=driver.findElement(By.xpath("//*[@id=\"rcnt\"]"));
	searchResutlts.click();
	Action close=action.keyDown(searchResutlts,Keys.ALT).keyDown(searchResutlts,Keys.F4).build();
	close.perform();
	js.executeScript("window.scrollBy(0,300)");
//	Thread.sleep(2000);
//	WebElement From=driver.findElement(By.xpath("//div/ul/li[4]/a[contains(text(),'5000')]"));
//	WebElement To=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
//	WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(5));
//	wait1.until(ExpectedConditions.textToBePresentInElement(From, "5000"));
//	Actions drgDrp=new Actions(driver);
//	drgDrp.dragAndDropBy(From,143,42).build().perform();
//	Thread.sleep(2000);
//	drgDrp.perform();
//	Thread.sleep(2000);
	js.executeScript("window.resizeTo(0,300)");
//	
	

//	Thread.sleep(2000);
//	alert1.dismiss();
	


	
//	driver.quit();
}
}
