package br.com.ChronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
    WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitulo2(){
        String xpathTitulo = "//section[4]//div/div/div//div//div//div";
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTitulo));
        return  h2Titulo.getText();
    }

}
