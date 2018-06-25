package pageObjects;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.stdwin.Button;
import com.hp.lft.sdk.stdwin.ButtonDescription;
import com.hp.lft.sdk.stdwin.Dialog;
import com.hp.lft.sdk.stdwin.DialogDescription;


public class HomeScreenPageObjects {

    private InstallationPageObjects installationPageObjects = new InstallationPageObjects();
    private final static String homeButton = "Home";
    private final static String homeWindowName = "DriverUpdate";


    public HomeScreenPageObjects() throws GeneralLeanFtException {
    }

//    public Button homeElement(String name) throws GeneralLeanFtException {
//        return Desktop.describe(Dialog.class, new DialogDescription.Builder()
//                .childWindow(false)
//                .ownedWindow(false)
//                .nativeClass("#32770")
//                .text("DriverUpdate").build())
//                .describe(Button.class, new ButtonDescription.Builder()
//                        .nativeClass("Button")
//                        .text(name).build());
//
//    }


    public Boolean homeButtonWait() throws Exception {
        return installationPageObjects.element(homeWindowName,homeButton).exists(20*1000);
    }

    public void clickHomeButtonWithWait() throws Exception {

        installationPageObjects.clickButtonWithWait(homeButtonWait(), homeWindowName, homeButton);
    }



}
