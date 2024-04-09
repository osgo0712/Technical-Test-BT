package Steps;

import net.thucydides.core.annotations.Step;
import PageObject.*;


public class nestedFramesSteps {

    nestedFramesPageObject nestedFramesPageObject;

    @Step
    public void selectAlertsFrameWindows() {
        nestedFramesPageObject.selectAlertsFrameWindows();
    }

    @Step
    public void enterNestedFrames() {
        nestedFramesPageObject.enterNestedFrames();
    }

    @Step
    public void validateText() {
        nestedFramesPageObject.validateText();
    }

    @Step
    public void enterPracticeForm() {
        nestedFramesPageObject.enterPracticeForm();
    }
}
