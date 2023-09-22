package com.automation.uiautomationbasics;


import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMultipleSearchArray {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver=new ChromeDriver();
        DateTime openTime=new DateTime();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        String[] productName={"java book","ipad","pen"};
        Thread.sleep(3000);
        for (String keywords:productName) {
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keywords + Keys.ENTER);
            driver.navigate().back();
        }

        driver.close();
        driver.quit();




    }
}