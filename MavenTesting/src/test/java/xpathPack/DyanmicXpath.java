package xpathPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class DyanmicXpath extends BaseClass {
	
	@Test
	public void daynamic() throws InterruptedException {
	
	test=report.createTest("Use of Absolute Xpath");
	driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
	
	//Dynamic Xpath By using contains function 
	driver.findElement(By.xpath("//*[contains(@name, 'L')]")).sendKeys("Chowdhury");
	
	Thread.sleep(4000);
	//Dynamic Xpath By using starts-with function 
	driver.findElement(By.xpath("//*[starts-with(@name, 'E')]")).sendKeys("Jamal@yahoo.com");
	
	Thread.sleep(4000);
	//Dynamic Xpath By using contains function with text()
	String actualText=driver.findElement(By.xpath("//*[starts-with(text(), 'Re')]")).getText();
	System.out.println("Text is : " +actualText);
	String expectedText="Registration orm";
	Assert.assertEquals(actualText, expectedText);
	 
	}
	

}
