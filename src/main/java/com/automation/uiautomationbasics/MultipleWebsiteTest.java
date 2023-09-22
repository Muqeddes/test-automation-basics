package com.automation.uiautomationbasics;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWebsiteTest {
    public static void main(String[] args) throws InterruptedException {
        Map<String,String> webSites=new HashMap<>();
        webSites.put("Google","https://google.com");
        webSites.put("YouTube","https://youtube.com");
        webSites.put("Amazon","https://amazon.com");

        WebDriver driver=new ChromeDriver();

        Set<String> keys=webSites.keySet();
        for(String k:keys){

            //setup stopwatch to get total time
            StopWatch watch=new StopWatch();
            watch.start();
            driver.get(webSites.get(k));

            if(driver.getTitle().contains(k)){
                System.out.println(k+" Open Successfully. Test Passed!");
                watch.stop();
                System.out.println(k+" opened within "+watch.getTime(TimeUnit.MILLISECONDS));
            }
            Thread.sleep(1000);
        }
        driver.close();
        driver.quit();

    }
}