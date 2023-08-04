package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		WebElement firstleadid = driver
				.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]/td[1]/div/a[1]"));
		String leadid = firstleadid.getText();
		System.out.println("First leadid : " + leadid);

		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]/td[1]/div/a[1]")).click();

		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		boolean displaytext = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();

		if (displaytext == true) {
			System.out.println("Test case passed : Successful Deletion");
		} else {
			System.out.println("Test case failed");
		}
		driver.close();

	}

}
