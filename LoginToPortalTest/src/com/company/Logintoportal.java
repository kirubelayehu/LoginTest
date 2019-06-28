package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintoportal {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver", "/home/calvin/Desktop/chromedriver");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://portal.aait.edu.et/");

        System.out.println("Redirecting....");

        //filling username and password to the user
        webDriver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("atr//09");
        webDriver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("");
        System.out.println("Button Clicked");
        webDriver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div[2]/form/div[4]/div/button")).click();

        System.out.println("Successfully Redirected");
    }
}
