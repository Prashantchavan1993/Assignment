package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions act = new Actions(driver);
        //impot that calss by right clicking on red Actions
       // finding of this xpath is by xpath axis
        WebElement element = driver.findElement(By.xpath("//a[@href='/users/2']/parent::div/preceding-sibling::img"));

            act.moveToElement(element).perform();
            String textof_user2=driver.findElement(By.xpath("//h5[text()='name: user2']")).getText();
        System.out.println("text of user2 after mouse hover is ::  "+textof_user2);

    }



}
