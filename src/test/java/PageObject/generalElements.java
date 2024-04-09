package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public enum generalElements {

	userName (By.xpath("(//input[@id='userName'])")),
	password (By.xpath("(//input[@id='password'])")),
	login (By.xpath("(//button[@id='login'])")),
	bookStoreAplication (By.xpath("(//span[@class='group-header'])[position()=6]")),
	bookStore (By.xpath("(//li[@id='item-2'])[position()=5]")),
	book (By.xpath("(//span[@id='see-book-Programming JavaScript Applications'])")),
	alertsFrameWindows (By.xpath("(//span[@class='group-header'])[position()=3]")),
	nestedFrames (By.xpath("(//li[@id='item-3'])[position()=2]")),
	textiFrame (By.tagName("body")),
	forms (By.xpath("(//div[@class='element-group'])[position()=2]")),
	practiceForm (By.xpath("(//li[@id='item-0'])[position()=2]"));


	private By valor_campo;

	private generalElements(By valor_campo) {
		this.valor_campo = valor_campo;
	}

	public By getValor_campo() {
		return valor_campo;
	}

	public void setValor_campo(By valor_campo) {
		this.valor_campo = valor_campo;
	}
}
