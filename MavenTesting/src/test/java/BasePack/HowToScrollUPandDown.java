package BasePack;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowToScrollUPandDown extends BaseClass {
   
	@Test
	public void ScrollDown() throws InterruptedException {
		test=report.createTest("Scroll Down");
		driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
		Thread.sleep(4000);
		JavascriptExecutor jsEx=(JavascriptExecutor)driver;
		jsEx.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(4000);
		jsEx.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(4000);
		
	}
}
