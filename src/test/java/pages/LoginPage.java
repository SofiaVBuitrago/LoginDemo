package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By textbox_username = By.name("name");
    By textbox_password = By.name("password");

    By btn_login = By.id("submit");

    /*acá vamos a crear un constructor para llamar el driver de los steps definitions*/
    public LoginPage(){

    }
    public void EnterUsername (String username){
        driver.findElement(textbox_username).sendKeys(username);
    }

    public void EnterPassword (String password){
        driver.findElement(textbox_password).sendKeys(password);
    }

    public void ClickLogin (){
        driver.findElement(btn_login).click();
    }

   /* public void loginValidUser(String username,String password){

        driver.findElement(textbox_username).sendKeys(username);
        driver.findElement(textbox_password).sendKeys(password);
        driver.findElement(btn_login).click();


    } acá lo hicimos todo en una función pero es más ordenado tenerlo separado */

}
