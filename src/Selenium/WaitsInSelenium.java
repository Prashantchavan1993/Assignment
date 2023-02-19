package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsInSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();


               // driver.get("https://demoqa.com/dynamic-properties");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); //this is implicit waits to load complete dom

     //  String buttonAfterloading_dom=  driver.findElement(By.id("visibleAfter")).getText();
       // System.out.println("text of button appears after loading the complete Dom is ::" + buttonAfterloading_dom);





        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
         driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo"))); //this is explicite wait



        boolean elementAfetrSomeTime= driver.findElement(By.id("demo")).isDisplayed();


        System.out.println("Perticular element appears after some time:: "+ elementAfetrSomeTime);

        driver.quit();
    }





}
