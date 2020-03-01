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
        driver.get("http://google.com"); //to open a websites
        driver.manage().window().maximize();

        String title=driver.getTitle();
        String expectedTitle="Google";
        System.out.println("Title is ..."+title);
        if (expectedTitle.equalsIgnoreCase(title)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAIL");
        }
        driver.navigate().to("http://amazon.com");
        if(driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        driver.navigate().back();
        verifyEquals(driver.getTitle(),"Google");

        Thread.sleep(1000);

        driver.close();


    }
    public static void verifyEquals(String arg1, String arg2){
        if (arg1.equals(arg2)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
    }
}
