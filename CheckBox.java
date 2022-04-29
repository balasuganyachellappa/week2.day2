package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
        boolean check1 = driver.findElement(By.xpath("//label[contains(text(),'Select the languages that you know?')]/following::input")).isSelected();
		System.out.println("check box is not selected" +check1);
		boolean check2 = driver.findElement(By.xpath("//label[contains(text(),'Confirm Selenium is checked')]/following-sibling::input")).isSelected();
		System.out.println("check box is selected " + check2);
        driver.close();
		
	}

}
