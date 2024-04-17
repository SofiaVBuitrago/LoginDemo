package StepDefinitions;

/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginDDTStepsPOM {

    WebDriver driver = null;
    @Given("student is on login page")
    public void student_is_on_login_page() {
        System.out.println("Student is on the login page");
        String MyProjectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.edge.driver", MyProjectPath + "/src/test/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }
    @When("^student types the (.*) and (.*)$")
    public void student_types_the_student_and_pass123(String username, String password) throws InterruptedException {
        System.out.println("user types the username and password");

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(4000);// 4 segundos


    }
    @And("clicks on the Login button DDT")
    public void clicks_on_the_login_button_ddt() {
        System.out.println("clicks on the Login button");
        driver.findElement(By.id("submit")).click();
    }
    @Then("the student is sent  to the congratulations page")
    public void the_student_is_sent_to_the_congratulations_page() throws InterruptedException {
        System.out.println("the user is sent  to the congratulations page");
        if (driver.findElement(By.className("wp-block-button__link")).isDisplayed()){
            System.out.println("YES WE ARE IN");
        }else{
            System.out.println("OH NO I FAILED :V");
        }
        // driver.findElement(By.className("wp-block-button__link")).isDisplayed();
        Thread.sleep(2000);// 2 segundos


        driver.close();
        driver.quit();
    }
}
*/