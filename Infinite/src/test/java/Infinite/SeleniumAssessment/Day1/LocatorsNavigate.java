package Infinite.SeleniumAssessment.Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsNavigate {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
	
//	WebElement dragDrop=driver.findElement(By.xpath("//span[text()='right click me']"));
	
	driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
	
	Alert alert=driver.switchTo().alert();
	alert.wait(4000);
	
//	alert.accept();
	String s=alert.getText();
	
	System.out.println(s);
	
	
	//	dropdown1.selectByIndex(1);

	
	
//	WebElement click1=driver.findElement(By.xpath("//body//ul//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
//	click1.click();
	
	
	driver.close();
}
}
