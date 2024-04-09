package Definitons;

import cucumber.api.java.en.When;
import Steps.*;
import net.thucydides.core.annotations.Steps;

public class nestedFramesDefinitions {

    @Steps
    nestedFramesSteps nestedFramesSteps;

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
        //nestedFramesSteps.enterPracticeForm();
    }

    @When("^Diligenciar el formulario con los campos \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" y seleccionar el boton submit$")
    public void diligenciar_el_formulario_con_los_campos_y_seleccionar_el_boton_submit(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {

    }

    @When("^Cerrrar la ventana modal de confirmacion del registro$")
    public void cerrrar_la_ventana_modal_de_confirmacion_del_registro() throws Throwable {

    }
}
