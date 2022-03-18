package Section7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		String text="Rahul";
		
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		
		
		driver.switchTo().alert().dismiss();
		
		
		
	}
	
	
}

