package com.seleniumPrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class SeleniumIntro {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//        WebElement usrName = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
//        WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
//        WebElement loginBtn = driver.findElement(By.id("login-button"));
//
//
//
//        usrName.sendKeys("standard_user");
//        password.sendKeys("secret_sauce");
//        System.out.println(usrName.getAttribute("value"));
////        loginBtn.click();
//        TakesScreenshot ts = (TakesScreenshot) driver;
//
//        File ss = ts.getScreenshotAs(OutputType.FILE);
//        System.out.println(ss);

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.xpath("//img[@src= \"images/high_tatras_min.jpg\"]"));
        WebElement dest = driver.findElement(By.xpath("//div[@id=\"trash\"]"));

        actions.dragAndDrop(source,dest).perform();



    }
}
