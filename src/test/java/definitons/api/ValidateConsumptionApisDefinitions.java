package definitons.api;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import pageObject.api.ValidateConsumptionApisPageObject;

public class ValidateConsumptionApisDefinitions {

    @Steps
    ValidateConsumptionApisPageObject validateConsumptionApisPageObject;

    @Given("^El usuario genera el token de acceso ingresando \"([^\"]*)\" y \"([^\"]*)\"$")
    public void el_usuario_genera_el_token_de_acceso_ingresando_y(String urlGetToken, String RequestGetToken) throws Throwable {
        validateConsumptionApisPageObject.getToken();
    }

    @When("^Consume el servicio CreateBooking y agrega dos libros ingresando \"([^\"]*)\" y \"([^\"]*)\"$")
    public void consume_el_servicio_CreateBooking_y_agrega_dos_libros_ingresando_y(String urlCreateBooking, String RequestCreateBooking) throws Throwable {
        validateConsumptionApisPageObject.createBooking();
    }

    @When("^Consume el servicio GetBooking para consultar los libros creados ingresando \"([^\"]*)\"$")
    public void consume_el_servicio_GetBooking_para_consultar_los_libros_creados_ingresando(String urlGetBooking) throws Throwable {
        validateConsumptionApisPageObject.getBooking();
    }

    @When("^Consume el servicio DeleteBooking y elemina los libros creados ingresando \"([^\"]*)\" y \"([^\"]*)\"$")
    public void consume_el_servicio_DeleteBooking_y_elemina_los_libros_creados_ingresando_y(String urlUpdateBookig, String requestUpdateBooking) throws Throwable {
        validateConsumptionApisPageObject.updateBooking();
    }

    @Then("^Validar que los libro hayan sido eliminados correctamente$")
    public void validar_que_los_libro_hayan_sido_eliminados_correctamente() throws Throwable {
        validateConsumptionApisPageObject.deleteBooking();
    }

}
