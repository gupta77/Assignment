package steps;

import com.hp.lft.sdk.GeneralLeanFtException;
import commonUtil.Hooks;
import pageObjects.WebsitePageObjects;

public class WebSteps {

    private Hooks hooks = new Hooks();
    private Launch launch = new Launch();
    private WebsitePageObjects websitePageObjects = new WebsitePageObjects();

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

    public Boolean verifyURL() throws Exception {
        String currentURL = hooks.getCurrentURL();
        return currentURL.contains("slimware.com/register/driverupdate");
    }

    public String verifyRegistratioPageOpens() throws Exception {
        return String.valueOf(websitePageObjects.registrationPage().exists(10*1000));

    }
}
