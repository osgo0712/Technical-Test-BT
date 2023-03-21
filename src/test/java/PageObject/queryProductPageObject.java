package PageObject;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.WaitingRefreshHandler;

import Actions.basePage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl ("https://automationexercise.com/")

public class queryProductPageObject extends basePage{

	//VARIABLES GLOBALES
	String user, pass;

	//CREACION ELEMENTOS
	static By opcProducty = generalElements.opcProducty.getValor_campo();
	static By textProduct = generalElements.textProduct.getValor_campo();
	static By btnSearch = generalElements.btnSearch.getValor_campo();
	static By confiSearch = generalElements.confiSearch.getValor_campo();
	static By closeModal = generalElements.closeModal.getValor_campo();


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	public void ingresaModuloProducto() {

		try {
			waitImplicit(opcProducty);
			click(opcProducty);
			Thread.sleep(3000);			


		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void ingresaNombreProducto(String nombreProducto) {

		try {
			if(isElementVisible(closeModal)){
				click(closeModal);
				waitImplicit(textProduct);
				input(nombreProducto, textProduct);
				Thread.sleep(1000);
			}else {
				waitImplicit(textProduct);
				input(nombreProducto, textProduct);
				Thread.sleep(1000);
			}

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void consultarProducto() {

		try {
			waitImplicit(btnSearch);
			click(btnSearch);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void confirmarConsulta() {

		try {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,300)");
			waitImplicit(confiSearch);
			Thread.sleep(5000);
			System.out.println("***************************************************************************************");
			System.out.println("[AutomationExercise.com] - CASO DE PRUEBA EXITOSO");
			System.out.println("***************************************************************************************");

			getDriver().quit();

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}
}
