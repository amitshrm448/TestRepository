package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
//	@Test(priority=1)
//	public static void doLogin() {
//		System.out.println("Do Login");
//	}
	
	@Test(dataProvider="getData")
	public static void doLogin(String username, String password) {
		System.out.println("PreTest");
		SoftAssert as = new SoftAssert();
		as.assertFalse(2==2);
		System.out.println("Post Test");
		as.assertAll();
	}
	
//	@DataProvider
//	public static Object[][] getData() {
//		
//		return Object[][];
//	}
	
//	@BeforeMethod
//	public static void launchBrowser() {
//		System.out.println("Launch Browser");
//	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation QA");
		Actions action = new Actions(driver);
		driver.switchTo().alert();
		
	}

}
