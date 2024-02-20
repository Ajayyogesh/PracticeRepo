package com.seleniumPrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeltaAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.delta.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        WebElement fromLocation = driver.findElement(By.xpath("//input[@name='fromAirportCode']//preceding-sibling::span[contains(@class,'airport-code')]"));
        WebElement toLocation = driver.findElement(By.xpath("//input[@name='arrivalCity']//preceding-sibling::span[contains(@class,'airport-code')]"));

        fromLocation.click();
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("bangalore");
        WebElement location = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Bangalore')]")));
        location.click();




    }
}
