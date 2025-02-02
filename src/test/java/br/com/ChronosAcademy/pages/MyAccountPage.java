package br.com.ChronosAcademy.pages;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.maps.MyAccountMap;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    MyAccountMap myAccountMap;

    public MyAccountPage(){
        myAccountMap = new MyAccountMap();
        PageFactory.initElements(Driver.getDriver(),myAccountMap);
    }

    public void clickLinkUser(){
        Driver.visibilityOf(myAccountMap.linkUser);
        myAccountMap.linkUser.click();
    }

    public void clickLinkMyAccount(){
        Driver.visibilityOf(myAccountMap.linkMyAccount);
        myAccountMap.linkMyAccount.click();
    }
    public void clickLinkEdit(){
        Driver.visibilityOf(myAccountMap.linkEdit);
        myAccountMap.linkEdit.click();
    }

    public String getTextUsuario(){
        Driver.visibilityOf(myAccountMap.textUsuario);
        return myAccountMap.textUsuario.getText();
    }

    public void clickBtnDelete(){
        Driver.visibilityOf(myAccountMap.btnDelete);
        myAccountMap.btnDelete.click();
    }

    public void clickBtnYes(){
        Driver.visibilityOf(myAccountMap.btnYes);
        myAccountMap.btnYes.click();
    }
    public String getTextDelete(){
        Driver.visibilityOf(myAccountMap.txtDelete);
        return myAccountMap.txtDelete.getText();
    }

}

