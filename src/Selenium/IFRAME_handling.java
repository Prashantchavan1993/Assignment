package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class IFRAME_handling {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("https://courses.letskodeit.com/practice");
      //  Thread.sleep(15000);
      //  driver.switchTo().frame("courses-iframe");
       // driver.switchTo().
      //  driver.findElement(By.xpath("//a[@href='/courses/javascript-for-beginners']")).click();
      // String headerofJAVAcourse= driver.findElement(By.xpath("//h1[contains(text(),'JavaScript for beginners')]")).getText();

       // System.out.println(headerofJAVAcourse);

        //printing BOOTOM FRAME HEADER-
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-bottom");
      String bottomheader=  driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();

        System.out.println(bottomheader);

        //printing LEFT FRAME HEADER-
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
       String leftheader= driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
        System.out.println( leftheader);

        ////printing MAIN PAGE HEADER-
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.navigate().to("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);
        String mainpageheader = driver.findElement(By.xpath("//h1[text()='Welcome to the-internet']")).getText();
        System.out.println(mainpageheader);

    }






}
