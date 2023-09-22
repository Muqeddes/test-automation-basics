package com.automation.uiautomationbasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        // Adding number of children to buy a ticket
        driver.findElement(By.id("divpaxinfo")).click();
        for (int i=0;i<=2;i++){
            Thread.sleep(1000);
            driver.findElement(By.id("hrefIncChd")).click();

        }
        Thread.sleep(1000);

        driver.quit();



    }
}
