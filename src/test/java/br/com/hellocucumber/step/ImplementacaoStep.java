package br.com.hellocucumber.step;

import br.com.hellocucumber.service.impl.Controller;
import br.com.hellocucumber.service.impl.MethodsImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author Fernando
 * @since 04-01-2021
 * @Info  Classe para implementação das features
 */
public class ImplementacaoStep {

    @Autowired
    private MethodsImpl methods;

    @Autowired
    private Controller controller;

    private String param;

    private ResponseEntity<String> response;

    @When("chamar servico de consulta")
    public void chamar_servico_de_consulta() {
        response = methods.status();
    }

    @Then("retornar ResponseEntity<String>")
    public ResponseEntity<String> retornarResponseEntityString() {
        return response;
    }

    @When("chamar servico de get")
    public void chamar_servico_de_get() {
        response = controller.requestStatus();
    }

    @Then("retornar controller ResponseEntity<String>")
    public ResponseEntity<String> retornarResponseEntityControllerString() {
        return response;
    }

    @Given("chamar servico passando {string}")
    public void chamarServicoPassando(String arg0) {
        this.param = arg0;
    }

    @When("chamar servico de get com o parametro {string}")
    public void chamar_servico_de_get_com_o_parametro(String string) {
        Assert.assertNotNull(controller.requestWithParam(string));
    }

    @Then("retornar controller ResponseEntity<List<String>>")
    public ResponseEntity<List<String>> retornar_controller_response_entity_list_string() {
        return controller.requestWithParam(param);
    }

    @Given("passar parametro zoado {string}")
    public void passarParametroZoado(String arg0) {
        this.param = arg0;
    }

    @When("chamar servico para n entrar no if {string}")
    public void chamar_servico_para_n_entrar_no_if(String string) {
        Assert.assertNotNull(controller.requestWithParam(string));
    }

}
