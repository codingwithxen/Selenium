package Infinite.SeleniumAssessment.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import  org.openqa.selenium.interactions.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

 class ScrollUntilVisibleExample {
    public void scrollToElement(FirefoxDriver driver, WebElement element) {
        // Cast driver to JavascriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Scroll until the element is in the viewport
        jsExecutor.executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });", element);
    }
 }

public class appleNavigation {
public static void main(String[] args) {
	
	WebDriverManager.firefoxdriver().setup();
	

	FirefoxDriver driver=new FirefoxDriver();
//	driver.get("https://www.infinite.com/");
//	driver.get("https://demo.guru99.com/test/newtours/register.php");
//	driver.get("https://www.google.com/");
//	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	
//-------------------------------------------------------------------------------

//	WebElement hoveractn=driver.findElement(By.xpath("//ul[@id='ast-hf-menu-1']//li//*[@href='/#industries' and @data-ps2id-api='true']"));
	
//	Actions action=new Actions(driver);
//	action.moveToElement(hoveractn).perform();
	
//-------------------------------------------------------------------------------
//----double click	
//	WebElement drpDown=driver.findElement(By.xpath("//li[@id='menu-item-4569']//a//span[text()='Telecom']"));
//	Actions dClick=new Actions(driver);
//	dClick.doubleClick(drpDown).perform();
//-------------------------------------------------------------------------------
//---drop down
//	WebElement country=driver.findElement(By.xpath("//*[@name='country']"));
//	country.click();
	
//	WebElement drpDown=driver.findElement(By.xpath("//*[@name='country']"));
//	Select slctDrpDown=new Select(drpDown);
//	slctDrpDown.selectByValue("ANGOLA");
//	slctDrpDown.selectByVisibleText("ASHMORE AND CARTIER ISLANDS");
//	
//-------------------------------------------------------------------------------
//---drag and drop
//	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
//    
//    //Element on which need to drop.		
//    WebElement To=driver.findElement(By.xpath("//div//ol[@id='bank']"));	
//    ScrollUntilVisibleExample s = new ScrollUntilVisibleExample();
//    s.scrollToElement(driver,To);
//    
//    Actions builder=new Actions(driver);
//    
//    
//    Action drgdrp=builder.clickAndHold(From).moveToElement(To).release(To).build();
//    
//    
//    drgdrp.perform();
//    
//    WebDriverWait wait2 = new WebDriverWait(driver, 5);
//    wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.id("nonExistingElement")));
//	Select country=new Select(selectItem);
//	country.selectByIndex(3);   

	
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement selectItem=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//		selectItem.sendKeys("Hero Honda Splendor");
//		WebElement SearchKey=driver.findElement(By.xpath("//div[@class=\"lJ9FBc\"]//center//input[@class=\"gNO89b\"][@value=\"Google Search\"]"));
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(SearchKey));
//		SearchKey.click();
		
//		Actions DblClick=new Actions(driver);
//		DblClick.doubleClick(SearchKey).build().perform();
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("scrollBy(0, 3500)"); 
		
//		WebElement pageNumberdisplayer =driver.findElement(By.xpath("//span[@class='RVQdVd']"));// "More Results" button
//		
//		ScrollUntilVisibleExample s = new ScrollUntilVisibleExample();
//		s.scrollToElement(driver,pageNumberdisplayer);
//		
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, 5);
//		wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("nonExistingElement")));
//		
//		
//		ScrollUntilVisibleExample t = new ScrollUntilVisibleExample();
//		t.scrollToElement(driver,pageNumberdisplayer);
//		
//		WebDriverWait wait2 = new WebDriverWait(driver, 5);
//        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.id("nonExistingElement")));
//        
//		By condition=By.xpath("//span//a[@href=\"https://www.heromotocorp.com/en-in/motorcycles/practical/splendor-plus.html\"]");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(condition));
//		WebElement cond=driver.findElement(condition);
//	cond.click();
	
	
	WebElement mouseHover=driver.findElement(By.xpath("//*[@id='mousehover']"));
	
	JavascriptExecutor scrolling=(JavascriptExecutor) driver;
	scrolling.executeScript("window.scrollTo(0,1200);", mouseHover);
	
	
//	WebDriverWait wait1=new WebDriverWait(driver, 5);
//	wait1.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id=\"mousehover\"]")));
	
	Actions mouseHover1=new Actions(driver);
	mouseHover1.moveToElement(mouseHover).perform();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement dClick=driver.findElement(By.xpath("//*[@ondblclick=\"myFunction()\"]"));
	
//	JavascriptExecutor scrolling1=(JavascriptExecutor) driver;
//	scrolling1.executeScript("window.scrollTo(1200,0);", mouseHover);
	
	Actions Dclick=new Actions(driver);
	Dclick.doubleClick(dClick).perform();
	
//	WebElement test=driver.findElement(By.xpath("//*[@id='mousehover']"));
//	WebDriverWait wait2=new WebDriverWait(driver, 10);
//	wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("nothing")));
	
	
   

	driver.close();

	
}


}
