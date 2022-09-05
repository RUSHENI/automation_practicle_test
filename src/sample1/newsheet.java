package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newsheet {
    public static void main(String[] arg) throws InterruptedException {
        System.setProperty("weddriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("rushenigunathilaka@gmail.com");
        WebElement password  = driver.findElement(By.id("passwd"));
        password.sendKeys("Rushi123");
        driver.findElement(By.id("SubmitLogin")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]/span")).click();
    }
}
