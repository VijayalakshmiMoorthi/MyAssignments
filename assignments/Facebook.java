package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		driver.findElement(By.name("firstname")).sendKeys("Vijayalakshmi");
		driver.findElement(By.name("lastname")).sendKeys("Kaliyamoorthi");
		driver.findElement(By.name("reg_email__")).sendKeys("vijayalakshmi@test.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@12345");

		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select birthdaydropdown = new Select(birthday);
		birthdaydropdown.selectByValue("2");

		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select birthmonthdropdown = new Select(birthmonth);
		birthmonthdropdown.selectByIndex(1);

		WebElement birthyear = driver.findElement(By.name("birthday_year"));
		Select birthyeardropdown = new Select(birthyear);
		birthyeardropdown.selectByVisibleText("1990");

		driver.findElement(By.xpath("//input[@value='1']")).click();

		driver.close();

	}

}
