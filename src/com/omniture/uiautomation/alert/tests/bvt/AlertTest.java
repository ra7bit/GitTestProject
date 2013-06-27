package com.omniture.uiautomation.alert.tests.bvt;

import com.omniture.uiautomation.alert.pages.AlertPage;
import junit.framework.Test;
import junit.framework.TestSuite;

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
	    public void testAddpageViewAlert() {
	        Alert.addPageViewAlert();
	    }

	    //@Test //TC_1266452
	    public void testCancelAddingAlert() {   //Test 2  and Test 3 
	        Alert.cancelAddingAlert();
	    }

	    //@Test //TC_1266453
	    public void testDeleteAlert() {
	        Alert.deleteAlert();
	    }

	    //@Test //TC_1266454
	    public void testDisableAlert() {
	        Alert.disableAlert();
	    }

	    //@Test //TC_1266455	
	    public void testEnableAlert() {
	        Alert.enableAlert();
	    }
	    
	    
	    public static Test suite(){
	        TestSuite suite = new TestSuite("Alert Test...");
	        suite.addTest(new AlertTest("testAddpageViewAlert"));
	        suite.addTest(new AlertTest("testCancelAddingAlert"));
	        suite.addTest(new AlertTest("testDeleteAlert"));
	        suite.addTest(new AlertTest("testDisableAlert"));
	        suite.addTest(new AlertTest("testEnableAlert"));
	        return suite;
	    }
	}





//package com.omniture.uiautomation.alert.tests.bvt;
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
//	@Test //TC_1266448
//	public void testAddPageViewAlertTest() {
//		if(this.AlertAdded == false) {
//			alertTestPage.navigateToSelectedReportSuite();
//			alertTestPage.navigateToPageViewReport();
//			alertTestPage.expandAlertOnReport();
//			alertTestPage.fillInAlerts();
//			alertTestPage.assertAlertAdded();
//		}
//		//else the function has been run somewhere, test case pass directly
//	}
//	
//	@Test //TC_1266452
//	public void testCancelAddingAlertTest() {
//		alertTestPage.navigateToSelectedReportSuite();
//		alertTestPage.navigateToPageViewReport();
//		alertTestPage.expandAlertOnReport();
//		alertTestPage.click(AlertUI.ALERT_CANCEL_BUTTON);
//		alertTestPage.sleep(3000);
//		alertTestPage.assertAlertPanelFolded();
//	}
//
//	@Test //TC_1266453	
//	public void testDeleteAlertTest() {
//		alertTestPage.navigateToAlertManagerPage();
//		if(!alertTestPage.isAlertExists()) {
//			this.AlertAdded = false;
//			this.testAddPageViewAlertTest();
//			this.AlertAdded = true;
//			alertTestPage.navigateToAlertManagerPage();
//		}
//		alertTestPage.deleteAlert();
//		assert (!alertTestPage.isAlertExists()): "The alert deletion failed!";
//	}
//	
//	@Test //TC_1266454
//	public void testDisableAlertTest() {
//		alertTestPage.navigateToAlertManagerPage();
//		if(!alertTestPage.isAlertExists()) {
//			this.AlertAdded = false;
//			this.testAddPageViewAlertTest();
//			this.AlertAdded = true;
//			alertTestPage.navigateToAlertManagerPage();
//		}
//		if(alertTestPage.isAlertEnabled())
//			alertTestPage.toggleAlert();
//		assert (alertTestPage.isAlertEnabled()): "disable alert failed!";
//	}
//	
//	@Test //TC_1266455	
//	public void testEnableAlertTest() {
//		alertTestPage.navigateToAlertManagerPage();
//		if(!alertTestPage.isAlertExists()) {
//			this.AlertAdded = false;
//			this.testAddPageViewAlertTest();
//			this.AlertAdded = true;
//			alertTestPage.navigateToAlertManagerPage();
//		}
//		if(!alertTestPage.isAlertEnabled())
//			alertTestPage.toggleAlert();
//		assert (!alertTestPage.isAlertEnabled()): "Enable alert failed!";
//	}
//	//TODO: edit alert test cases
////	@Test //TC_1266456
////	public void testEditAlertTest() {
////		alertTestPage.navigateToAlertManagerPage();
////		if(!alertTestPage.isAlertExists()) {
////			this.AlertAdded = false;
////			this.testAddPageViewAlertTest();
////			this.AlertAdded = true;
////			alertTestPage.navigateToAlertManagerPage();
////		}
////	}	
//}