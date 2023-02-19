package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/droppable/");


        Actions act = new Actions(driver);

      WebElement elemenetSource= driver.findElement(By.xpath("//div[@id='draggable']"));
      WebElement ElementTarget = driver.findElement(By.xpath("//div[@id='draggable']/following-sibling::div"));

        act.dragAndDrop(elemenetSource,ElementTarget).perform();







    }







}
