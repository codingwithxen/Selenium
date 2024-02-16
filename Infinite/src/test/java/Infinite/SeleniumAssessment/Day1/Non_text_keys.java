package Infinite.SeleniumAssessment.Day1;

import java.awt.AWTException;
import org.openqa.selenium.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Non_text_keys {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	WebDriverManager.firefoxdriver().setup();
//	WebDriverManager.chromedriver().setup();
	FirefoxDriver driver=new FirefoxDriver();
	
//	ChromeDriver driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
//	driver.get("https://www.google.com/");
//	driver.get("https://www.bikewale.com/hero-bikes/xtreme-125r/");
//	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
//	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
//	driver.manage().window().maximize();
//	driver.manage().window().minimize();
//	driver.manage().window().maximize();
//	driver.manage().window().setPosition(new Point(0,-1000));
//	driver.manage().window().setPosition(new Point(0, -1000));
//	Robot rob=new Robot();
//	rob.keyPress(KeyEvent.VK_ALT);
//	rob.keyPress(KeyEvent.VK_SPACE);
//	rob.keyPress(KeyEvent.VK_N);
//	
	
//	driver.navigate().to("https://www.google.com/");
//	Point p = driver.manage().window().getPosition();
//	Dimension d = driver.manage().window().getSize();
//	driver.manage().window().setPosition(new Point((d.getHeight()-p.getX()), (d.getWidth()-p.getY())));
//	driver.manage().window().maximize();

	
//------------------------CODE DOESN'T WORK------------------------------------	
//	Dimension setWindow=new Dimension(800,600);
//	driver.manage().window().setSize(setWindow);
//------------------------------------------------------------------------------
	
//	Dimension set=new Dimension(800,600);
//	driver.manage().window();
	
			
	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.resizeTo(80,60)");
	//	Thread.sleep(4000);
//	WebDriverWait wait1=new WebDriverWait(driver, 1);///////
//	WebElement signin_popup=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//c-wiz//button[contains(@jsname,'ZUkOIc')]")));
//	
//	signin_popup.click();


	
//	WebElement SearchDABBA=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
//	SearchDABBA.sendKeys("Hero Honda Splendor");
//	Thread.sleep(2000);
//	wait1.until(ExpectedConditions.textToBePresentInElement(SearchDABBA,"Hero highness"));
//	SearchDABBA.sendKeys(Keys.ARROW_DOWN);
//	SearchDABBA.sendKeys(Keys.ARROW_DOWN);
//	SearchDABBA.sendKeys(Keys.ARROW_DOWN);
//	SearchDABBA.sendKeys(Keys.ENTER);
//	Thread.sleep(2000);
//	driver.navigate().refresh();
//	driver.navigate().to(driver.getCurrentUrl());
//	driver.getCurrentUrl();
//	driver.findElement(By.xpath("//textarea")).sendKeys("\\uE035");
//	js.executeScript("window.scrollBy(0,350)", "");
//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	Thread.sleep(2000);
	
	//img[@src='images/high_tatras_min.jpg']
//	WebElement ad=driver.findElement(By.xpath("//div[@id='ad_position_box']"));
//	WebElement ad_dismiss=driver.findElement(By.xpath("//div[@id='dismiss-button']"));
//	if(ad!=null)
//	ad_dismiss.click();
//	driver.manage().window().setPosition(new Point(0, -200));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].scrollIntoView(true);",From);
		
	
	Actions builder=new Actions(driver);
//	jse.executeScript("window.scrollBy(0,400);");
	jse.executeScript("window.scrollTo({top:500,behavior:'smooth'});");
	
//	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
//	Thread.sleep(2000);
	WebElement From=driver.findElement(By.xpath("//*[@id=\"alertbtn\"]"));
	From.click();
	
	Alert alert=driver.switchTo().alert();
//	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	WebElement Home=driver.findElement(By.xpath("//a[@href=\"https://www.rahulshettyacademy.com/\"]//button"));
	Home.click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	
	int width=1440;
	int height=1660;
	
	
	Dimension dimension=new Dimension(width,height);
	driver.manage().window().setSize(dimension);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
//	WebElement To=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
//	Action drgdrp=builder.clickAndHold(From).moveToElement(To).release(To).build();
//	drgdrp.perform();
	
//	driver.navigate().to("https://www.google.com/");
//	Point p = driver.manage().window().getPosition();
//	org.openqa.selenium.Dimension d = driver.manage().window().getSize();
//	driver.manage().window().setPosition(new Point((d.getHeight()-p.getX()), (d.getWidth()-p.getY())));
	driver.quit();	
	
}
}
