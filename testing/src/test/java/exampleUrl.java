
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exampleUrl {
    @Test
    public void test()
    {
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https:/facebook.com");
        driver.findElement(By.id("email")).sendKeys("durbal008@gmail");
        driver.findElement(By.name("pass")).sendKeys("Durga7789");
        driver.findElement(By.id("loginbutton")).click();


    }

}
