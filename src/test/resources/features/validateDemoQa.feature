#Escenario 1
Feature: Como usuario deseo poder iniciar sesion en la pagina web demoqa y utilizar los diferentes modulos de esta
  @Escenario1
  Scenario Outline: Realizar inicio de sesion y poder agregar un nuevo libro a la coleccion
    Given El usuario ingresa a la pagina principal de demoqa
    When Ingresa los campos "<UserName>" y "<Password>" e inicia sesion seleccionando el boton de login
    And Ingresar al módulo Book Store Application y seleccionar la opción Book Store
    And Seleccionar el libro Understanding Programming JavaScript
    And Seleccionar la opción Add To Your Collection
    And Seleccionar la opción Aceptar de la alerta
    And Seleccionar la opcion profile
    And Seleccionar la opcion de eliminar cuenta
    And Seleccionar Aceptar de la alerta
    Then Validar que no le permita ingresar al portal con el usuario que elimino

    Examples:
    | UserName     		| | Password     		|
    | test01            | | Test2023*     		|

  @Escenario2
  Scenario Outline: Realizar inicio de sesion y poder agregar un nuevo libro a la coleccion
    Given El usuario ingresa a la pagina principal de demoqa
    When Ingresa los campos "<UserName>" y "<Password>" e inicia sesion seleccionando el boton de login
    And Ingresar al módulo Alerts, Frame & Windows
    And Selecciona la opción Nested Frames
    And Leer texto Parent frame y Child Iframe
    And Ingresar Forms y seleccionar la opción Practice Form
    And Diligenciar el formulario con los campos "<FirstName>", "<LastName>", "<Email>", "<Mobile>", "<Subjects>", "<CurrentAddress>" y seleccionar el boton submit
    And Cerrrar la ventana modal de confirmacion del registro
    And Seleccionar la opcion profile
    And Seleccionar la opcion de eliminar cuenta
    And Seleccionar Aceptar de la alerta
    Then Validar que no le permita ingresar al portal con el usuario que elimino

    Examples:
      | UserName     	  | | Password     	    	|| FirstName     | | LastName  | |     Email           ||  Mobile    || Subjects  ||  CurrentAddress             |
      | test02            | | Test2023*     		|| Prueba01      | | Prueba01  | | prueba@yopmail.com  || 3104985492 || Aspirante || Autopista Norte al oriente  |

    
    	