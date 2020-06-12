package BasePack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class DataDrivenFrameWork extends BaseClass{
	
	@Test(dataProvider="FaceBookData")
	
	public void FaceBookDataDriven(String FN,String LN,String Email,String Remail,String Pass,
		String MN,String DY,String YR,String Gn) throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys(FN);
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys(LN);
		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys(Remail);
		driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys(Pass);
		
		Select monthSelect=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		monthSelect.selectByVisibleText(MN);
		Select daySelect=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		daySelect.selectByVisibleText(DY);
		Select yearSelect=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		yearSelect.selectByVisibleText(YR);
		 
		if(Gn.equalsIgnoreCase("Male")) {
			driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
		}
		else if(Gn.equalsIgnoreCase("Female")) {
			driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
		} 
		else {
			driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
			Thread.sleep(3000);
			Select cusSelect=new Select(driver.findElement(By.name("preferred_pronoun")));
			cusSelect.selectByValue("2");
		}
		Thread.sleep(3000);
	}
	@DataProvider(name="FaceBookData")
	public Object[][] getData() {
		
		return new Object[][] {
			
			{"Jamal","Mahmud","Jamal@yahoo.com","Jamal@yahoo.com","1234","Apr","20","1995","Male"},
			{"Anwar","Islam","Anwar@yahoo.com","Anwar@yahoo.com","1561","Mar","3","1997","Custom"},
			{"Sohani","Mahmud","Sohani@yahoo.com","Sohani@yahoo.com","1357","Jul","10","1999","Female"}
		};
	}

}
