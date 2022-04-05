package com.test.integration.mobile;


import android.app.business.actions.CinkoActions;
import android.app.business.validations.AndroidUIValidations;
import android.app.utils.testNG.CustomListeners;
import android.app.utils.testNG.MobileBaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(CustomListeners.class)
public class LoginLogoutTest extends MobileBaseTest {

    @Test(priority = 1)
    public void cinkoAppLaunch() throws IOException
    {
        CinkoActions cinkoActions=new CinkoActions();
        AndroidUIValidations uiValidations = new AndroidUIValidations();

        cinkoActions.loginInCinko();
        uiValidations.verifyCinkoLogin();
    }

    @Test(priority = 2)
    public void cinkoAppTicket() throws IOException
    {
        CinkoActions cinkoActions=new CinkoActions();
        AndroidUIValidations uiValidations = new AndroidUIValidations();

        cinkoActions.addNewTicket();
        uiValidations.verifyNewTicket();
    }

}
