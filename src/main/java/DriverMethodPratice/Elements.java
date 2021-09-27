package DriverMethodPratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Elements {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        driver.get("https://demoqa.com/text-box");

        String getCurrentUrl= driver.getCurrentUrl();
        String getPageSource = driver.getPageSource();
        String Title = driver.getTitle();

        WebElement username = driver.findElement(By.id("userName"));
        username.click();
        username.sendKeys("test name");
        WebElement email;

        email =driver.findElement(By.id("userEmail"));

        email.sendKeys("test@gmail.com");

        WebElement element = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

        driver.findElement(By.id("submit")).click();

       // driver.quit();

        //Scroll to the bottom
        JavascriptExecutor jsExecuterbottom = (JavascriptExecutor)driver;
        jsExecuterbottom.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        //Scroll to the top of the page
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollTop)");

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollLeft)");


        JavascriptExecutor jsExecutercertainpoint = (JavascriptExecutor)driver;
        jsExecutercertainpoint.executeScript("window.scrollTo(0,500)");

    }
}
