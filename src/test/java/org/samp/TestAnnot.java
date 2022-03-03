package org.samp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAnnot {
	static WebDriver driver;
	@BeforeClass
	public static void sample() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void sample1() {
		driver.quit();
		
	}
	@Test
	public void testCse() {
	     WebElement findElement = driver.findElement(By.id("loginEmailId"));
	     findElement.sendKeys("anto");
	     WebElement findElement2 = driver.findElement(By.id("loginPassword"));
	     findElement2.sendKeys("sherwin");
	     
	}
	@Before
	 public void time() {
		long l = System.currentTimeMillis();
		System.out.println(l);

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*static WebDriver driver;
	@BeforeClass
	public static void BeforeCl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
	}
    @AfterClass
	public static void AfterC() {

		System.out.println("Finish");

	}
   @Before
	public void beforeM() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Before Method");
	}
   @After
	public void afterM() {
		System.out.println("After Method");
	}
   @Test
	public void testLog() {
		WebElement findElement = driver.findElement(By.id("loginEmailId"));
		findElement.sendKeys("antosherwin");
		WebElement findElement2 = driver.findElement(By.id("loginPassword"));
		findElement2.sendKeys("gdagf");
		WebElement findElement3 = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		findElement3.click();
		
		
	}*/

}
