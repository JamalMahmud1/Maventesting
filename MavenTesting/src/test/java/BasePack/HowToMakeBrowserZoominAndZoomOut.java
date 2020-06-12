package BasePack;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowToMakeBrowserZoominAndZoomOut extends BaseClass {
	
	@Test
	public void ZoomIn() throws InterruptedException {
		test=report.createTest("Zoom In and Zoom out");
		driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
		JavascriptExecutor jsEx=(JavascriptExecutor)driver;
		
		//Zoom In
		jsEx.executeScript("document.body.style.zoom='150%'");
		Thread.sleep(5000);
		
		//Zoom out
		jsEx.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(5000);
	}
	

}
