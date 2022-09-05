package sample1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class test1
{
    public static void main(String[] arg) throws InterruptedException {
  System.setProperty("weddriver.chrome.driver",Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();


    // public void randomStringVariable(email) {

      //      int leftLimit = 97; // letter 'a'
        //    int rightLimit = 122; // letter 'z'
        //    int targetStringLength = 10;
        //    Random random = new Random();
           // String generatedString = random.ints(leftLimit, rightLimit + 1)
               //     .limit(targetStringLength)
               //     .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                 //   .toString();
        WebElement email = driver.findElement(By.id("email_create"));
           // String generatedString = {} + "@gmail.com";
        email.sendKeys("rusheni@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        WebElement Radio = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
        Radio.click();
        WebElement Firstname = driver.findElement(By.className("is_required validate form-control"));
        Firstname.sendKeys("Rusheni");
        WebElement Lastname = driver.findElement(By.id("customer_lastname"));
        Lastname.sendKeys("Gunathilaka");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("test1");

    }
}