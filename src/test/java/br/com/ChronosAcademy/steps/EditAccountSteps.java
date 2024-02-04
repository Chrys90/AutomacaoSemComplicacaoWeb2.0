package br.com.ChronosAcademy.steps;

import br.com.ChronosAcademy.maps.MyAccountMap;
import br.com.ChronosAcademy.pages.EditAccountPage;
import br.com.ChronosAcademy.pages.MyAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class EditAccountSteps {

    MyAccountPage myAccountPage;
    EditAccountPage editAccountPage;
    Map<String, String> mapDados;

    @Dado("que esteja na pagina de alteracao da conta")
    public void queEstejaNaPaginaDeAlteracaoDaConta() {
        myAccountPage = new MyAccountPage();
        myAccountPage.clickLinkUser();
        myAccountPage.clickLinkMyAccount();
        myAccountPage.clickLinkEdit();

    }
    @Quando("altero os valores do seguintes campos:")
    public void alteroOsValoresDoSeguintesCampos(Map<String, String>map) {
        mapDados = map;
        editAccountPage = new EditAccountPage();
        editAccountPage.setInpFirstName("Chronos");
        editAccountPage.setInpLastName("Teste");
    }
    @Quando("for realizado o clique no botao salvar")
    public void forRealizadoOCliqueNoBotaoSalvar() {
        editAccountPage.clickBtnSave();
    }
    @Entao("a alteracao foi exibida na pagina myAccount")
    public void aAlteracaoFoiExibidaNaPaginaMyAccount() {
        String nome = mapDados.get("firstname") + " "+ mapDados.get("lastname");
        Assert.assertEquals(nome, myAccountPage.getTextUsuario());
    }
}
