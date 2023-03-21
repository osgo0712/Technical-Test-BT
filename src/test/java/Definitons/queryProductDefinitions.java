package Definitons;

import Steps.queryProductSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class queryProductDefinitions {

	@Steps
	queryProductSteps queryProductSteps;

	@Given("^El usuario ingresa a la pagina principal de AutomationExercise$")
	public void el_usuario_ingresa_a_la_pagina_principal_de_AutomationExercise() throws Throwable {
		queryProductSteps.openApp();
	}

	@When("^Ingresa al modulo de prodcutos$")
	public void ingresa_al_modulo_de_prodcutos() throws Throwable {
		queryProductSteps.ingresaModuloProducto();
	}

	@When("^Ingresa \"([^\"]*)\" a consultar$")
	public void ingresa_a_consultar(String nombreProducto) throws Throwable {
		queryProductSteps.ingresaNombreProducto(nombreProducto);
	}

	@When("^Selecciona boton consultar$")
	public void selecciona_boton_consultar() throws Throwable {
		queryProductSteps.consultarProducto();
	}

	@Then("^Valida consulta de manera exitosa$")
	public void valida_consulta_de_manera_exitosa() throws Throwable {
		queryProductSteps.confirmarConsulta();
	}





}
