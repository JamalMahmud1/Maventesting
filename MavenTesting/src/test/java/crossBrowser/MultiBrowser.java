package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack1.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser extends BaseClass {
	WebDriver driver;

	@Test(dataProvider = "browserName")
	public void multiBrowserTesting(String browser) throws InterruptedException {
		test=report.createTest("Multi Browser Testing ");

		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}

		else if(browser.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", "C:\\ITTraining\\AllDriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\ITTraining\\AllDriver\\msedgedriver.exe");
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("New York");
		Thread.sleep(4000);
		driver.close();
	}
	@DataProvider(name="browserName")
	public Object[][] getBrowser(){
		return new Object[][] {
			{"Chrome"},
			{"IE"},
			{"Edge"},
			{"Firefox"},
		};
	}

}
