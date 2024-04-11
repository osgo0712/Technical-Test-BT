package pageObject.web;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.*;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import pageObject.GeneralElements;

@DefaultUrl ("https://demoqa.com/login")

public class BookStoreApplicationPageObject extends BasePage {

	//CREACION ELEMENTOS

	static By userNameLocator = GeneralElements.userName.getValor_campo();
	static By passwordLocator = GeneralElements.password.getValor_campo();
	static By loginLocator = GeneralElements.login.getValor_campo();
	static By bookStoreAplicationLocator = GeneralElements.bookStoreAplication.getValor_campo();
	static By bookStoreLocator = GeneralElements.bookStore.getValor_campo();
	static By bookLocator = GeneralElements.book.getValor_campo();


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	public void login(String userName, String password) {

		try {
			scrollDown(userNameLocator);
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
			scrollDown(bookStoreAplicationLocator);
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
			scrollDown(bookLocator);
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
