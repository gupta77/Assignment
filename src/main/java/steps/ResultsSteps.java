package steps;

import pageObjects.ResultsScreenPageObjects;

public class ResultsSteps {

    private ResultsScreenPageObjects resultsScreenPageObjects = new ResultsScreenPageObjects();

    public String getUpdateDriverButton() throws Exception {
        return resultsScreenPageObjects.updateSelectedDriversButton().getText();
    }
}
