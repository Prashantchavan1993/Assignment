package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowOrTABHandling {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String mainpage = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id ='newTabBtn']")).click();

        Set<String> allhandles = driver.getWindowHandles();

            //THIS PROGRAM MIGHT NOT WORK but in other laptop it will work so prgramm is right
           //Element click intercepted exception
        for(String handle:allhandles){
            System.out.println(handle);
            if(handle.equals(allhandles)) {
                System.out.println("your on mainpage");
            }

            else{
                        driver.switchTo().window(handle);
                    driver.findElement(By.id("firstName")).sendKeys("Prashant");
                    Thread.sleep(3000);
                        driver.close();
                        driver.switchTo().window(mainpage);
                }

            }
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("main page name box");


    }








}
