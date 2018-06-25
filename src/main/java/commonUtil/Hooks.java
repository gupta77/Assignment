package commonUtil;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;

public class Hooks  {

    Browser browser;

    public Hooks (BrowserType browserName) throws GeneralLeanFtException {
         browser = BrowserFactory.launch(browserName);
        }

        public void goTo(String url) throws GeneralLeanFtException {
            browser.navigate(url);
        }

        public void getCurrentURL() throws Exception {
          browser.getOpenURL();
        }
}
