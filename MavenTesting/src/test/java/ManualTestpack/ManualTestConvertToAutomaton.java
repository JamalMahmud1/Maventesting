package ManualTestpack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class ManualTestConvertToAutomaton extends BaseClass {
	
      @Test(description="TC001")
      public void verifyTitle() {
    	  test=report.createTest("Verify Title");
    	  driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
    	  String expectedTitle="BNS International Corporation";
    	  String actualTitle=driver.getTitle();
    	  System.out.println("Title is : "+actualTitle);
    	  Assert.assertEquals(actualTitle,expectedTitle);
    	  
      }
      @Test(description="TC002")
      public void FillUpFacebookLoginForm() {
    	  test=report.createTest("Fill Up Facebook Login Form");
    	  driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
    	  driver.findElement(By.xpath("//*[@id=\"FN\"]")).sendKeys("Jamal");
    	  driver.findElement(By.id("LN")).sendKeys("Chowdhury");
    	  driver.findElement(By.xpath("//*[@id=\"EM\"]")).sendKeys("Jamal@yahoo.com");
    	  driver.findElement(By.xpath("//*[@id=\"PW\"]")).sendKeys("2667");
    	  Select monthselect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[1]")));
    	  monthselect.selectByVisibleText("Jan");
    	  Select dayselect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[2]")));
    	  dayselect.selectByVisibleText("10");
    	  Select yearselect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[3]")));
    	  yearselect.selectByVisibleText("2001");
    	  driver.findElement(By.xpath("/html/body/div/div[2]/form/input[6]")).click();
      }
      @Test(description="TC003")
      public void verifyUrl() {
    	  test=report.createTest("Verify Url");
    	  driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
    	  String expectedTitle="BNS International Corporati";
    	  String actualTitle=driver.getTitle();
    	  System.out.println("Title is : "+actualTitle);
    	  Assert.assertEquals(actualTitle,expectedTitle);
    	  
      }
      
}
