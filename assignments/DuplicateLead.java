package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("vijayalakshmi@test.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		WebElement element1 = driver
				.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div[1]/a[1]"));
		String firstname = element1.getText();
		System.out.println(firstname);

		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

		WebElement element2 = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']"));
		String title = element2.getText();

		if (title.equals("Duplicate Lead")) {
			System.out.println("Title is correctly displayed as Duplicate Lead");
		} else {
			System.out.println("Title is incorrect");
		}

		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		WebElement element3 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String leadname = element3.getText();

		if (leadname.equals(firstname)) {
			System.out.println("Duplicated name is same as captured name");
		} else {
			System.out.println("Duplicated name is incorrect");
		}
		driver.close();
	}

}
