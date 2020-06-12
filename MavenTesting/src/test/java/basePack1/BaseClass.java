package basePack1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected static WebDriver driver;
	
	protected static ExtentHtmlReporter extHtmlreport;
	protected static ExtentReports report;
	protected static ExtentTest test;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		extHtmlreport=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\ExtentHtmlReport.html");
		extHtmlreport.config().setDocumentTitle("TestNg Extent Report");
		extHtmlreport.config().setReportName("Automation Testing Report");
		extHtmlreport.config().setTheme(Theme.STANDARD);
		
		report=new ExtentReports();
		report.attachReporter(extHtmlreport);
		report.setSystemInfo("Hostname", "LocalHost");
		report.setSystemInfo("OS", "Windows10");
		report.setSystemInfo("Browser name", "Chrome");
		report.setSystemInfo("Tester name", "Chowdhury Jamal");
	}
		@AfterMethod
		public void extentStatus(ITestResult result) throws IOException {
			if(result.getStatus()==ITestResult.FAILURE) {
				test.log(Status.FAIL, "Failed Test case is :"+result.getName());
				test.log(Status.FAIL, "Failed Test case is :"+result.getThrowable());
				
				String screenshotpath=getScreenShot(result.getName());
				test.addScreenCaptureFromPath(screenshotpath);
			}
			else if(result.getStatus()==ITestResult.SKIP) {
				test.log(Status.SKIP, "Skiped Test case is :"+result.getName());
			}
			else if(result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status.PASS, "Passed Test case is :"+result.getName());
			}
	  }
		public static String getScreenShot(String screenshotName) throws IOException {
			String dateName=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String destination=System.getProperty("user.dir")+"\\ScreenShot\\"+screenshotName+dateName+".png";
			FileUtils.copyFile(f, new File(destination));
			return destination;
		}
	@AfterTest
		public void teardown() {
			report.flush();
			driver.quit();
	}
}
