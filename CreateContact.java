package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.xpath("//div[@class='x-panel-header']//a[contains(text(),'Contacts')]")).click();
	driver.findElement(By.xpath("//ul[@class='shortcuts']//a[contains(text(),'Create Contact')]")).click();
//driver.findElement(By.xpath("/span[@class='tableheadtext']//following::select[@id='createContactForm_generalCountryGeoId']")))
	driver.findElement(By.id("firstNameField")).sendKeys("Bala");
	driver.findElement(By.id("lastNameField")).sendKeys("c");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("suganya");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("chellappa");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Software Tester-Seleniumwebdriver");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("balasuganyachellappa@gmail.com");
	driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("New York");
	driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
	driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[contains(text(),'Edit')]")).click();
	driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Seleniumwebdriver-corejava");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	String text = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
	System.out.println(text);
	driver.close();
}
}
