package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPageLogin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
    WebElement elementUsername=driver.findElement(By.id("username"));
    elementUsername.sendKeys("DemoSalesManager");
    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
    driver.findElement(By.className(("decorativeSubmit"))).click();
    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
    driver.findElement(By.xpath("//a[text()='Leads']")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

   //driver.findElement(By.linkText("Leads")).click();

    //driver.findElement(By.linkText("Create Lead")).click();name="companyName"

    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf April");
    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("balasuganya");
    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("c");

    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
   // driver.findElement(By.xpath("//input[contains(text(),'Submit')]")).click();
    String Text =driver.findElement(By.id("viewLead_companyName_sp")).getText();
    System.out.println(Text);
   
	driver.close();
	
}
}
