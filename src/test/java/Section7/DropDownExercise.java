package Section7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownExercise {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println("Adult number before automation");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for (int i = 1; i<9; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("\nAfter automation ");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	}
}
