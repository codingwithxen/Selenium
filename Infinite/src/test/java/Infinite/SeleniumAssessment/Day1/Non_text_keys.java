package Infinite.SeleniumAssessment.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class Non_text_keys {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
//	Thread.sleep(4000);
	WebDriverWait wait1=new WebDriverWait(driver, 1);
//	WebElement signin_popup=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//c-wiz//button[contains(@jsname,'ZUkOIc')]")));
//	
//	signin_popup.click();

	WebElement SearchDABBA=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
	SearchDABBA.sendKeys("Hero Honda Splendor");
	Thread.sleep(2000);
//	wait1.until(ExpectedConditions.textToBePresentInElement(SearchDABBA,"Hero higness"));
	SearchDABBA.sendKeys(Keys.ARROW_DOWN);
	SearchDABBA.sendKeys(Keys.ARROW_DOWN);
	SearchDABBA.sendKeys(Keys.ARROW_DOWN);
	SearchDABBA.sendKeys(Keys.ENTER);
	
	
	driver.quit();	
	
}
}
