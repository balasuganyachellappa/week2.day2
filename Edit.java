package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		  WebElement elementUsername=driver.findElement(By.id("email"));
		    elementUsername.sendKeys("kumar.testleaf@gmail.com");
		   boolean enabled = driver.findElement(By.xpath("//input[@value='TestLeaf']")).isEnabled();
		   System.out.println(enabled);
		   boolean disabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		   System.out.println(disabled);
		//Thread.sleep(2000);
		driver.close();
	
}}


