package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List<WebElement> checkBtns=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement btn:checkBtns){
            String option=btn.getAttribute("value");
            if(option.equalsIgnoreCase("option-1")) {
                btn.click();
                Thread.sleep(3000);
                driver.quit();

            }
        }
    }
}
