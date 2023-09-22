package com.automation.uiautomationbasics;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        //setup chrome driver
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        //set browser size
        driver.manage().window().maximize();
        //search
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("office chair"+ Keys.ENTER);
        //assertion
        WebElement resultStatusElement=driver.findElement(By.id("result-stats"));
        System.out.println("Result displayed: " + resultStatusElement.isDisplayed());
        driver.quit();


    }
}