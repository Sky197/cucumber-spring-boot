package br.com.cucumber.Service.impl;

import br.com.cucumber.Service.Methods;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fernando
 * @implNote Classe de implementação dos metodos de ResponseEntity
 * @since 04-01-2021
 */
@Service
public class MethodsImpl implements Methods {
    @Override
    public ResponseEntity<String> status() {
        return new ResponseEntity<String>("ok", HttpStatus.OK);

    }

    @Override
    public ResponseEntity<List<String>> listByParameter(String parameters) {
        if (parameters.equalsIgnoreCase("FERNANDO")) {
            List<String> list = new ArrayList<>();
            list.add(parameters);
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
