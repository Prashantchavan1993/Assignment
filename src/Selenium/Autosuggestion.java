package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Autosuggestion {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Univercity of pune");

        String optionToselect = "university of pune logo";  //here spelling of univercity is diiferent in autosuggetion

        //here we use findelements method to take list of elements
        // find the xpath of list so matching in dom is 1 of 11 Not 1 of 1
        //here find the xpath of all suggention list 1 of 12 matching & save in list

            Thread.sleep(5000);



         //some times it open new windwo in google some times not so program will work accodingly
        //some times window opend does not affect the result
        List<WebElement> listofsuggestions = driver.findElements(By.xpath("//div[@role='option']"));
       // System.out.println(listofsuggestions);


        for (WebElement ele:listofsuggestions){
            String currentoption = ele.getText();

            if(currentoption.contains(optionToselect)){

                ele.click();
                break;

            }


        }

    }
}
