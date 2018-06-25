package pageObjects;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.stdwin.*;

public class InstallationPageObjects {

    private final static String acceptAndInstallButton = "Accept && Inst&all";
    private final static String iAgreeButton = "I &Agree";
    public final static String nextButton = "Next";
    private final String finishButton = "Finish(5)";

    public InstallationPageObjects() throws GeneralLeanFtException {
    }


    public Button element(String name) throws GeneralLeanFtException {
        return Desktop.describe(Dialog.class, new DialogDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .nativeClass("#32770")
                .text("DriverUpdate Setup").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .nativeClass("Button")
                        .text(name).build());
    }

    public void clickAgreeButton() throws GeneralLeanFtException {
        element(iAgreeButton).click();
    }

    public void clickAcceptInstallButton() throws GeneralLeanFtException {
        element(acceptAndInstallButton).click();
    }

    private Boolean finishButtonWait() throws Exception {
        return element(finishButton).exists(20 * 1000);

    }

    public void clickFinishButton() throws Exception {
        if (finishButtonWait().equals(true)) {
            element(finishButton).click();
        } else {
            System.out.println(finishButtonWait() + "Unable to locate Finish Button");
        }
    }

    public Boolean buttonStatus (String button) throws Exception {
        Boolean bol = element(button).isVisible();
        if (bol.equals(false)) {
            Thread.sleep(20*1000);
            bol = element(button).isVisible();
            System.out.println(bol+ "in false");
            return bol;
        }
        else {
            System.out.println(bol);
            return bol;

        }

    }

}
