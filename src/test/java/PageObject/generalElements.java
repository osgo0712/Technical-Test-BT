package PageObject;

import org.openqa.selenium.By;

public enum generalElements {

	//FEATURE INICIO DE SESION
	
	
	opcProducty (By.xpath("(//i[@class='material-icons card_travel'])[position()=1]")),
	textProduct (By.xpath("(//input[@class='form-control input-lg'])[position()=1]")),
	btnSearch (By.xpath("(//button[@class='btn btn-default btn-lg'])[position()=1]")),
	confiSearch (By.xpath("(//div[@class='productinfo text-center'])[position()=1]")),
	closeModal (By.xpath("//div[@class='ns-v6zuk-e-14 button-common close-button']")),
	
	dest (By.xpath("(//input[@class='pickupLocation inp-text__input inp-text__input--secondary inp-input-location inp-text__input-- ui-autocomplete-input'])[position()=1]")),
	destList (By.xpath("(//ul[@class='item-autocomplete ui-menu-item-wrapper'])[position()=1]")),
	btnAct (By.xpath("(//input[@class='from-input inp-text__input inp-text__input--secondary inp-text__input--hour inp-input ignore-reset pickers__input'])[position()=1]")),
	dateAct (By.xpath("(//div[@class='day-item is-today'])[position()=1]")),
	btnEnd (By.xpath("(//input[@class='from-input inp-text__input inp-text__input--secondary inp-text__input--hour inp-input ignore-reset pickers__input'])[position()=2]")),
	dateEnd (By.xpath("(//div[@class='day-item'])[position()=6]")),
	btnConfi (By.xpath("(//a[@class='btnQS button button-L button--border form-qs__button__a'])[position()=1]")),
	ValCon (By.xpath("(//img[@class='thumbnail__img | ls-is-cached lazyloaded'])[position()=3]"));
	
	
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
