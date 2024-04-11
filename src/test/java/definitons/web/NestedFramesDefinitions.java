package definitons.web;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.web.NestedFramesSteps;

public class NestedFramesDefinitions {

    @Steps
    NestedFramesSteps nestedFramesSteps;

    @When("^Ingresar al módulo Alerts, Frame & Windows$")
    public void ingresar_al_módulo_Alerts_Frame_Windows() throws Throwable {
        nestedFramesSteps.selectAlertsFrameWindows();
    }

    @When("^Selecciona la opción Nested Frames$")
    public void selecciona_la_opción_Nested_Frames() throws Throwable {
        nestedFramesSteps.enterNestedFrames();
    }

    @When("^Leer texto Parent frame y Child Iframe$")
    public void leer_texto_Parent_frame_y_Child_Iframe() throws Throwable {
        nestedFramesSteps.validateText();
    }

    @When("^Ingresar Forms y seleccionar la opción Practice Form$")
    public void ingresar_Forms_y_seleccionar_la_opción_Practice_Form() throws Throwable {
        nestedFramesSteps.enterPracticeForm();
    }

    @When("^Diligenciar el formulario con los campos \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" y seleccionar el boton submit$")
    public void diligenciar_el_formulario_con_los_campos_y_seleccionar_el_boton_submit(String firstName, String lastName, String email, String mobile, String dateOfBirth, String subjects, String currentAddress, String state, String city) throws Throwable {
        nestedFramesSteps.informationInput(firstName,  lastName,  email,  mobile, dateOfBirth, subjects, currentAddress, state, city);
    }

    @When("^Cerrrar la ventana modal de confirmacion del registro$")
    public void cerrrar_la_ventana_modal_de_confirmacion_del_registro() throws Throwable {
        nestedFramesSteps.closeModal();
    }
}
