package br.com.ChronosAcademy.steps;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.pages.LoginPage;
import br.com.ChronosAcademy.pages.NewAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class NewAccountSteps {

    NewAccountPage newAccountPage;
    String username;


    @Dado("que a pagina esteja sendo exibida")
    public void queAPaginaEstejaSendoExibida() {
        newAccountPage = new NewAccountPage();
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        Driver.getDriver().get("https://www.advantageonlineshopping.com/#/register");
        Assert.assertEquals("CREATE ACCOUNT", newAccountPage.getTextNewAccount());
    }

    @Quando("os campos estiverem preenchidos com")
    public void osCamposEstiveremPreenchidosCom(Map<String, String> map) {
        username = map.get("username");
        newAccountPage.setInpUserName(map.get("username"));
        newAccountPage.setInpEmail(map.get("email"));
        newAccountPage.setInpPassword(map.get("password"));
        newAccountPage.setInpConfirmPassword(map.get("password"));
        newAccountPage.setSelectCountry(map.get("country"));
        newAccountPage.clickInpIagree();
        newAccountPage.clickBtnRegister();
    }

    @Entao("deve ser possivel logar no sistema apos o cadastro")
    public void deveSerPossivelLogarNoSistemaAposOCadastro() {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(username, loginPage.getUsuarioLogado());


    }
}
