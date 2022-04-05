package android.app.business.actions;

import android.app.business.pages.CinkoAddTicketPage;
import android.app.business.pages.CinkoBookingPAGE;
import android.app.business.pages.CinkoLoginPage;
import android.app.utils.core.BaseTest;
import android.app.utils.core.ProperitesFiles;
import android.app.utils.core.WaitUtils;
import android.app.utils.testNG.CustomListeners;
import com.aventstack.extentreports.Status;

import java.io.IOException;

import static io.appium.java_client.touch.offset.PointOption.point;

public class CinkoActions extends BaseTest
{
    public void loginInCinko() throws IOException
    {
        CinkoLoginPage cinkoLoginPage=new CinkoLoginPage();
        cinkoLoginPage.getSkipCinko().click();
        logger.info("Clicked on Skipped button");
        CustomListeners.test.log(Status.PASS,"Clicked on Skipped button");

        cinkoLoginPage.getLoginCinko().click();
        logger.info("Clicked on Login button");
        CustomListeners.test.log(Status.PASS,"Clicked on Login button");

        cinkoLoginPage.getEmailCinko().setValue(ProperitesFiles.getObject("Email"));
        CustomListeners.test.log(Status.PASS,"user name entered");
        logger.info("user name entered");

        cinkoLoginPage.getPasswordCinko().setValue(ProperitesFiles.getObject("Password"));
        CustomListeners.test.log(Status.PASS,"password entered");
        logger.info("password entered");

        cinkoLoginPage.getSignInCinko().click();
        CustomListeners.test.log(Status.PASS,"SignIn button clicked");
        logger.info("SignIn button clicked");

    }

    public void addNewTicket() throws IOException
    {
        CinkoAddTicketPage cinkoAddTicket=new CinkoAddTicketPage();
        cinkoAddTicket.getNaviIcon().click();
        cinkoAddTicket.getMyTicket().click();
        logger.info("Clicked on My Ticket");
        CustomListeners.test.log(Status.PASS,"Clicked on My Ticket");

        cinkoAddTicket.getAddTicket().click();
        logger.info("Clicked on Add new Ticket");
        CustomListeners.test.log(Status.PASS,"Clicked on Add new Ticket");

        cinkoAddTicket.getSelectPriority().click();
        logger.info("Clicked on Priority");
        CustomListeners.test.log(Status.PASS,"Clicked on Priority");

        cinkoAddTicket.getMediumPriority().click();
        logger.info("Priority selected");
        CustomListeners.test.log(Status.PASS,"Priority selected");

        cinkoAddTicket.getSelectCategoryOption().click();
        logger.info("Clicked on Category");
        CustomListeners.test.log(Status.PASS,"Clicked on Category");

        cinkoAddTicket.getNewTicket().click();
        logger.info("Category Selected");
        CustomListeners.test.log(Status.PASS,"Category Selected");

        cinkoAddTicket.getSubject().setValue(ProperitesFiles.getObject("Subject"));
        logger.info("Subject added");
        CustomListeners.test.log(Status.PASS,"Subject added");

        cinkoAddTicket.getDescription().setValue(ProperitesFiles.getObject("Description"));
        logger.info("Description added");
        CustomListeners.test.log(Status.PASS,"Description added");

        cinkoAddTicket.getChooseFileOption().click();
        logger.info("Clicked on Choose File");
        CustomListeners.test.log(Status.PASS,"Clicked on Choose File");

        cinkoAddTicket.getTakePhoto().click();
        logger.info("Camera Selected");
        CustomListeners.test.log(Status.PASS,"Camera Selected");

        cinkoAddTicket.getClickPhoto().click();
        cinkoAddTicket.getDonePhoto().click();
        logger.info("Photo Clicked");
        CustomListeners.test.log(Status.PASS,"Photo Clicked");

        cinkoAddTicket.getFinalSubmit().click();
        logger.info("New Ticket Submitted");
        CustomListeners.test.log(Status.PASS,"New Ticket Submitted");
        refreshPage();

    }
    public void bookingHotel() throws IOException {
         CinkoBookingPAGE bookingPAGE=new CinkoBookingPAGE();
         bookingPAGE.getClickTosearch().click();
         CustomListeners.test.log(Status.PASS,"Clicked on search hotel");
         bookingPAGE.getEnterTosearch().setValue(ProperitesFiles.getObject("SearchHotel"));
         bookingPAGE.getSelectedHotel().click();
         CustomListeners.test.log(Status.PASS,"Hotel Selected for booking");
         bookingPAGE.getSelectMileDistance().click();
         CustomListeners.test.log(Status.PASS,"Mile selected");
         bookingPAGE.getMileSelected().click();
         bookingPAGE.getBookingDone().click();
         CustomListeners.test.log(Status.PASS,"Hotel booked");
         bookingPAGE.getClickYes().click();
         WaitUtils.waitUntilVisibilityOfElement(bookingPAGE.getReturnToHome());
        //WaitUtils.waitUntilElementToBeClickable(bookingPAGE.getReturnToHome());
         bookingPAGE.getReturnToHome().click();
         CustomListeners.test.log(Status.PASS,"Returened to Home page");

         WaitUtils.waitUntilVisibilityOfElement(bookingPAGE.getNaviIcon());
        bookingPAGE.getNaviIcon().click();
        CustomListeners.test.log(Status.PASS,"Navigation button cliked ");
        bookingPAGE.getMyBookings().click();
        CustomListeners.test.log(Status.PASS,"My booking selected");
        refreshPage();

    }
}
