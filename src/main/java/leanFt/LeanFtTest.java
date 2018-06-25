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

import steps.Launch;
import unittesting.*;

import java.io.IOException;
import java.util.Properties;

import static com.hp.lft.sdk.WaitUntilTestObjectState.waitUntil;
import static junit.framework.Assert.assertTrue;

public class LeanFtTest extends UnitTestClassBase  {

    private Properties prop = new Properties();
    private InstallationPageObjects installationPageObjects = new InstallationPageObjects();
    private HomeScreenPageObjects homeScreenPageObjects = new HomeScreenPageObjects();
    private Launch launch = new Launch();
    private FileReader fileReader = new FileReader();

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
        // FileReader.readFile("./resources/appPath.properties", prop );

//        Hooks hooks = new Hooks(BrowserType.CHROME);
//        hooks.goTo("");
        Aut app =  launch.launchApp("C:\\eclipse\\DriverUpdate-setup.exe");
        Thread.sleep(2 * 1000);
        installationPageObjects.clickAgreeButton();
        Thread.sleep(2 * 1000);
        installationPageObjects.clickAcceptInstallButton();
//        Thread.sleep(2*1000);
//        homeScreenPageObjects.clickHomeButton();
        installationPageObjects.clickFinishButton();
        homeScreenPageObjects.clickHomeButton();
//        installationPageObjects.buttonStatus("Home");
//        WaitUntilTestObjectState.WaitUntilEvaluator<Button> evaluator = new WaitUntilTestObjectState.WaitUntilEvaluator<Button>() {
//            @Override
//            public boolean evaluate(Button element) throws GeneralLeanFtException {
//                return element.isEnabled();
//
//            }
//        };



//        app.close();
    }

}