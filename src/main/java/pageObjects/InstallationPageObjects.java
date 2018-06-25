package pageObjects;

        import com.hp.lft.sdk.Desktop;
        import com.hp.lft.sdk.GeneralLeanFtException;
        import com.hp.lft.sdk.stdwin.*;

public class InstallationPageObjects {

    private final static String acceptAndInstallButton = "Accept && Inst&all";
    private final static String iAgreeButton = "I &Agree";
    public final static String nextButton = "Next";
    private final static String installWindowName = "DriverUpdate Setup";
    private final String finishButton = "Finish(5)";

    public InstallationPageObjects() throws GeneralLeanFtException {
    }


    public Button element(String windowName, String elementName) throws GeneralLeanFtException {
        return Desktop.describe(Dialog.class, new DialogDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .nativeClass("#32770")
                .text(windowName).build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .nativeClass("Button")
                        .text(elementName).build());
    }

    public void clickAgreeButton() throws GeneralLeanFtException {
        element(installWindowName,iAgreeButton).click();
    }

    public void clickAcceptInstallButton() throws GeneralLeanFtException {
        element(installWindowName, acceptAndInstallButton).click();
    }

    private Boolean finishButtonWait() throws Exception {
        return element(installWindowName,finishButton).exists(20 * 1000);

    }

    public void clickButtonWithWait(Boolean buttonStatus, String windowName, String buttonName) throws Exception {
        if (buttonStatus.equals(true)) {
            element(windowName,buttonName).click();
        } else {
            System.out.println(finishButtonWait() + "Unable to locate" + buttonName +"Button");
        }
    }

    public void clickFinishButton() throws Exception{
        clickButtonWithWait(finishButtonWait(),installWindowName, finishButton);;
    }
}
