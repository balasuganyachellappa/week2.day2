package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();   			//Open a chrome browser
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.opencart.com/index.php?route=account/register");//Load url http://leafground.com/pages/Button.html
	driver.findElement(By.id("input-firstname")).sendKeys("New User");				                                                        //Enter the first name and last name
	driver.findElement(By.id("input-lastname")).sendKeys("c");
    driver.findElement(By.id("input-country")).sendKeys("India");//Select a value from country dropdown
					
	driver.close();//closing the browser
							

}}
