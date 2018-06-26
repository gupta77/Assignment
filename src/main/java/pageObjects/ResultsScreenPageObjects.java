package pageObjects;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.stdwin.*;
import commonUtil.ElementsUtil;

public class ResultsScreenPageObjects {

    private static final String resultsWindowName = "DriverUpdate";
    private static final String updateDriverButton = "Update Selected Drivers";

    private static ElementsUtil elementsUtil = new ElementsUtil();

    public Button updateSelectedDriversButton() throws Exception {
        elementsUtil.waitForButton(resultsWindowName, updateDriverButton);
        return elementsUtil.element(resultsWindowName, updateDriverButton);
    }
}
