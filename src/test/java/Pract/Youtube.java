package Pract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://facebook.com");

        driver.findElement(By.id("email")).sendKeys("a.mirac.cakmak@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("madafakirerden1");

        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgot password?")).click();

    }
}
