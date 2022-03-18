package UdemyPracticess;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='CMB']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		
	}
	
	
}
