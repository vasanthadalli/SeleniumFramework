package SelFramework.SelFramework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions op= new ChromeOptions();
		op.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	
		WebDriver driver= new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.id("userEmail")).sendKeys("dvasantha2014@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("India@22");
		
		driver.findElement(By.id("login")).click();
		
		
		
		
	}

}
