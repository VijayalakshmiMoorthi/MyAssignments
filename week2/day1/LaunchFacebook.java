package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver(); // instantiate the browser driver
		driver.get("https://www.facebook.com/login"); // to launch the URL
		driver.manage().window().maximize(); //maximize the window size
		driver.close(); // close browser
	}

}
