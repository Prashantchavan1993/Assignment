package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DynamicDropdown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //to handle dynamic drop down we have to use action class and into that mouse hover

            driver.get("http://www.unipune.ac.in/");

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.findElement(By.xpath("//span[text()='Academics']"));

        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//span[text()='Academics']"));
        act.moveToElement(ele).perform();

        WebElement ele2 = driver.findElement(By.id("stUI44_txt"));
        act.moveToElement(ele2).perform();


        Thread.sleep(3000);
       // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//span[text()='Biotechnology']"));
        WebElement ele3 = driver.findElement(By.xpath("//span[text()='Biotechnology']"));
        act.moveToElement(ele3).click().build().perform();

    }
}
