package steps;

import pageObjects.SavePageObjects;

public class SaveSteps {

    private SavePageObjects savePageObjects = new SavePageObjects();
    public static String exeFileName;

    public void getSaveFieldValue() throws Exception {
        exeFileName = savePageObjects.getFileName().getVisibleText();
    }

    public void setExeFileName() throws  Exception{
        savePageObjects.getFileName().setText("DriverUpdate-setup.exe");
    }

    public void clickSaveButton() throws Exception {
        savePageObjects.saveButton().click();
    }
}
