package Infinite.SeleniumAssessment.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Assessment_Day2 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
//	ChromeOptions options=new ChromeOptions();
//	options.setBinary(null);
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/email");
	driver.manage().window().maximize();
	
	WebElement name=driver.findElement(By.id("user_name"));
	name.sendKeys("Gopal Kishan");
	
	WebElement email=driver.findElement(By.cssSelector("input[id=\"user_email\"]"));
	email.sendKeys("gopalkishan@infinite.com");
	
	//tag#id
	//tag.class
	//tag[A.name='A.value']
	
	//^ tag[A.name^='sam']
	//^ tag[A.name$='sam']
	//^ tag[A.name*='sam']
	
	//*input
	
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("GopK32@$");
	
	WebElement checkbox=driver.findElement(By.cssSelector("input[value='1']"));
	checkbox.click();
	
	WebElement signup=driver.findElement(By.xpath("//input[@type='submit']"));
	signup.click();
	
	
	
	
}
}
