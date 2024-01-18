package br.com.ChronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUser")


    public WebElement btnlogin;
    public WebElement bntFechar;
    public WebElement divFechaModal;
    public WebElement inpUserName;
    public WebElement inpPassword;
    public WebElement btnSignIn;
    public WebElement inpRemember;
    public WebElement linkCreateAccount;

}
