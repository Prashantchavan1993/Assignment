import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public String selectPrice(String productname){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.asos.com/search/?q=t-shirt");
    WebElement priceofTshirt =  driver.findElement(By.xpath("//h2[text()='"+productname+"']/parent::div/parent::div/parent::div/parent::a//span/span"));
   String ammountOfTshirt =  priceofTshirt.getText();
   return ammountOfTshirt;
    }

    public static void main(String[] args) {
        Xpath obj = new Xpath();
        System.out.println(obj.selectPrice("BOSS Green Tee bold logo t-shirt in black"));

    }



}



