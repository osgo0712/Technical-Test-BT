package Definitons;

import Steps.inquiryRentalSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class inquiryRentalDefinitions {
	
	@Steps
	inquiryRentalSteps inquiryRentalSteps;
	
	@Given("^El usuario ingresa a la pagina principal de MilesCarrental$")
	public void el_usuario_ingresa_a_la_pagina_principal_de_MilesCarrental() throws Throwable {
		inquiryRentalSteps.openApp();
	}

	@When("^Ingresa \"([^\"]*)\", fechaRecogida y fechaDevolucion$")
	public void ingresa_fechaRecogida_y_fechaDevolucion(String localidad) throws Throwable {
	    inquiryRentalSteps.diligenciarCampos(localidad);
	}

	@When("^Selecciona opc consultar$")
	public void selecciona_opc_consultar() throws Throwable {
		inquiryRentalSteps.confirmarConsulta();
	}

	@Then("^Selecciona segunda oferta por medio del boton reserva ahora$")
	public void selecciona_segunda_oferta_por_medio_del_boton_reserva_ahora() throws Throwable {
		inquiryRentalSteps.validarConsulta();
	}
}
