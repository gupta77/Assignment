package leanFt;

import commonUtil.Hooks;
import commonUtil.PageObjects;
import com.hp.lft.sdk.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sun.plugin2.util.BrowserType;
import unittesting.*;

import java.io.IOException;

public class LeanFtTest extends UnitTestClassBase  {

    private PageObjects pageObjects = new PageObjects();

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
//        new ProcessBuilder("C:\\eclipse\\DriverUpdate-setup.exe").start();
//        Thread.sleep(4 * 1000);
//        Hooks hooks = new Hooks(BrowserType.CHROME);
//        hooks.goTo("https://www.google.com/");
        Aut calc = Desktop.launchAut( "C:\\eclipse\\DriverUpdate-setup.exe");
//        Browser browser = BrowserFactory.launch(BrowserType.CHROME);
//        browser.navigate("http://serosoft.atlassian.net/browse/V2D-22221");
//        browser.navigate("http://serosoft.atlassian.net/browse/V2D-22221");

//        Thread.sleep(4 * 1000);

        pageObjects.clickAgreeButton();
        pageObjects.clickAcceptInstallButton();

//        Button iAgreeButton = Desktop.describe(Dialog.class, new DialogDescription.Builder()
//                .childWindow(false)
//                .ownedWindow(false)
//                .nativeClass("#32770")
//                .text("DriverUpdate Setup").build())
//                .describe(Button.class, new ButtonDescription.Builder()
//                        .nativeClass("Button")
//                        .text("I &Agree").build());
//        iAgreeButton.click();
//
//        Button acceptInstallButton = Desktop.describe(Dialog.class, new DialogDescription.Builder()
//                .childWindow(false)
//                .ownedWindow(false)
//                .nativeClass("#32770")
//                .text("DriverUpdate Setup").build())
//                .describe(Button.class, new ButtonDescription.Builder()
//                        .nativeClass("Button")
//                        .text("Accept && Inst&all").build());
//        acceptInstallButton.click();
//
//



    }

}