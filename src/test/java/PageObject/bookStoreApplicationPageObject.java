package PageObject;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import Actions.basePage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl ("https://demoqa.com/login")

public class bookStoreApplicationPageObject extends basePage{

	//CREACION ELEMENTOS

	static By userNameLocator = generalElements.userName.getValor_campo();
	static By passwordLocator = generalElements.password.getValor_campo();
	static By loginLocator = generalElements.login.getValor_campo();
	static By bookStoreAplicationLocator = generalElements.bookStoreAplication.getValor_campo();
	static By bookStoreLocator = generalElements.bookStore.getValor_campo();
	static By bookLocator = generalElements.book.getValor_campo();


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	public void login(String userName, String password) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,300)");
			input(userName, userNameLocator);
			input(password, passwordLocator);
			click(loginLocator);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}
	public void enterBookStore() {

		try {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			click(bookStoreAplicationLocator);
			click(bookStoreLocator);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void selectBook() {

		try {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,700)");
			click(bookLocator);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void addBook() {
			/**
			 * No se puede continuar con el flujo debido a que la siguinte page no carga, validar
			 * en las evidencias del reporte de serenity
			 */
	}
}
