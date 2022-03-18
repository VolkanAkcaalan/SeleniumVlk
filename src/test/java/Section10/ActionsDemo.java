package Section10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


        public class ActionsDemo {

            public static void main(String[] args) {

                WebDriverManager.chromedriver().setup();

                WebDriver driver = new ChromeDriver();

                WebDriverWait wait = new WebDriverWait(driver, 5);

                driver.get("https://www.amazon.com/");





                WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

                Actions a = new Actions(driver);
                a.moveToElement(move).build().perform();



                a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
            }
        }

