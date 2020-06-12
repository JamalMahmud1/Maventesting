package BasePack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowCanHandleMultiplepagesIntoSameWindow extends BaseClass {
	
	@Test
	
	 public void MultiplepagesInSameWindow() throws InterruptedException {
		driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
		
		driver.findElement(By.partialLinkText("Yahoo")).click();
		
		driver.findElement(By.name("p")).sendKeys("corona");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.findElement(By.id("FN")).sendKeys("Jamal");
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.findElement(By.name("p")).sendKeys("Bangladesh");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	
		
	}

}
