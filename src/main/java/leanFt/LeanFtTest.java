package leanFt;

import com.hp.lft.verifications.Verify;
import commonUtil.FileReader;
import pageObjects.HomeScreenPageObjects;
import pageObjects.InstallationPageObjects;
import com.hp.lft.sdk.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import steps.Launch;
import steps.ResultsSteps;
import steps.SaveSteps;
import steps.WebSteps;
import unittesting.*;

import java.util.Properties;

import static com.hp.lft.sdk.WaitUntilTestObjectState.waitUntil;
import static junit.framework.Assert.assertTrue;

public class LeanFtTest extends UnitTestClassBase  {

    private Properties properties = new Properties();
    private WebSteps webSteps = new WebSteps();
    private InstallationPageObjects installationPageObjects = new InstallationPageObjects();
    private HomeScreenPageObjects homeScreenPageObjects = new HomeScreenPageObjects();
    private Launch launch = new Launch();
    private ResultsSteps resultsSteps = new ResultsSteps();
    private SaveSteps saveSteps = new SaveSteps();

    public LeanFtTest() throws GeneralLeanFtException {
        properties = FileReader.readPropsFromFile("appPath.properties");
    }

    @BeforeClass
    public void beforeClass() throws GeneralLeanFtException {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    @Test
    public void assignment() throws Exception {
//        Web Code Start from here
        webSteps.launchAndDownload();
        saveSteps.saveDownloadFile();
        webSteps.closeBrowserAfterDownload();
//         Web Code ends Here

        // APP code Starts from here
        Aut cal =  launch.launchApp(properties.getProperty("testApp"));
        installationPageObjects.clickAgreeButton();
        installationPageObjects.clickAcceptInstallButton();
        installationPageObjects.clickFinishButton();
        Verify.areEqualIgnoringCase("true", webSteps.verifyRegistratioPageOpens());
        homeScreenPageObjects.clickHomeButtonWithWait();
        homeScreenPageObjects.clickStartScanButton();
        Verify.areEqualIgnoringCase("Update Selected Drivers", resultsSteps.getUpdateDriverButton());
        //App Code ends Here
    }

}