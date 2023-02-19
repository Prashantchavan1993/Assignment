package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Herointernet {

        public static void main(String[] args) throws InterruptedException, IOException {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");

          //  driver.findElement(By.xpath("//a[text()='A/B Testing']")).click();
            //Thread.sleep(5000);
           //String text = driver.findElement(By.xpath("//h3[text()='A/B Test Variation 1']")).getText();
            //System.out.println("Heading text is "  +   text);
          /*  driver.findElement(By.xpath("//a[text()='Forgot Password']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prashantc556@gmail.com");
            driver.findElement(By.xpath("//i[text()='Retrieve password']")).click();

            TakesScreenshot sc = (TakesScreenshot) driver;
            File source= sc.getScreenshotAs(OutputType.FILE);
            File destination=new File("C:\\Users\\DELL\\IdeaProjects\\Prashant\\src\\Selenium\\Screenshots\\error of not taking email.png");
            FileHandler.copy(source,destination);
*/
//add and remove element-
          /*  driver.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Add Element']")).click();
            driver.findElement(By.xpath("//button[@class='added-manually']")).click();
*/
            //checkbox-

           /* driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='checkbox']")).click();
*/
//downloading link and file-
           /* driver.findElement(By.xpath("//a[@href='/download']")).click();
            driver.findElement(By.xpath("//a[@href='download/993FE391-40DE-42E8-9ECD-9A685BB73A47.jpeg']")).click();
*/

            //dissapering element-contact us

           //driver.findElement(By.xpath("//a[@href='/disappearing_elements']")).click();
            //driver.findElement(By.xpath("//a[@href='/contact-us/']")).click();

        //FORK ME ON GITHUB link CLICK ON THAT -
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@href='https://github.com/tourdedave/the-internet']")).click();      }







}
