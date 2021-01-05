package br.com.cucumber.Controller;

import br.com.cucumber.Service.impl.MethodsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @author Fernando
 * @since 04-01-2021
 * @Info  br.com.cucumber.Controller basica para testes
 */
@RestController
@RequestMapping("/request-test")
public class RequestController {

    @Autowired
    MethodsImpl methods;

    @GetMapping
    public ResponseEntity<String> requestStatus() {
        return methods.status();
    }

    @GetMapping
    public ResponseEntity<List<String>> requestWithParam(@RequestParam String param) {
        return methods.listByParameter(param);
    }
}
