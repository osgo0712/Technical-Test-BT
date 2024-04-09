package PageObject;

import static org.junit.Assert.fail;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import Actions.basePage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl ("https://milescarrental.com")

public class inquiryRentalPageObject extends basePage{

	//VARIABLES GLOBALES
	String user, pass;

	//CREACION ELEMENTOS
	static By dest = generalElements.dest.getValor_campo();
	static By btnAct = generalElements.btnAct.getValor_campo();
	static By dateAct = generalElements.dateAct.getValor_campo();
	static By btnEnd = generalElements.btnEnd.getValor_campo();
	static By dateEnd = generalElements.dateEnd.getValor_campo();
	static By btnConfi = generalElements.btnConfi.getValor_campo();
	static By ValCon = generalElements.ValCon.getValor_campo();


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	public void diligenciarCampos(String localidad) {
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
		try {
			Robot robot = new Robot();
			waitImplicit(dest);
			input(localidad, dest);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_A);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);	
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);	
			waitImplicit(btnAct);
			click(btnAct);
			Thread.sleep(2000);	
			waitImplicit(dateAct);
			click(dateAct);
			Thread.sleep(2000);	
			waitImplicit(dateEnd);
			click(dateEnd);
			Thread.sleep(2000);	

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[MilesCarrental.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void confirmarConsulta() {
		
		try {
			waitImplicit(btnConfi);
			click(btnConfi);
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[MilesCarrental.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}
	
	public void validarConsulta() {
		
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,150)");
			Thread.sleep(8000);
			waitImplicit(ValCon);
			click(ValCon);
			Thread.sleep(5000);
			getDriver().quit();
			
		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[MilesCarrental.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}
}
