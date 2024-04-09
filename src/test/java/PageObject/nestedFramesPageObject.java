package PageObject;

import Actions.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.fail;

public class nestedFramesPageObject extends basePage {

    //CREACION ELEMENTOS

    static By alertsFrameWindows = generalElements.alertsFrameWindows.getValor_campo();
    static By nestedFrames = generalElements.nestedFrames.getValor_campo();
    static By textiFrame = generalElements.textiFrame.getValor_campo();
    static By forms = generalElements.forms.getValor_campo();
    static By practiceForm = generalElements.practiceForm.getValor_campo();

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
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("window.scrollBy(0,300)");
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

            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("window.scrollBy(0,150)");
            WebElement iframe1 = getDriver().findElement(By.id("frame1"));
            getDriver().switchTo().frame(iframe1);
            String textoIframe1 = getText(textiFrame);
            //VALIDACION TEXTO
            equals(textoIframe1, "Parent frame");
            System.out.println("Texto del primer iframe (Parent frame): " + textoIframe1);

            WebElement iframe2 = getDriver().findElement(By.tagName("iframe"));
            getDriver().switchTo().frame(iframe2);
            String textoIframe2 = getText(textiFrame);
            //VALIDACION TEXTO
            equals(textoIframe2, "Child frame");
            System.out.println("Texto del segundo iframe (Child frame): " + textoIframe2);


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

        }catch(Exception e) {
            System.out.println("***************************************************************************************");
            System.out.println("[AutomationExercise.com] - ERROR: "+e.getMessage());
            System.out.println("***************************************************************************************");

            fail();
        }
    }

}
