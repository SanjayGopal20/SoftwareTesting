package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubUser {

    WebDriver driver=commonMethods.driver.webDriver(this.driver);

    @When("Client opens the URL")
    public void URL() throws InterruptedException {
    driver.get("https://gh-users-search.netlify.app/");
        Thread.sleep(3000);
    }
    @Then("Client Searching User name")
    public void Username(){
        By UserName= By.cssSelector("input[type='text']");
        driver.findElement(UserName).sendKeys("");
    }
    @Then("Client click the SearchButton")
    public void Search(){
        By search= By.cssSelector("input[type='text']");
        driver.findElement(search).click();

    }
}
