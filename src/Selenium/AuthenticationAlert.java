package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class AuthenticationAlert {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //so we have to add user id and password in url after https
        //user id=admin
        //password=admin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(3000);
       String BasicAuth = driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();

        System.out.println(BasicAuth);




    }




}
