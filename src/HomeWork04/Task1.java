package HomeWork04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement startBut= driver.findElement(By.linkText("//button[text()='Start']"));
        startBut.click();
        WebElement finishBut= driver.findElement(By.xpath("//div[@id='finish]"));
        finishBut.click();
        WebElement text= driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println("The text is : "+text.getText());
        driver.quit();
    }
}
