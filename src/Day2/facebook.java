package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\musta\\OneDrive\\Desktop\\Selenium\\SeleniumTools\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//testcase1();
		//testcase2();
		getTextPractice();
	}
	
	public static void testcase1() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://Facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("automation");
		driver.findElement(By.name("pass")).sendKeys("automation");
		driver.findElement(By.name("login")).click();
		//driver.close();
		
	}
 
	
	public static void testcase2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://Facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("aoutmation");
		driver.findElement(By.name("lastname")).sendKeys("aoutmation");
		driver.findElement(By.name("reg_email__")).sendKeys("aoutmation");
		driver.findElement(By.name("reg_Passwd__")).sendKeys("aoutmation");
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}
		
		
		
		
		public static void getTextPractice(){
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://Facebook.com");
			
			String loginText = driver.findElement(By.name("login")).getText();
			System.out.println("Log in button text " + loginText);
			
			if (loginText.equals("log inn")) {
				System.out.println("test pass");
			}
			else {
				System.out.println("test fail");
				
				
			}
			
		}
		
		
		
 }
 