package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.navigate().to("https://www.amazon.com/");
        String title= driver.getTitle();
        System.out.println("The title of the page is "+title);
        String URL= driver.getCurrentUrl();
        System.out.println(URL);
        driver.quit();
    }
}


