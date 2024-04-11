#Escenario 1 Api
Feature: Como usuario deseo poder consumir los diferentes servicios de restful-booker
  @EscenarioApi
  Scenario: Agregar, consultar, actualizar y eliminar libros por medio de los diferentes servicios
    Given El usuario genera el token de acceso ingresando "Url" y "Request"
    When Consume el servicio CreateBooking y agrega dos libros ingresando "Url" y "Request"
    And Consume el servicio GetBooking para consultar los libros creados ingresando "Url"
    And Consume el servicio DeleteBooking y elemina los libros creados ingresando "Url" y "Request"
    Then Validar que los libro hayan sido eliminados correctamente