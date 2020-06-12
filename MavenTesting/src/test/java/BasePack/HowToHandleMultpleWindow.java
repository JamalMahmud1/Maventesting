package BasePack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack1.BaseClass;



public class HowToHandleMultpleWindow extends BaseClass {
	@Test
	public void HandleMultipleWindow() throws InterruptedException {
		//test=report.createTest("-------");
		driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		Thread.sleep(3000);
		ArrayList<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		
		driver.findElement(By.name("firstname")).sendKeys("Jamal");
		Thread.sleep(3000);
		
		
		ArrayList<String>tab0=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab0.get(0));
		
		driver.findElement(By.id("FN")).sendKeys("Jamal");
		
		Thread.sleep(3000);
	}

}



