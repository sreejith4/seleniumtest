package com.mycompany.app.addressbook_selenium_ide;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","/home/ubuntu/selenium/chromedriver");
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        System.out.println("Welcome to demo for selenium chrome webdriver");
        
        driver.get("http://13.235.78.97:8888/");
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.className("v-button")).click();
          driver.findElement(By.id("gwt-uid-5")).sendKeys("Sreejith4edureka2");
          driver.findElement(By.id("gwt-uid-7")).sendKeys("Devops2");
          driver.findElement(By.id("gwt-uid-9")).sendKeys("8861679781");
          driver.findElement(By.id("gwt-uid-11")).sendKeys("Sreejith4edureka22@edureka.com");
          driver.findElement(By.id("gwt-uid-13")).sendKeys("01/02/2020");
       driver.findElement(By.className("v-button-primary")).click();
       //Thread.sleep(5000);
       //driver.quit();
       
         
    }
}
