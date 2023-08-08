package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StapDefination_Swaglabs {
    WebDriver driver=commonMethods.driver.webDriver(this.driver);
    @When("User opening the URL")
    public static void Url(){

    }
    @Then("User enters the Username")
    public static void UserName(){

    }
    @Then("User enters the Password")
    public static void password(){

    }
    @And("user clicks the login button")
    public static void Login(){


    }
}
