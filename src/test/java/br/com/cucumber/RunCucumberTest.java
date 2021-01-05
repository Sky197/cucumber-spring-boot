package br.com.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/**
 * @author Fernando
 * @since 04-01-2021
 * @Info  Classe de configuração para o cucumber executar as fetures da pasta resource
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources")
public class RunCucumberTest {

}
