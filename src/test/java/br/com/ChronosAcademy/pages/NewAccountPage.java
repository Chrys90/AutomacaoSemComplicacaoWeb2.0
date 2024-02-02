package br.com.ChronosAcademy.pages;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
    NewAccountMap newAccountMap;

    public NewAccountPage() {
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTextNewAccount() {
        Driver.visibilityOf(newAccountMap.textCreateAccount);
        return newAccountMap.textCreateAccount.getText();
    }

    public void setInpUserName(String userName) {
        newAccountMap.inpUsername.sendKeys(userName);
    }

    public void setInpEmail(String email) {
        newAccountMap.inpEmail.sendKeys(email);
    }

    public void setInpPassword (String password){
        newAccountMap.inpPassword.sendKeys(password);
    }
    public void setInpConfirmPassword (String password){
        newAccountMap.inpConfirmPassword.sendKeys(password);
    }

    public void setSelectCountry (String country){
        Select select = new Select(newAccountMap.slcCountry);
        Driver.aguardaOptions(select);
        select.selectByVisibleText(country);

    }

    public void clickInpIagree(){
        newAccountMap.inpIagree.click();
    }

    public void clickBtnRegister(){
        newAccountMap.btnRegister.click();
    }

}
