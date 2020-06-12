package BasePack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowToHighlightWebElement extends BaseClass {
	
	@Test
	public void HighlightWebElement() throws InterruptedException {
		
		test=report.createTest("Highlight web element");
		driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
		WebElement fname=driver.findElement(By.id("FN"));
		fname.sendKeys("Jamal");
		JavascriptExecutor jsEx=(JavascriptExecutor)driver;
		jsEx.executeScript("arguments[0].setAttribute('style','background:green;  border: 3px solid orange;' )",fname); 
		
		Thread.sleep(4000);
		
	}

}
