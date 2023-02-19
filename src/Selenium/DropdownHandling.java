package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandling {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
            Thread.sleep(5000);

            WebElement dropDown1 = driver.findElement(By.id("dropdown"));

            Select dropDown = new Select(dropDown1);

        //dropDown.selectByIndex(2);
       //dropDown.selectByVisibleText("Option 2");
       //dropDown.selectByValue("2");

            List<WebElement> listofOptions = dropDown.getOptions();

        for (WebElement list1:listofOptions) {
            System.out.println(list1.getText());
        }




    }
}
