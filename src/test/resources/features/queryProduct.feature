#Escenario 1 
Feature: Como usuario deseo poder realizar consulta de prodructo especifico en la pagina web AutomationExercise
	@Escenario1
	Scenario Outline: Ingresar al home de AutomationExercise y realizar consulta de un producto en especifico
    Given El usuario ingresa a la pagina principal de AutomationExercise
    When Ingresa al modulo de prodcutos
    And Ingresa "<nombreProducto>" a consultar
    And Selecciona boton consultar
    Then Valida consulta de manera exitosa

    Examples:
    | nombreProducto	  |  |  											                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    | Polo     					|  | 
    | Men Tshirt     		|  | 
    
 
    
    	