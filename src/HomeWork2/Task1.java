package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to( "https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Jennifer");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kerolus");
        driver.findElement(By.name("customer.address.street")).sendKeys("1234 pump rd");
        driver.findElement(By.name("customer.address.city")).sendKeys("Richmond");
        driver.findElement(By.name("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("23233");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("89888776");
        driver.findElement(By.id("customer.ssn")).sendKeys("987654321");
        driver.findElement(By.name("customer.userName")).sendKeys("Tester");
        driver.findElement(By.name("customer.password")).sendKeys("test");
        driver.findElement(By.name("repeatedPassword")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        driver.close();





    }
}
