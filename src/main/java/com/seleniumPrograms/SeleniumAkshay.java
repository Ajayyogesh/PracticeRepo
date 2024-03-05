package com.seleniumPrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class SeleniumAkshay {
    public static void main(String[] args) {
//        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File s1 = screenshot.getScreenshotAs(OutputType.FILE);
        System.out.println(s1);

    }
}
