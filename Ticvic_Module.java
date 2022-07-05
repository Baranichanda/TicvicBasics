package com.ticvic.project.Ticvic_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Ticvic_Module {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//home//ticvictech//Downloads//Eclipse_Ticvic//chromedriver_linux64//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("page title"+title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Page url"+currentUrl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("laptop",Keys.ENTER);
		WebElement dealDay = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]"));
		dealDay.click();
		WebElement brand = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]"));
		brand.click();
		Thread.sleep(3000);
		WebElement cpuType = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[22]"));
		cpuType.click();
		WebElement laptopSelect = driver.findElement(By.xpath("(//img[@class='s-image'])[2]"));
		laptopSelect.click();
       
	}
        
}
