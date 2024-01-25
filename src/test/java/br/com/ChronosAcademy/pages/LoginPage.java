package br.com.ChronosAcademy.pages;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin() {
        Driver.visibilityOf(loginMap.btnlogin);
        loginMap.btnlogin.click();
    }

    public void clickBtnFechar() {
        loginMap.bntFechar.click();
    }

    public void clickDivFecharModal() {
        loginMap.divFechaModal.click();
    }

    public void setInpUserName(String username) {
        if (username != null) {
            loginMap.inpUserName.sendKeys(username);
        }
    }

    public void setInpPassword(String password) {
        if (password != null) {
            loginMap.inpPassword.sendKeys(password);
        }
    }

    public void clickInpRemember() {
        loginMap.inpRemember.click();
    }

    public void clickLinkCreateAccount() {
        loginMap.linkCreateAccount.click();
    }


    public void clickBtnSignIn() {
        loginMap.btnSignIn.click();
    }

    public boolean isBtnSignIn() {
        return loginMap.btnSignIn.isEnabled();
    }

    public void visibilityOfBtnFechar() {
        Driver.visibilityOf(loginMap.bntFechar);
    }

    public void invisibilityOfBtnFechar() {
        Driver.invisibilityOf(loginMap.bntFechar);
    }

    public void aguardaLoader(){
        Driver.attributeChange(loginMap.divLoader, "display", "none");
    }
    public String getUsuarioLogado() {
        Driver.visibilityOf(loginMap.textLogado);
        return loginMap.textLogado.getText();
    }

    public String getErroLogin(){
        Driver.visibilityOf(loginMap.textErroLogin);
        return loginMap.textErroLogin.getText();
    }
}
