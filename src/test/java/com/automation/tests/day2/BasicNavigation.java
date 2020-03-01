package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        //to start selenium script we need:
        //setup WebDriver (browser driver)and create WebDriver object
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //In selenium, everything starts from WebDriver interface
        driver.get("http://google.com"); //to open a website

        Thread.sleep(3000);
        driver.close();


    }
}
