package br.com.ChronosAcademy.steps;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.enums.Browser;
import br.com.ChronosAcademy.pages.LoginPage;
import br.com.ChronosAcademy.pages.NewAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.util.Map;
import java.util.function.Function;


public class LoginSteps {

    LoginPage loginPage;
    String username;

    @Before
    public void iniciaNavegador(Scenario cenario) {
        new Driver(Browser.CHROME);
        Driver.setNomeCenario(cenario.getName());
        Driver.criaDiretorio();
    }

    @After
    public void fechaNavegador(Scenario cenario) throws IOException {
        if (cenario.isFailed()) {
            Driver.printScreen("erro no cenario");
        }
        Driver.getDriver().quit();

    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
        loginPage.visibilityOfBtnFechar();
        loginPage.aguardaLoader();
    }

    @Quando("for realizado um clique no icone de fechar da modal")
    public void forRealizadoUmCliqueNoIconeDeFecharDaModal() throws IOException {
        loginPage.clickBtnFechar();
        Driver.printScreen("clique fechar modal");
    }

    @Entao("a janela da modal deve ser fechada")
    public void aJanelaDaModalDeveSerFechada() throws Exception {
        try {
            loginPage.invisibilityOfBtnFechar();
        } catch (Exception e) {
            throw new Exception("A janela modal não foi fechada");
        }
        Driver.printScreen("modal fechada");
    }


    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() throws IOException {
        loginPage.clickDivFecharModal();
        Driver.printScreen("clique fora modal");
    }

    @Entao("a janela de modal deve ser fechada")
    public void aJanelaDeModalDeveSerFechada() throws IOException {
        loginPage.clickBtnFechar();
        Driver.printScreen("modal fechada");
    }

    @Quando("for realizado um clique no link do Create new Account")
    public void forRealizadoUmCliqueNoLinkDoCreateNewAccount() throws IOException {
        loginPage.clickLinkCreateAccount();
        Driver.printScreen("clique link create account");
    }

    @Entao("a pagina do create new account deve ser exibida")
    public void aPaginaDoCreateNewAccountDeveSerExibida() throws IOException {
        NewAccountPage newAccountPage = new NewAccountPage();
        Assert.assertEquals("CREATE ACCOUNT", newAccountPage.getTextNewAccount());
        loginPage.aguardaLoader();
        Driver.printScreen("tela create account");
    }


    @Quando("clicar no botao sign in")
    public void clicarNoBotaoSignIn() {
        loginPage.clickBtnSignIn();
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() throws IOException {
        Assert.assertEquals(username, loginPage.getUsuarioLogado());
        Driver.printScreen("logado no sistema");
    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String, String> map) throws IOException {

        username = map.get("username");
        String password = map.get("password");
        boolean remember = Boolean.parseBoolean(map.get("remember"));

        loginPage.setInpUserName(username);
        loginPage.setInpPassword(password);
        if (remember) loginPage.clickInpRemember();

        Driver.printScreen("preenchimento dos campos de login");
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickBtnSignIn();

    }

    @Entao("o sistema deve exibir uma mensagem de erro")
    public void oSistemaDeveExibirUmaMensagemDeErro() throws IOException {
        Assert.assertEquals("Incorrect user name or password.", loginPage.getErroLogin());
        Driver.printScreen("login invalido");
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() throws IOException {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
        Driver.printScreen("sign desabilitado");
    }

    @Dado("que esteja logado no sistema com")
    public void queEstejaLogadoNoSistemaCom(Map<String,String>map) throws IOException {
        queAModalEstejaSendoExibida();
        osCamposDeLoginSejamPreenchidosDaSeguinteForma(map);
        forRealizadoOCliqueNoBotaoSignIn();
        deveSerPossivelLogarNoSistema();
    }


}
