package HomeWork06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton= driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement PIM= driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        List<WebElement> ID=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i < ID.size(); i++) {
            String text=ID.get(i).getText();
            if (text.equalsIgnoreCase("52328A")){
                System.out.println("The ID is in row is "+(i+1));
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }

        }
        driver.quit();

    }
}
