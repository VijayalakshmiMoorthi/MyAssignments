package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]"))
				.sendKeys("Vijayalakshmi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[1]/div[1]/a[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Cognizant");
		WebElement element1 = driver.findElement(By.id("updateLeadForm_companyName"));
		String company = element1.getText();

		driver.findElement(By.xpath("//input[@value='Update']")).click();
		WebElement element2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String updatedcompany = element2.getText();

		if (updatedcompany.contains(company)) {
			System.out.println("Company name is properly updated");
		} else {
			System.out.println("Updation didnt happen properly");
		}

		Thread.sleep(2000);
		driver.close();
	}

}
