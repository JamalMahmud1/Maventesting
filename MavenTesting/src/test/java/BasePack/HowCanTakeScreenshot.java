package BasePack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowCanTakeScreenshot extends BaseClass {
	
	@Test
	public void takingScreenShot() throws InterruptedException, IOException {
		
	     test=report.createTest("Facebook Screenshot");
		driver.get("file:///C:/ITTraining/BNS.html");
		driver.findElement(By.id("FN")).sendKeys("Jamal");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[1]")).sendKeys("Jamal");
	    driver.findElement(By.xpath("html/body/div/div[2]/form/input[2]")).sendKeys("M");
	    driver.findElement(By.xpath("html/body/div/div[2]/form/input[3]")).sendKeys("Jamal@yahoo.com");
	    
	    driver.findElement(By.xpath("html/body/div/div[2]/form/input[4]")).sendKeys("Jamal56544");
		driver.findElement(By.xpath("html/body/div/div[2]/form/input[5]")).sendKeys("456-566-5658");
		
	    Thread.sleep(3000);
	    Select monthSelect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[1]")));
	    monthSelect.selectByIndex(5);
	    Thread.sleep(3000);
	    Select daySelect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[2]")));
	    daySelect.selectByIndex(20);
	    Thread.sleep(3000);
	    
	    Select yearSelect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[3]")));
	    yearSelect.selectByVisibleText("2002");
	    
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/input[6]")).click();
	    

	    
	    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(System.getProperty("user.dir")+"\\ScreenShot\\Jamal.png"));
	   
	}
}
