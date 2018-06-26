package steps;

import com.hp.lft.sdk.GeneralLeanFtException;
import commonUtil.Hooks;

public class WebSteps {

    private Hooks hooks = new Hooks();
    private Launch launch = new Launch();

    public WebSteps() throws GeneralLeanFtException {
    }

    public void launchAndDownload() throws  Exception {
        hooks.launchBrowser();
        hooks.goTo("https://slimware.com/");
        launch.clickDownloadButton();
    }

    public void closeBrowserAfterDownload() throws Exception {
        hooks.closeTab();
    }


}
