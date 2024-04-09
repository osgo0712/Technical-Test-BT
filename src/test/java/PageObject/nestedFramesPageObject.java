package PageObject;

import Actions.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.fail;

public class practiceFormPageObject extends basePage {

    //CREACION ELEMENTOS

    static By alertsFrameWindows = generalElements.alertsFrameWindows.getValor_campo();
    static By nestedFrames = generalElements.userName.getValor_campo();


    public void enterNestedFrames() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            click(alertsFrameWindows);
            click(nestedFrames);

        }catch(Exception e) {
            System.out.println("***************************************************************************************");
            System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
            System.out.println("***************************************************************************************");

            fail();
        }
    }
}
