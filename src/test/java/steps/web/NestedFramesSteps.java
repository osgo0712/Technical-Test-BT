package steps.web;

import net.thucydides.core.annotations.Step;
import pageObject.web.NestedFramesPageObject;


public class NestedFramesSteps {

    NestedFramesPageObject nestedFramesPageObject;

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
    @Step
    public void informationInput(String firstName, String lastName, String email, String mobile, String dateOfBirth, String subjects, String currentAddress, String state, String city) {
        nestedFramesPageObject.informationInput(firstName,  lastName,  email,  mobile, dateOfBirth, subjects,  currentAddress, state, city);
    }
    @Step
    public void closeModal() {
        nestedFramesPageObject.closeModal();
    }

}
