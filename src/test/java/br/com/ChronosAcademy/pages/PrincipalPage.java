package br.com.ChronosAcademy.pages;

import br.com.ChronosAcademy.maps.PrincipalMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    private WebDriver driver;
    private PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver,principalMap);
    }

    public String getTitulo() {
        return principalMap.txtTitulo.getText();
    }
    public void clickBotao() {
        principalMap.btnTitulo.click();
    }


}
