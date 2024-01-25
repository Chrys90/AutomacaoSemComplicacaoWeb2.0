package br.com.ChronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUser")
    public WebElement btnlogin;
    @FindBy(css = ".closeBtn")
    public WebElement bntFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFechaModal;
    @FindBy(css = "*[name='username']")
    public WebElement inpUserName;
    @FindBy(css = "*[name='password']")
    public WebElement inpPassword;
    @FindBy(css = "#sign_in_btn")
    public WebElement btnSignIn;
    @FindBy(css = "*[name='remember_me']")
    public WebElement inpRemember;
    @FindBy(css = ".create-new-account")
    public WebElement linkCreateAccount;
    @FindBy(css = ".loader")
    public WebElement divLoader;
    @FindBy(css = ".containMiniTitle")
    public WebElement textLogado;

    @FindBy (xpath = "//label[contains(text(), 'Incorrect user name or password.')]")
    public WebElement textErroLogin;
}
