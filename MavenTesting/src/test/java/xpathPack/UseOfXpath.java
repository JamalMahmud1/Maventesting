package xpathPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class UseOfXpath extends BaseClass{
	
	@Test
	public void AbsoluteXpath() throws InterruptedException {
		
		test=report.createTest("Use of Absolute Xpath");
		
		driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
		
		//By using Absolute Xpath
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[1]")).sendKeys("Chowdhury");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[2]")).sendKeys("Jamal");
		
		
		//By using relative  Xpath by using name attribute
		driver.findElement(By.xpath("//*[@name='Email']")).sendKeys("Jamal@yahoo.com");
		
		//By using relative  Xpath by using Class attribute
		driver.findElement(By.xpath("//*[@Class='ClassPW']")).sendKeys("1234");
		
		Thread.sleep(4000);
	}

}
