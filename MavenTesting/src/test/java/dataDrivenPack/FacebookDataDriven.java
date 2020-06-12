package dataDrivenPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack1.BaseClass;

public class FacebookDataDriven extends BaseClass {
	
	@Test(dataProvider="FacebookData")
	
	public void FacebookData(String Firstname,String Lastname,String Email,String AgainEmail,String Password,
		String BirthMonth,String BirthDay,String BirthYear,String Gender) throws InterruptedException {
	    test=report.createTest("ReadExcel");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys(Firstname);
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys(Lastname);
		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys(AgainEmail);
		driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys(Password);
		
		Select monthSelect=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		monthSelect.selectByVisibleText(BirthMonth);
		Select daySelect=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		daySelect.selectByVisibleText(BirthDay);
		Select yearSelect=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		yearSelect.selectByVisibleText(BirthYear);
		 
		if(Gender.equalsIgnoreCase("Male")) {
			driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
		}
		else if(Gender.equalsIgnoreCase("Female")) {
			driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
		} 
		
		
		Thread.sleep(3000);
	}



    
	@DataProvider(name="FacebookData")
    public Object[][] readExcel() throws IOException {
    	
		File f =new File("C:\\Users\\chowd\\Desktop\\Facebook Data.xlsx");
		
    	FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet ws = wb.getSheet("Data1");

		int rowCount = ws.getLastRowNum();
		
		int colCount = ws.getRow(0).getLastCellNum();
		

		Object[][] obj = new Object[rowCount][colCount];
		
		for (int i = 0; i <rowCount; i++) {
			
			Row row = ws.getRow(i+1);
	
			for (int j = 0; j < row.getLastCellNum(); j++) {
	
			obj[i][j] = row.getCell(j).toString(); 
			} 
			
		}

		return obj;
		
	}

}




