package pageObjects;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.WebElementDescription;
import commonUtil.Hooks;

import static commonUtil.Hooks.browser;

public class WebsitePageObjects {

    public WebElement downloadButton() throws Exception {
       return browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .className("")
                .index(0)
                .innerText("Download Now")
                .tagName("SPAN").build());
    }


}
