package Definitons;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.*;

public class bookStoreApplicationDefinitions {
	
	@Steps
	bookStoreApplicationSteps bookStoreApplicationSteps;

	@Given("^El usuario ingresa a la pagina principal de demoqa$")
	public void el_usuario_ingresa_a_la_pagina_principal_de_demoqa() throws Throwable {
		bookStoreApplicationSteps.openApp();
	}

	@When("^Ingresa los campos \"([^\"]*)\" y \"([^\"]*)\" e inicia sesion seleccionando el boton de login$")
	public void ingresa_los_campos_y_e_inicia_sesion_seleccionando_el_boton_de_login(String userName, String password) throws Throwable {
		bookStoreApplicationSteps.login(userName, password);
	}

	@When("^Ingresar al módulo Book Store Application y seleccionar la opción Book Store$")
	public void ingresar_al_módulo_Book_Store_Application_y_seleccionar_la_opción_Book_Store() throws Throwable {
		bookStoreApplicationSteps.enterBookStore();
	}

	@When("^Seleccionar el libro Understanding Programming JavaScript$")
	public void seleccionar_el_libro_Understanding_Programming_JavaScript() throws Throwable {
		bookStoreApplicationSteps.selectBook();
	}

	@When("^Seleccionar la opción Add To Your Collection$")
	public void seleccionar_la_opción_Add_To_Your_Collection() throws Throwable {

	}

	@When("^Seleccionar la opción Aceptar de la alerta$")
	public void seleccionar_la_opción_Aceptar_de_la_alerta() throws Throwable {

	}

	@When("^Seleccionar la opcion profile$")
	public void seleccionar_la_opcion_profile() throws Throwable {

	}

	@When("^Seleccionar la opcion de eliminar cuenta$")
	public void seleccionar_la_opcion_de_eliminar_cuenta() throws Throwable {

	}

	@When("^Seleccionar Aceptar de la alerta$")
	public void seleccionar_Aceptar_de_la_alerta() throws Throwable {

	}

	@Then("^Validar que no le permita ingresar al portal con el usuario que elimino$")
	public void validar_que_no_le_permita_ingresar_al_portal_con_el_usuario_que_elimino() throws Throwable {

	}

}
