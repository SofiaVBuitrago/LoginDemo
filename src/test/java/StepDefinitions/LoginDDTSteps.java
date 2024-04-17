package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginDDTSteps {

    WebDriver driver = null;
    @Given("student is on login page")
    public void student_is_on_login_page() {
        System.out.println("Student is on the login page");
        String MyProjectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.edge.driver", MyProjectPath + "/src/test/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://digital.stage.greatminds.dev/login/email");
    }
    @When("^student types the (.*) and (.*)$")
    public void student_types_the_student_and_pass123(String username, String password) throws InterruptedException {
        System.out.println("user types the username and password");

        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(4000);// 4 segundos


    }
    @And("clicks on the Login button DDT")
    public void clicks_on_the_login_button_ddt() {
        System.out.println("clicks on the Login button");
        driver.findElement(By.xpath( "//*[@aria-label='Log in']")).click();

       /* driver.findElement(By.className("EnhancedInputstyled__StyledFullEnhancedInputProps-sc-1o5p0a-0 fksJYv")).sendKeys("Test@123");
        driver.findElement(By.id("confirmPassword")).sendKeys("Test@123");
        driver.findElement(By.className("SetPasswordformstyled__StyledEnabledBtnText-sc-1j69lzg-2 fFrCBL")).click();*/
    }
    @Then("the student is sent  to the congratulations page")
    public void the_student_is_sent_to_the_congratulations_page() throws InterruptedException {
        System.out.println("the user is sent  to the congratulations page");
        Thread.sleep(5000);
       /* driver.findElement(By.xpath("//*[@class= 'EnhancedInputstyled__StyledInput-sc-1o5p0a-6 gnVItv']")).click();*//*sendKeys("Test@123");*/
        driver.findElement(By.xpath("//*[@class= 'EnhancedInputstyled__StyledInput-sc-1o5p0a-6 gnVItv']")).sendKeys("Test@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id= 'confirmPassword']")).sendKeys("Test@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class= 'Buttonstyled__ButtonContainer-sc-1qfdo0o-0 dimIxh SetPasswordformstyled__ContinueButton-sc-1j69lzg-3 dXsNWR']")).click();



      /*  if (driver.findElement(By.className("wp-block-button__link")).isDisplayed()){
            System.out.println("YES WE ARE IN");
        }else{
            System.out.println("OH NO I FAILED :V");
        }*/
        /*driver.findElement(By.className("wp-block-button__link")).isDisplayed();*/
        /*Thread.sleep(2000);// 2 segundos*/


        /*driver.close();
        driver.quit();*/
    }
}
