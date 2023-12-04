package br.com.ChronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class testeWeb {
    ChromeDriver driver;

    @Before
    public void InicializaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br/");
    }

    @Test
    public void PrimeiroTeste(){
        String xpathTitulo = "//section[2]/div[3]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String Titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.",Titulo);
    }

    @After
    public void FinalizaTeste(){
        driver.quit();
    }






}




