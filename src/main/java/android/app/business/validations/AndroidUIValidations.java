package android.app.business.validations;

import android.app.business.pages.CinkoBookingPAGE;
import android.app.business.pages.CinkoLoginPage;
import android.app.utils.core.WaitUtils;
import android.app.utils.testNG.CustomListeners;
import com.aventstack.extentreports.Status;
import org.testng.Assert;

public class AndroidUIValidations{

    public void verifyCinkoLogin()
    {
        CinkoLoginPage cinkoVerfiylogin=new CinkoLoginPage();
        String expVal="Book";
        String actVal=cinkoVerfiylogin.getBookIn().getText();
        Assert.assertEquals(actVal,expVal,"Login not verified");
        CustomListeners.test.log(Status.PASS,"Login Verified");
    }

    public void verifyNewTicket()
    {
        CinkoLoginPage cinkoVerifyTicket=new CinkoLoginPage();
        String expVal="New Testing By Me";
        String actVal=cinkoVerifyTicket.getAddedSubject().getText();
        Assert.assertEquals(actVal,expVal,"New added ticket Not found");
        CustomListeners.test.log(Status.PASS,"New added ticket Verified");

    }

    public void verifyBookedHotel()
    {
        CinkoBookingPAGE cinkoBookingPAGE=new CinkoBookingPAGE();
        String expval="vina";
        String actval=cinkoBookingPAGE.getBookedHotelName().getText();
        Assert.assertEquals(actval,expval,"Booked hotel not Verified");
        System.out.println("Hotel verified");
        CustomListeners.test.log(Status.PASS,"Hotel verified");
    }
}
