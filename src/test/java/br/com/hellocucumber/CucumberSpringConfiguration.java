package br.com.hellocucumber;

import br.com.hellocucumber.service.impl.Controller;
import br.com.hellocucumber.service.impl.MethodsImpl;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Fernando
 * @since 04-01-2021
 * @implSpec  Setar no ContextConfiguration as classes que vão ser testadas
 */
@CucumberContextConfiguration
@ContextConfiguration(classes = {MethodsImpl.class, Controller.class})
public class CucumberSpringConfiguration {
}
