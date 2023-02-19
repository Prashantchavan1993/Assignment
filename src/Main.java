import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
            driver.get("https://demo.opencart.com/admin/");

            driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn-close']")).click();
       String text= driver.findElement(By.xpath("//h2[@class='float-end']")).getText();

        System.out.println("currently total orders are "  +   text);


    }
}
