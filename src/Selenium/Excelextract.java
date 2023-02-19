package Selenium;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excelextract {

    public static void main(String[] args) throws InterruptedException, IOException {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\selenium\\chromedriver.exe");


       // System.setProperty("Webdriver.Chrome.driver","./lib/chromedriver");
       // driver =new ChromeDriver(ops);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
      //  driver.findElement(By.xpath("//a[text()='View Demo']")).click();
      //  driver.findElement(By.xpath("//a[@href='http://demo.opencart.com/admin/']")).click();
        FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\demo excel.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        String data = workbook.getSheet("id").getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys(data);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(data);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn-close']")).click();
      //  driver.findElement(By.xpath("//i[@class='fas fa-bars']")).click();
        driver.findElement(By.xpath("//a[@href='#collapse-1']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[contains(@href,'product&user_token')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='fas fa-plus']")).click();
        Thread.sleep(1000);
      //  FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\demo excel.xlsx");
      //  XSSFWorkbook workbook = new XSSFWorkbook(file);
        String productname = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(productname);

    }



}
