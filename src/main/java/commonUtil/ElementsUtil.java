package commonUtil;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.stdwin.Button;
import com.hp.lft.sdk.stdwin.ButtonDescription;
import com.hp.lft.sdk.stdwin.Dialog;
import com.hp.lft.sdk.stdwin.DialogDescription;

public class ElementsUtil {

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

    public void clickButtonWithWait(String windowName, String buttonName) throws Exception {
        Boolean bol = element(windowName, buttonName).exists(20*1000);
        if (bol.equals(true)) {
            element(windowName,buttonName).click();
        } else {
            System.out.println(bol + "Unable to locate" + buttonName +"Button");
        }
    }


}
