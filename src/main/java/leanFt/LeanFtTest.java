package leanFt;

import commonUtil.FileReader;
import pageObjects.PageObjects;
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

public class LeanFtTest extends UnitTestClassBase  {

    private Properties prop = new Properties();
    private PageObjects pageObjects = new PageObjects();
    private Launch launch = new Launch();
    private static  FileReader fileReader = new FileReader();

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
    public void test() throws GeneralLeanFtException, IOException, InterruptedException {
        fileReader.readFile("./resources/appPath.properties", prop);

//        Hooks hooks = new Hooks(BrowserType.CHROME);
        Aut app =  launch.launchApp(prop.getProperty("testApp"));
        Thread.sleep(2 * 1000);
        pageObjects.clickAgreeButton();
        Thread.sleep(2 * 1000);
        pageObjects.clickAcceptInstallButton();
        app.close();
    }

}