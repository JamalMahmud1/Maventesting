package BasePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class HowToSearchInSearchBox extends BaseClass {
	@Test
	
	public void WeatherSearchBox() throws InterruptedException {
		test=report.createTest("Weather Search Box");
	
		driver.get("https://www.weather.gov/");
		
		
		driver.findElement(By.xpath("//*[@id=\"inputstring\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"inputstring\"]")).sendKeys("11432");
		
		Thread.sleep(3000);
		
		List<WebElement>Searchlist = driver.findElements(By.xpath("/html/body/div[7]/div"));
		System.out.println("Total search iteam: "+Searchlist.size());
		
		for(int i=0; i<Searchlist.size();i++) {
			
			System.out.println(i+ ". "+Searchlist.get(i).getText());
			if(Searchlist.get(1).getText().contains("Hillcrest")) {
				Searchlist.get(1).click();
				Thread.sleep(3000);
				break;
			}
			
			
			
			
	
			}
		


	}
}




