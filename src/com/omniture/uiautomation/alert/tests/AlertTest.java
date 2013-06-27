package com.omniture.uiautomation.alert.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.alert.pages.AlertPage;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.tests.OmnitureTest;


/**
 * @author qyzhu
 */


public class AlertTest extends OmnitureTest {

    private AlertPage Alert;
    private OmniturePage omniturePage;
    public AlertTest (String name)
    {
        super(name);
        Alert = new AlertPage();
        omniturePage = new OmniturePage();
        this.Alert.setWebDriver(this.webDriver);
        this.omniturePage.setWebDriver(this.webDriver);
    }

    //@Test //TC_1266448
    public void testviewExistingAlert() {
        Alert.viewExistingAlert();
    }

    
    
    public static Test suite(){
        TestSuite suite = new TestSuite("Alert Test...");
        suite.addTest(new AlertTest("testviewExistingAlert"));
        return suite;
    }
}




//package com.omniture.uiautomation.alert.tests;
//
//import org.junit.Test;
//import com.omniture.uiautomation.alert.Alert;
//import com.omniture.uiautomation.alert.ui.AlertUI;
//
//
///**
// * @author qyzhu
// */
//
//public class AlertTest extends Alert {
//	
//	private static boolean AlertAdded = false;
//	
//	@Test //TC_1266458	
//	public void viewExistingAlertTest() {
//		alertTestPage.navigateToSelectedReportSuite();
//		alertTestPage.navigateToPageViewReport();
//		alertTestPage.expandAlertOnReport();
//		alertTestPage.click(AlertUI.VIEW_EXISTING_ALERTS_LINK);
//		alertTestPage.waitUntilPageLoad();
//		alertTestPage.assertPageIsAlertManager();
//	}
//	
//	
//}