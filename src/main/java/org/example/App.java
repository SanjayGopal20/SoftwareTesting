package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(opt);
    String LoginID;
    String password;
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
    By Username= By.cssSelector("input[name='username']");
    By Password= By.cssSelector("input[name='password']");
    By submit= By.cssSelector("button[type='submit']");
    By loginIdString = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/p[1]");
    By pswdString = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/p[2]");

    LoginID=driver.findElement(loginIdString ).getText();
    password = driver.findElement(pswdString ).getText();
//        System.out.printf(LoginID);
//        System.out.printf(password);

        String[] actualLoginID = LoginID.split(":");
        LoginID = actualLoginID[1].trim();

        password=driver.findElement(pswdString).getText();
        String[] actualpassword = password.split(":");
        password =actualpassword[1].trim();
//        System.out.println(password);
    //code need to be added



//
//
    driver.findElement(Username).sendKeys(LoginID);
    driver.findElement(Password).sendKeys(password);
//    https://rahulshettyacademy.com/dropdownsPractise/
//
    By Login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    driver.findElement(Login).click();

    Thread.sleep(5000);
    By Searchbar= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input");
    driver.findElement(Searchbar).sendKeys("Maintenance");
    driver.findElement(Searchbar).click();
    By Maintanance= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span");
    driver.findElement(Maintanance).click();
    Thread.sleep(2000);
        By maintanancePassword= By.cssSelector("input[name='password']");
    driver.findElement(maintanancePassword).sendKeys("admin123");
    driver.findElement(submit).click();
//        WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        Select se = new Select(dropDown);
//        se.selectByIndex(2);
    }
}
