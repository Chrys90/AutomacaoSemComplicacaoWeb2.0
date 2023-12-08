package br.com.ChronosAcademy.automacaoWeb;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.pages.CursoPage;
import br.com.ChronosAcademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class testeWeb {
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void InicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br/");
        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void PrimeiroTeste(){
        String Titulo = principalPage.getTitulo();
        assertEquals("Porque Tempo É Conhecimento.",Titulo);
    }

    @Test
    public void SegundoTeste(){
        cursoPage = new CursoPage(driver);
        principalPage.clickBotao();
        //  driver = driverWeb.getDriver();
      //  driver.get("https://chronosacademy.orbitpages.online/");
       String Titulo = cursoPage.getTitulo2();
       assertEquals("Conheça todos os nossos cursos.",Titulo);
    }



    @After
    public void FinalizaTeste(){
        driver.quit();
    }






}




