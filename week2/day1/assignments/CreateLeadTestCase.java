package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Services");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijayalakshmi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kaliyamoorthi");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Viji");
		
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test department");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("We perform Test automation");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vijayalakshmi@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Title of Resulting Page: " + driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
