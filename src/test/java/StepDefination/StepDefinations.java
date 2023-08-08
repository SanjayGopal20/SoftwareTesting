package StepDefination;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class StepDefinations {

    WebDriver driver= commonMethods.driver.webDriver(this.driver);
    @When("User open the URL")
    public void invokeURL() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
    }

    @Then("User enter UserID and Password")
    public  void uidpswd(){

        By userID = By.cssSelector("input[name='username']");
        By pwsd = By.cssSelector("input[name='password']");
        driver.findElement(userID).sendKeys("Admin");
        driver.findElement(pwsd).sendKeys("admin123");
    }

        @And("User logged successfully")
        public  void Logged(){

        By loginButton = By.cssSelector("button[type='submit']");
        driver.findElement(loginButton).click();

        }
}

