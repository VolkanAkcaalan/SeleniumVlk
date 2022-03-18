package day02;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;



    public class AutoSuggestive {



        public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


            WebDriverManager.chromedriver().setup();

            WebDriver driver =new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

            driver.findElement(By.id("autosuggest")).sendKeys("ind");

            Thread.sleep(3000);

            List<WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

            for(WebElement option :options)

            {

                if(option.getText().equalsIgnoreCase("India"))

                {

                    option.click();

                    break;

                }

            }

        }

    }
