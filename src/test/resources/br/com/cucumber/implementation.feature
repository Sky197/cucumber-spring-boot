Feature: Testando metodos

  Scenario: testar chamadas
    When chamar servico de consulta
    Then retornar ResponseEntity<String>

  Scenario: testar controller
    When chamar servico de get
    Then retornar controller ResponseEntity<String>

  Scenario: testar chamada passando parametro
    Given chamar servico passando "FERNANDO"
    When chamar servico de get com o parametro "FERNANDO"
    Then retornar controller ResponseEntity<List<String>>

  Scenario: testar chamada para passar no if
    Given passar parametro zoado "erro"
    When chamar servico para n entrar no if "erro"

