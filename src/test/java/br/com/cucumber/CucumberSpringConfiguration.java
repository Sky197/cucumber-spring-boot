package br.com.cucumber;

import br.com.cucumber.Controller.RequestController;
import br.com.cucumber.Service.impl.MethodsImpl;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Fernando
 * @since 04-01-2021
 * @implSpec  Setar no ContextConfiguration as classes que vão ser testadas
 */
@CucumberContextConfiguration
@ContextConfiguration(classes = {MethodsImpl.class, RequestController.class})
public class CucumberSpringConfiguration {
}
