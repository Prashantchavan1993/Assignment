package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakingScreenshot {

            public static void main(String[] args) throws InterruptedException, IOException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\selenium\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://demo.opencart.com/admin/");

            driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
            driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);


            //Recipe
            //we have to typecast driver object into the TakeScreenshot interface (downcasting perform)
            TakesScreenshot sc = (TakesScreenshot) driver;

            //then we have to call getscreenshotas method

            File source= sc.getScreenshotAs(OutputType.FILE);
            //now it is stored somewhere in selenium that we dont know
            //then we have to provide destination so we can see the file
            //so make one package and by right clicking on it copy path and paste in destination varible so we see it afterwords
            // and give the name at last of that scren shot and format
                File destination=new File("C:\\Users\\DELL\\IdeaProjects\\Prashant\\src\\Selenium\\Screenshots\\screenshot of error1.png");

            // we have to copy that file into expected package(means from source to destination)

            FileHandler.copy(source,destination);
        }



    }
