package DriverMethodPratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DriverBasics {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

        /*


         */
/*

        find eleement()
        find elements()
        getTitle() --done
        getCurrentUrl() --done
        manage() --done (winodw.maximize and deleteAllCookies,timeouts()-implicitWait)
        navigate() -(forward,back,refresh,get)
        switchTo() -windows(getWindiowHandle(),getWindowHandles(),get(),getTitle())
        close()
        quit()
        getWindowHandle()
        getWindowHandles()

         *//*


        //Maximize the window

        driver.manage().deleteAllCookies();
        driver.get("https://www.google.co.in");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
       // driver.navigate().forward();
        driver.navigate().refresh();


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        driver.get("https://www.google.com/");

        WebDriverWait  wait = new WebDriverWait(driver,1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"))).click();

        driver.get("http://demo.automationtesting.in/Register.html");

        */
/*driver.get("https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver");
        WebElement element = driver.findElement(By.linkText("Try Wait Commands in Selenium for Free"));
        element.click();

        driver.get("http://demo.automationtesting.in/Register.html");
        *//*


        try{
            driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy Policys"))).click();

        }
        catch(TimeoutException e)
        {
            System.out.println("timeout");
        }
        finally {


            driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy Policy"))).click();

        }

        //accept all cookies
        //https://stackoverflow.com/questions/66233618/handling-accept-all-cookies-popup-using-selenium-in-python
*/
/*
        driver.get("http://demo.automationtesting.in/Register.html");

       // String text1 = driver.findElement(By.xpath("//input[@ng-model='FirstName']")).getText();
        Dimension text2 =driver.findElement(By.xpath("//input[@ng-model='FirstName']")).getSize();
        String text3= driver.findElement(By.xpath("//input[@ng-model='FirstName']")).getAttribute("ng-model");
        String text4=driver.findElement(By.xpath("//input[@ng-model='FirstName']")).getTagName();
        Point text5=driver.findElement(By.xpath("//input[@ng-model='FirstName']")).getLocation();

        System.out.println(text2);*/
/*
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("Test");

 */
     /*   driver.switchTo().window("1").getWindowHandle();
        driver.switchTo().window("").getWindowHandles();
        driver.switchTo().window("").get("");
        driver.switchTo().window("").getTitle();
*/

        /*driver.get("https://www.naukri.com/mnjuser/homepage");

        String Parent_Window = driver.getWindowHandle();

        driver.findElement(By.xpath("//ul[@class='midSec menu']/li[2]/a[1]")).click();*/
/*
Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com
Browse Jobs by Company - Jobs in Top Companies - Naukri.com
HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com
Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com
 */

       /* driver.findElement(By.xpath("//ul[@class='otherSec']/li[1]/a")).click();


        Set<String> s = driver.getWindowHandles();



        Iterator<String> itls = s.iterator();

        while(itls.hasNext())
        {
            String ChildWindow = itls.next();
            System.out.println(ChildWindow);
            driver.switchTo().window(ChildWindow);
            String title = driver.getTitle();
            System.out.println(title);

        }*/

        //Switching back to Parent Window
       /* driver.switchTo().window(Parent_Window);
        String urls = driver.getCurrentUrl();
        System.out.println(urls);*/

        /*

        The concept of new tab and new window handle is just moving to the content and handle on the things.

         The proper  way to switch the specific tabs is by title or by unique element in the page
         */
       /* String a = "window.open('');";
        ((JavascriptExecutor)driver).executeScript(a);*/

        driver.get("https://about.google/");

       // driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(text(),'OK, Got it')]")));
        driver.findElement(By.xpath("//*[contains(text(),'OK, Got it')]")).click();
    }
}


