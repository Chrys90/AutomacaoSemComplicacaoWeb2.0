package br.com.ChronosAcademy.steps;

import br.com.ChronosAcademy.core.Driver;
import br.com.ChronosAcademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage;

    @Before
    public void iniciaNavegador(){
        new Driver("chrome");
    }

    @After
    public void fechaNavegador(){
        Driver.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }
    @Quando("for realizado um clique no icone de fechar da modal")
    public void forRealizadoUmCliqueNoIconeDeFecharDaModal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("a janela da modal deve ser fechada")
    public void aJanelaDaModalDeveSerFechada() throws Exception {
        try {
            loginPage.invisibilityOfBtnFechar();
        }catch (Exception e){
            throw new Exception("A janela modal não foi fechada");
        }
    }


    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFecharModal();
    }

    @Entao("a janela de modal deve ser fechada")
    public void aJanelaDeModalDeveSerFechada() {
        loginPage.clickBtnFechar();
    }

    @Quando("for realizado um clique no link do Create new Account")
    public void forRealizadoUmCliqueNoLinkDoCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Entao("a pagina do create new account deve ser exibida")
    public void aPaginaDoCreateNewAccountDeveSerExibida() {
        
    }

    @Quando("informar os campos de login e senha")
    public void informarOsCamposDeLoginESenha() {
        
    }

    @Quando("clicar no botao sign in")
    public void clicarNoBotaoSignIn() {
        
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {
        
    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String, String> map) {
        String login = map.get("login");
        String senha = map.get("senha");
        boolean remember = Boolean.parseBoolean(map.get("remember"));

        loginPage.setInpUserName(login);
        loginPage.setInpPassword("senha");
        if (remember)loginPage.clickInpRemember();
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickBtnSignIn();
    }

    @Entao("o sistema deve exibir uma mensagem de erro")
    public void oSistemaDeveExibirUmaMensagemDeErro() {
        
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);

    }



}
