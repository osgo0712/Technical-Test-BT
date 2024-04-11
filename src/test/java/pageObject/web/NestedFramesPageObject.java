package pageObject.web;

import base.*;
import org.openqa.selenium.By;
import pageObject.GeneralElements;


import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.fail;

public class NestedFramesPageObject extends BasePage {

    //CREACION ELEMENTOS

    static By alertsFrameWindows = GeneralElements.alertsFrameWindows.getValor_campo();
    static By nestedFrames = GeneralElements.nestedFrames.getValor_campo();
    static By textiFrame = GeneralElements.textiFrame.getValor_campo();
    static By forms = GeneralElements.forms.getValor_campo();
    static By practiceForm = GeneralElements.practiceForm.getValor_campo();
    static By nameLocator = GeneralElements.name.getValor_campo();
    static By lastNameLocator = GeneralElements.lastName.getValor_campo();
    static By emailLocator = GeneralElements.email.getValor_campo();
    static By mobileLocator = GeneralElements.mobile.getValor_campo();
    static By subjectsLocator = GeneralElements.subjects.getValor_campo();
    static By dateOfBirthLocator = GeneralElements.dateOfBirth.getValor_campo();
    static By currentAddressLocator = GeneralElements.currentAddress.getValor_campo();
    static By gender = GeneralElements.gender.getValor_campo();
    static By hobbie = GeneralElements.hobbie.getValor_campo();
    static By stateLocator = GeneralElements.state.getValor_campo();
    static By cityLocator = GeneralElements.city.getValor_campo();
    static By submit = GeneralElements.submit.getValor_campo();
    static By close = GeneralElements.close.getValor_campo();


    public void selectAlertsFrameWindows() {
        try {
            click(alertsFrameWindows);

        }catch(Exception e) {
            System.out.println("***************************************************************************************");
            System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
            System.out.println("***************************************************************************************");

            fail();
        }
    }

    public void enterNestedFrames() {
        try {
            scrollDown(nestedFrames);
            click(nestedFrames);

        }catch(Exception e) {
            System.out.println("***************************************************************************************");
            System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
            System.out.println("***************************************************************************************");

            fail();
        }
    }

    public void validateText() {
        try {
            scrollDown(textiFrame);
            validateIframe("id","frame1");
            textEquals("Parent frame", textiFrame);
            validateIframe("tagName","iframe");
            textEquals("Child Iframe", textiFrame);
            getDriver().switchTo().defaultContent();

        }catch(Exception e) {
            System.out.println("***************************************************************************************");
            System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
            System.out.println("***************************************************************************************");

            fail();
        }
    }
    public void enterPracticeForm() {
        try {
            click(forms);
            click(practiceForm);
        }catch(Exception e){
            System.out.println("***************************************************************************************");
            System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
            System.out.println("***************************************************************************************");
            fail();
        }
    }
    public void informationInput(String firstName, String lastName, String email, String mobile, String dateOfBirth, String subjects, String currentAddress, String state, String city) {
        try {
            Robot robot = new Robot();
            scrollDown(nameLocator);
            input(firstName, nameLocator);
            input(lastName, lastNameLocator);
            input(email, emailLocator);
            click(gender);
            input(mobile, mobileLocator);
            click(hobbie);
            delete(dateOfBirthLocator);
            input_Enter(dateOfBirth, dateOfBirthLocator);
            input(subjects, subjectsLocator);
            robot.keyPress(KeyEvent.VK_ENTER);
            input(currentAddress, currentAddressLocator);
            input_Enter(state, stateLocator);
            input_Enter(city, cityLocator);
            scrollDown(submit);
            click(submit);

        } catch (Exception e) {
            System.out.println("***************************************************************************************");
            System.out.println("[AutomationExercise.com] - ERROR: " + e.getMessage());
            System.out.println("***************************************************************************************");
            fail();
        }
    }

    public void closeModal() {
        try {
            click(close);
        } catch (Exception e) {
            System.out.println("***************************************************************************************");
            System.out.println("[AutomationExercise.com] - ERROR: " + e.getMessage());
            System.out.println("***************************************************************************************");
            fail();
        }
    }


}
