package pageObject;

import org.openqa.selenium.By;

public enum GeneralElements {

	userName (By.xpath("(//input[@id='userName'])")),
	password (By.xpath("(//input[@id='password'])")),
	login (By.xpath("(//button[@id='login'])")),
	bookStoreAplication (By.xpath("(//span[@class='group-header'])[position()=6]")),
	bookStore (By.xpath("(//li[@id='item-2'])[position()=5]")),
	book (By.xpath("(//span[@id='see-book-Programming JavaScript Applications'])")),
	alertsFrameWindows (By.xpath("(//span[@class='group-header'])[position()=3]")),
	nestedFrames (By.xpath("(//li[@id='item-3'])[position()=2]")),
	textiFrame (By.tagName("body")),
	forms (By.xpath("(//span[@class='group-header'])[position()=2]")),
	practiceForm (By.xpath("(//li[@id='item-0'])[position()=2]")),
	name (By.xpath("(//input[@id='firstName'])")),
	lastName (By.xpath("(//input[@id='lastName'])")),
	email (By.xpath("(//input[@id='userEmail'])")),
	mobile (By.xpath("(//input[@id='userNumber'])")),
	subjects (By.xpath("(//input[@id='subjectsInput'])")),
	currentAddress (By.xpath("(//textarea[@id='currentAddress'])")),
	gender (By.xpath("(//label[@class='custom-control-label'])[position()=2]")),
	dateOfBirth (By.xpath("(//input[@id='dateOfBirthInput'])")),
	hobbie (By.xpath("(//label[@class='custom-control-label'])[position()=6]")),
	state (By.xpath("(//input[@id='react-select-3-input'])")),
	city (By.xpath("(//input[@id='react-select-4-input'])")),
	submit (By.xpath("(//button[@id='submit'])")),
	close (By.xpath("(//button[@id='closeLargeModal'])"));

	private By valor_campo;

	private GeneralElements(By valor_campo) {
		this.valor_campo = valor_campo;
	}

	public By getValor_campo() {
		return valor_campo;
	}

	public void setValor_campo(By valor_campo) {
		this.valor_campo = valor_campo;
	}
}
