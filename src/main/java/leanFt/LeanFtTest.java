package leanFt;

import com.hp.lft.sdk.stdwin.Button;
import com.hp.lft.sdk.web.BrowserType;
import commonUtil.FileReader;
import commonUtil.Hooks;
import pageObjects.HomeScreenPageObjects;
import pageObjects.InstallationPageObjects;
import com.hp.lft.sdk.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.SavePageObjects;
import steps.Launch;
import steps.SaveSteps;
import steps.WebSteps;
import unittesting.*;

import java.io.IOException;
import java.util.Properties;

import static com.hp.lft.sdk.WaitUntilTestObjectState.waitUntil;
import static junit.framework.Assert.assertTrue;

public class LeanFtTest extends UnitTestClassBase  {

    private Properties prop = new Properties();
    private WebSteps webSteps = new WebSteps();
    private InstallationPageObjects installationPageObjects = new InstallationPageObjects();
    private HomeScreenPageObjects homeScreenPageObjects = new HomeScreenPageObjects();
    private Launch launch = new Launch();
    private FileReader fileReader = new FileReader();
    private SaveSteps saveSteps = new SaveSteps();

    public LeanFtTest() throws GeneralLeanFtException {
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
    public void test() throws Exception {
        webSteps.launchAndDownload();
        saveSteps.saveDowloadFile();
        webSteps.closeBrowserAfterDownload();

//        Aut cal =  launch.launchApp("C:\\eclipse\\DriverUpdate-setup.exe");
//        installationPageObjects.clickAgreeButton();
//        installationPageObjects.clickAcceptInstallButton();
//        installationPageObjects.clickFinishButton();
//        homeScreenPageObjects.clickHomeButtonWithWait();
//        homeScreenPageObjects.clickStartScanButton();
    }

}