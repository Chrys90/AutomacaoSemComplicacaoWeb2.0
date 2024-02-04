package br.com.ChronosAcademy.pages;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.maps.EditAccountMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditAccountPage {
    EditAccountMap editAccountMap;

    public EditAccountPage() {
        editAccountMap = new EditAccountMap();
        PageFactory.initElements(Driver.getDriver(), editAccountMap);
    }

    public void setInpFirstName(String firstName) {
        Driver.visibilityOf(editAccountMap.inpFirstName);
        editAccountMap.inpFirstName.clear();
        editAccountMap.inpFirstName.sendKeys(firstName);
    }

    public void setInpLastName(String lastname) {
        editAccountMap.inpLastName.clear();
        editAccountMap.inpLastName.sendKeys(lastname);
    }

    public void clickBtnSave() {
        Driver.aguardaOptions(new Select(editAccountMap.slcCountry));
        Driver.visibilityOf(editAccountMap.bntSave);
        editAccountMap.bntSave.click();
    }

}
