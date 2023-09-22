package com.automation.uiautomationbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        //driver setup with selenium 4.11.0
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");
        //set browser size
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("smart watch" + Keys.ENTER);

        driver.navigate().back();
        driver.close();
        driver.quit();

    }
}
