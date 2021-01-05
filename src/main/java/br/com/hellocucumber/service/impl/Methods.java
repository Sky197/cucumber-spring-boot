package br.com.hellocucumber.service.impl;

import org.springframework.http.ResponseEntity;

import java.util.List;
/**
 * @author Fernando
 * @since 04-01-2021
 */
public interface Methods {
    ResponseEntity<String> status();

    ResponseEntity<List<String>> listByParameter(String parameters);
}
