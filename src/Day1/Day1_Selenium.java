package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Selenium {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\musta\\OneDrive\\Desktop\\Selenium\\SeleniumTools\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee mug");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.name("q")).sendKeys("")
		driver.findElement(By.linkText("Customer Service")).click();
		
		
		
	}

}
