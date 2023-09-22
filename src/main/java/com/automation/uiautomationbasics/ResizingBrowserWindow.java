package com.automation.uiautomationbasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizingBrowserWindow {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        Dimension dimension=new Dimension(700,700);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);

        driver.close();
        driver.quit();




    }
}