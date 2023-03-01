package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstName")).sendKeys("Jennifer");
        driver.findElement(By.name("lastName")).sendKeys("Kerolus");
        driver.findElement(By.id("reg_email__")).sendKeys("jenny@gmail.com");
        driver.findElement(By.id("reg_passwd__")).sendKeys("test");
        driver.findElement(By.id("birthday_month")).sendKeys("October");
        driver.findElement(By.id("birthday_day")).sendKeys("21");
        driver.findElement(By.id("birthday_year")).sendKeys("1987");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.className("websubmit")).click();
        driver.findElement(By.id("u_b_9_xA")).click();
        driver.quit();






    }
}
