package BasePack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowToopennewTabandnewWindow extends BaseClass {
	
	@Test
	public void OpenNewTab() throws InterruptedException {
		test=report.createTest("Open new Tab");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com/webhp?tab=ww");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(600,1000));
		
		
	}
	@Test
	public void OpennewWindow() throws InterruptedException {
		test=report.createTest("Open new window");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.google.com/webhp?tab=ww");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1000,600));
		
		Thread.sleep(5000);
	
	
		
	}
	
	
	

}
