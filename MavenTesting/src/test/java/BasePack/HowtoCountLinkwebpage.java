package BasePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowtoCountLinkwebpage extends BaseClass {
 @Test
 public void LinkCounting() {
	 driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
	 
	 List<WebElement>links=driver.findElements(By.tagName("a"));
	 int totallink=links.size();
	 
	 System.out.println("Total links are: "+totallink);
	 
	 for(int i=0; i<totallink;i=i+1) {
		 System.out.println(i+" ."+links.get(i).getAttribute("href")+"===="+links.get(i).getText());
	 }
	 
	 
	 
	 
 }

}
