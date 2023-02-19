import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Random {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.goibibo.com/cars/");

         //  driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/section[1]/section/div[2]/div/label")).click();
        driver.findElement(By.xpath("//*[@id=\"downshift-2-input\"]")).sendKeys("mumbai");
        Thread.sleep(3000);

      List<WebElement> list =driver.findElements(By.xpath("//*[@id=\"root\"]/section/section/section[1]/section/div[2]/section"));

     int a= list.size();

        System.out.println(a);
      //  driver.findElement(By.xpath("//*[@id=\"downshift-1-item-3\"]/li")).click();
     //   Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@id=\"downshift-2-input\"]).sendKeys(Keys.ARROW_DOWN);
      //  driver.findElement(By.xpath("//*[@id=\"downshift-2-input\"]")).sendKeys(Keys.ARROW_DOWN);
           // driver.findElement(By.xpath("//*[@id=\"downshift-2-item-0\"]/li/div/p[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"downshift-2-input\"]")).sendKeys(Keys.ENTER);
               // driver.quit();


    }
}


