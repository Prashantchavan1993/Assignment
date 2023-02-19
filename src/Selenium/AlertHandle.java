package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        //PRINTING TEXT OF POPUP
       // driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
      //  String titleofpopu= driver.switchTo().alert().getText();
      //  System.out.println(titleofpopu);


        //ENTERING TEXT IN POPUPS-

        //driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        //Thread.sleep(300);
        //driver.switchTo().alert().sendKeys("hi prashant");
        //driver.switchTo().alert().accept();

        //CLICK ON OK POPUP
       //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
       // driver.switchTo().alert().accept();

        //CLICK ON CANCEL
       driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();








    }

}



