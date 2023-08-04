package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Vijayalakshmi");
		driver.findElement(By.id("lastNameField")).sendKeys("Kaliyamoorthi");

		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Viji");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Moorthi");

		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("TEST");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This contact is created for test purpose");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vijayalakshmi@test.com");

		WebElement stateprovince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(stateprovince);
		state.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		driver.findElement(By.id("updateContactForm_description")).clear();

		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated information");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		String title = driver.getTitle();
		System.out.println("Title of Resulting page is " + title);

	}

}
