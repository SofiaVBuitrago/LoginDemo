package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSteps {

    WebDriver driver = null;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on the login page");
        String MyProjectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.edge.driver", MyProjectPath + "/src/test/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }
    @When("user types the username and password")
    public void user_types_the_username_and_password() {
        System.out.println("user types the username and password");
        driver.findElement(By.name("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");

    }
    @And("clicks on the Login button")
    public void clicks_on_the_login_button() {
        System.out.println("clicks on the Login button");
        driver.findElement(By.id("submit")).click();

    }
    @Then("the user is sent  to the congratulations page")
    public void the_user_is_sent_to_the_congratulations_page() {

        System.out.println("the user is sent  to the congratulations page");
        if (driver.findElement(By.className("wp-block-button__link")).isDisplayed()){
            System.out.println("YES WE ARE IN");
        }else{
            System.out.println("OH NO I FAILED :V");
        }
       // driver.findElement(By.className("wp-block-button__link")).isDisplayed();

    }

}
