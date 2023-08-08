package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class stepdefination {
WebDriver driver;

    @When("User open the Website")
    public void user_open_the_website() {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.saucedemo.com/");
    }
    @Then("Fill the User ID")
    public void fill_the_user_id() {
        By Username= By.xpath("//*[@id=\"user-name\"]") ;
        driver.findElement(Username).sendKeys("standard_user");
    }
    @Then("Fill the Password")
    public void fill_the_password() {
        By Password= By.xpath("//*[@id=\"password\"]");
        driver.findElement(Password).sendKeys("secret_sauce");
    }
    @Then("User login")
    public void user_login() {
        By Login=By.xpath("//*[@id=\"login-button\"]");
        driver.findElement(Login).click();
    }

}
