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

    public void saveDownloadFile() throws Exception {
        setExeFileName();
        getSaveFieldValue();
        clickSaveButton();
        //Sleep time to download file
        Thread.sleep(20*1000);
    }
}
