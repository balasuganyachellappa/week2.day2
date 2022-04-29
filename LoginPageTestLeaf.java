package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTestLeaf {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		  WebElement elementUsername=driver.findElement(By.id("email"));
		    elementUsername.sendKeys("kumar.testleaf@gmail.com");
		    driver.findElement(By.name("password")).sendKeys("leaf@12");
		   driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		   String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		driver.close();
	}

	
}
