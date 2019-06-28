package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class LoginToGmail {

//    public static void main(String[] args) {
//
//    }
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/home/calvin/Desktop/chromedriver");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=1&navigationDirection=forward");
//
//        System.out.println("Redirecting....");
//
//
//        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("kirubelayehu@gmail.com");
//        System.out.println("Filling Email field");
//
////        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div[2]")).click();
//        driver.navigate().forward();
//        System.out.println("Redirecting To password field ...Next");
//
////        driver.findElement(By.xpath("\n")).sendKeys("0917152330k");
//        driver.findElement(By.xpath("//*[@id=\"//*[@id=\"password\"]/div[1]/div/div[1]/input\"]")).sendKeys("0917152330k");
//        System.out.println("Filling Password Field...");
//
//
//        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div[2]")).click();
//        System.out.println("Redirecting to Gmail Home page ...Next");
//        String expectedUrl="";
//        if (driver.getCurrentUrl().equals(expectedUrl)){
//            System.out.println("Successfully Redirected");
//
//            String title=driver.getTitle();
//            System.out.println("Page title :" + title);
//            String expectedtitle="";
//            if (title.equals(expectedtitle)){
//                int numofnewmessage=Integer.parseInt(driver.findElement(By.xpath("")).getText());
//                if (numofnewmessage>0){
//                    System.out.println(numofnewmessage);
//
//                   // File outputfile=new File();
//                    //expected to create doc file and save new message files
//                }
//                else{
//                    System.out.println("Error Ocurred During finding new messages" );
//                }
//            }
//            else{
//                System.out.println("Not Expected title Current Page Title is :" + title);
//            }
//        }
//        else{
//            System.out.println("Not Expected Url Current Url is :" + driver.getCurrentUrl() +" Expected Url  is  : expectedUrl ");
//        }
//
//
//
//        driver.close();
//
//    }

}
