package pageObjects;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.stdwin.Button;
import com.hp.lft.sdk.stdwin.ButtonDescription;
import com.hp.lft.sdk.stdwin.Dialog;
import com.hp.lft.sdk.stdwin.DialogDescription;
import commonUtil.ElementsUtil;


public class HomeScreenPageObjects {

    private InstallationPageObjects installationPageObjects = new InstallationPageObjects();
    private final static String homeButton = "Home";
    private final static String homeWindowName = "DriverUpdate";
    private final static String startScanButton = "Start Scan";

    private ElementsUtil elementsUtil = new ElementsUtil();


    public HomeScreenPageObjects() throws GeneralLeanFtException {
    }



    public void clickHomeButtonWithWait() throws Exception {
        elementsUtil.clickButtonWithWait(homeWindowName, homeButton);
    }

    public void clickStartScanButton() throws Exception {
        elementsUtil.clickButtonWithWait(homeWindowName, startScanButton);
        System.out.println("chirag code working");
    }





}
