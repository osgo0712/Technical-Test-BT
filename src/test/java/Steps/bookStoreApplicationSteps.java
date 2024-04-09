package Steps;

import PageObject.bookStoreApplicationPageObject;
import net.thucydides.core.annotations.Step;

public class bookStoreApplicationSteps {
	
	bookStoreApplicationPageObject bookStoreApplicationPageObject;
	
	@Step
	public void openApp() {
		bookStoreApplicationPageObject.open();
	}

	@Step
	public void login(String userName, String password) {
		bookStoreApplicationPageObject.login(userName, password);
	}

	@Step
	public void enterBookStore() {
		bookStoreApplicationPageObject.enterBookStore();
	}

	@Step
	public void selectBook() {
		bookStoreApplicationPageObject.selectBook();
	}

	@Step
	public void addBook() {
		bookStoreApplicationPageObject.addBook();
	}
}
