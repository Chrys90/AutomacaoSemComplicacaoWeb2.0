package br.com.ChronosAcademy.pages;

import br.com.ChronosAcademy.maps.CursoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    WebDriver driver;
    CursoMap cursoMap;


    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver,cursoMap);
    }
    public String getTitulo2(){
       return cursoMap.h2Titulo.getText();
    }

}
