package steps;

import com.hp.lft.sdk.Aut;
import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import pageObjects.WebsitePageObjects;

public class Launch {
    private WebsitePageObjects websitePageObjects = new WebsitePageObjects();

    public Launch() throws GeneralLeanFtException {
    }

    public Aut launchApp(String s) throws GeneralLeanFtException {
        Aut app =  Desktop.launchAut(s);
        return app;
    }

    public void clickDownloadButton() throws Exception{
        websitePageObjects.downloadButton().click();
    }

}
