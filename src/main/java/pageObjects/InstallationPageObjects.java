package pageObjects;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.stdwin.*;
import commonUtil.ElementsUtil;

public class InstallationPageObjects {

    private final static String acceptAndInstallButton = "Accept && Inst&all";
    private final static String iAgreeButton = "I &Agree";
    private final static String installWindowName = "DriverUpdate Setup";
    private final String finishButton = "Finish(9)";

    private ElementsUtil elementsUtil = new ElementsUtil();

    public InstallationPageObjects() throws GeneralLeanFtException {
    }


    public void clickAgreeButton() throws GeneralLeanFtException {
        elementsUtil.element(installWindowName,iAgreeButton).click();
    }

    public void clickAcceptInstallButton() throws GeneralLeanFtException {
        elementsUtil.element(installWindowName, acceptAndInstallButton).click();
    }

    public void clickFinishButton() throws Exception{
        elementsUtil.clickButtonWithWait(installWindowName, finishButton);
    }
}
