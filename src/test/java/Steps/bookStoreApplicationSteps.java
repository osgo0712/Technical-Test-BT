package Steps;

import net.thucydides.core.annotations.Step;
import PageObject.inquiryRentalPageObject;

public class inquiryRentalSteps {
	
	inquiryRentalPageObject inquiryRentalPageObject; 
	
	@Step
	public void openApp() {
		inquiryRentalPageObject.open();
	}
	
	public void diligenciarCampos(String localidad) {
		inquiryRentalPageObject.diligenciarCampos(localidad);
	}

	public void confirmarConsulta() {
		inquiryRentalPageObject.confirmarConsulta();
	}
	
	public void validarConsulta() {
		inquiryRentalPageObject.validarConsulta();
	}
}
