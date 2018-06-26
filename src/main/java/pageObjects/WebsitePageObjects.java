package pageObjects;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
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

    public Page registrationPage() throws Exception {
        return browser.describe(Page.class, new PageDescription());

    }

    public WebElement verifyElement1() throws Exception {
        return  browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("DriverUpdate™")
                .tagName("EM").build());
    }

    public WebElement verifyElement() throws Exception {
       return browser.describe(WebElement.class, new WebElementDescription.Builder()
               .innerText("View results below. To continue, please enter your email address.")
               .tagName("P")
               .xpath("//*[@id=\"app\"]/section[1]/div/div[2]/div/p[1]").build());
    }


}
