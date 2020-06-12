package BasePack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowToHandlAlert extends BaseClass {
	
	@Test
	public void ConfirmAlert() throws InterruptedException {
		test=report.createTest("Confirm Alert");
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.id("btnConfirm")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Text is : "+alt.getText());
		alt.accept();
		//alt.dismiss();
		Thread.sleep(3000);
	}
	@Test
	public void Alert() throws InterruptedException {
		test=report.createTest("Normal Alert");
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.xpath("//*[@id=\"btnAlert\"]")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Text is : "+alt.getText());
	
		alt.accept();
		Thread.sleep(3000);
	}
	@Test
	
	public void ShowPrompt() throws InterruptedException {
		test=report.createTest("Prompt Alert");
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.xpath("//*[@id=\"btnPrompt\"]")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Text is : "+alt.getText());
		alt.sendKeys("Cucumber");
		Thread.sleep(3000);
		alt.accept();

}
}