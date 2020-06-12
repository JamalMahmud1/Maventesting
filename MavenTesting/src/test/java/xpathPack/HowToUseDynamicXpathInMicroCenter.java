package xpathPack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowToUseDynamicXpathInMicroCenter extends BaseClass {
	
	@Test
	public void FindingXpathinMicroCenter() throws InterruptedException {
		
	 test=report.createTest("Dynamic xpath");
	 driver.get("https://www.microcenter.com/");
	 
	 //using starts-with(text)
	 driver.findElement(By.xpath("//*[starts-with(text(),'Crea')]")).click();
	 Thread.sleep(4000);
	//using Contains(text)
	 String actualText=driver.findElement(By.xpath("//*[contains(text(),'Create M')]")).getText();
	 System.out.println("text is:"+actualText);
	 String expectedText="Create My Profile";
	 Assert.assertEquals(actualText, expectedText);
	 Thread.sleep(4000);
	 
	 
	   
	 //using starts-with
	 driver.findElement(By.xpath("//*[starts-with(@name,'ctl00$ContentLeftSide$txtFirstName')]")).sendKeys("Jamal");
	 
	 //using contains
	 driver.findElement(By.xpath("//*[contains(@name,'ctl00$ContentLeftSide$txtL')]")).sendKeys("Mahmud");
	 Thread.sleep(4000);
	}
	

}
