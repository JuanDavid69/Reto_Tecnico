Feature: Carro de Compras

  Scenario: Seleccionar dos productos de la categoría amor para agregarlos al carro de compras
    Given el usuario está en la página de inicio
    When selecciona dos productos de la categoría amor
    Then los productos se agregan al carro de compras

  Scenario: Seleccionar un producto de la categoría cumpleaños, agregarlo y eliminarlo del carro de compras
    Given el usuario está en la página de inicio
    When selecciona un producto de la categoría cumpleaños y lo agrega al carro de compras
    And elimina el producto del carro de compras
    Then el carro de compras está vacío
