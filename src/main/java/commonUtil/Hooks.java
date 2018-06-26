package commonUtil;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;

public class Hooks  {

    public static Browser browser;

    public void launchBrowser() throws Exception {
         browser = BrowserFactory.launch(BrowserType.CHROME);
    }



    public void goTo(String url) throws GeneralLeanFtException {
            browser.navigate(url);
            browser.sync();
        }

        public void getCurrentURL() throws Exception {
          browser.getOpenURL();
        }


}
