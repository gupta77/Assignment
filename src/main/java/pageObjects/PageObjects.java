package pageObjects;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.stdwin.Button;
import com.hp.lft.sdk.stdwin.ButtonDescription;
import com.hp.lft.sdk.stdwin.Dialog;
import com.hp.lft.sdk.stdwin.DialogDescription;

public class PageObjects {

    public Button element(String name) throws GeneralLeanFtException {
        Button clickButton =  Desktop.describe(Dialog.class, new DialogDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .nativeClass("#32770")
                .text("DriverUpdate Setup").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .nativeClass("Button")
                        .text(name).build());
        return clickButton;
    }

    public void clickAgreeButton() throws GeneralLeanFtException {
        element("I &Agree").click();
    }

    public void clickAcceptInstallButton() throws GeneralLeanFtException {
        element("Accept && Inst&all").click();
    }
}
