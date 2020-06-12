package ManualTestpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class ManualyConvertToAutomatin extends BaseClass {
	 // @Test(description="TC001")
      public void verifyTitle() {
   	  driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
   	  String expectedTitle="BNS International Corporation";
   	  String actualTitle=driver.getTitle();
   	  System.out.println("Title is : "+actualTitle);
   	  Assert.assertEquals(actualTitle,expectedTitle);
   	  

}
	 //@Test(description="TC002")
	 public void WindowHandling() throws InterruptedException {
		 driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
		 driver.findElement(By.partialLinkText("Facebook")).click();
		 
		 Thread.sleep(3000);
		 
		 ArrayList<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab1.get(1));
		 
		 driver.findElement(By.name("lastname")).sendKeys("Mahmud");
		 
		 Thread.sleep(3000);
		 
		 ArrayList<String>tab0=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab0.get(0));
		 
		 driver.findElement(By.xpath("html/body/div/div[2]/form/input[2]")).sendKeys("Mahmud");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.partialLinkText("Google")).click();
		 Thread.sleep(3000);
				 
		 ArrayList<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab2.get(2));
		 
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Bangladesh");
		 Thread.sleep(3000);
		 driver.switchTo().window(tab0.get(0));
		 
		 Thread.sleep(3000);
		 
		 
		 
	 }

	 }
		 
		 
		 
		 
	 
	
	 
		 
	 

