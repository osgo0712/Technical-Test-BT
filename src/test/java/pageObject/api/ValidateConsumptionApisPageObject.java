package pageObject.api;

import base.*;

public class ValidateConsumptionApisPageObject extends BaseValidateConsumptionApis {

    BaseValidateConsumptionApis baseValidateConsumptionApis = new BaseValidateConsumptionApis();
    public void getToken() {
        baseValidateConsumptionApis.getToken();
    }

    public void createBooking() {
        baseValidateConsumptionApis.createBooking();
    }

    public void getBooking() {
        baseValidateConsumptionApis.getBooking();
    }

    public void updateBooking() {
        baseValidateConsumptionApis.updateBooking();
    }

    public void deleteBooking() {
        baseValidateConsumptionApis.deleteBooking();
    }
}
