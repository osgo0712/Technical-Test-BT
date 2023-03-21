package Steps;

import PageObject.queryProductPageObject;
import net.thucydides.core.annotations.Step;

public class queryProductSteps {

	queryProductPageObject queryProductPageObject;
	
	@Step
	public void openApp() {
		queryProductPageObject.open();
	}
	
	public void ingresaModuloProducto() {
		queryProductPageObject.ingresaModuloProducto();
	}
	
	public void ingresaNombreProducto(String nombreProducto) {
		queryProductPageObject.ingresaNombreProducto(nombreProducto);
	}	
	
	public void consultarProducto() {
		queryProductPageObject.consultarProducto();
	}
	
	public void confirmarConsulta() {
		queryProductPageObject.confirmarConsulta();
	}
	
}
