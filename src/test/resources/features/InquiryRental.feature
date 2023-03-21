#Escenario 2 
Feature: Como usuario deseo poder realizar consulta de alquiler de auto en la pagina web MilesCarrental
	@Escenario2
	Scenario Outline: Ingresar al home de MilesCarrental y realizar consulta de alquiler de autos con destino y fechas en especifico
    Given El usuario ingresa a la pagina principal de MilesCarrental
    When Ingresa "<localidad>", fechaRecogida y fechaDevolucion
    And Selecciona opc consultar
    Then Selecciona segunda oferta por medio del boton reserva ahora

    Examples:
    | localidad			| 										                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    | florid     		| 
 
    
    	