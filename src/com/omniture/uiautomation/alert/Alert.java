package com.omniture.uiautomation.alert;

import junit.framework.TestCase;

import com.omniture.uiautomation.alert.pages.*;

/**
 * @author qyzhu
 *
 */

public class Alert extends TestCase {

	protected AlertPage alertPage;

	
	public Alert() {
		this.alertPage = new AlertPage();

	}
}









//package com.omniture.uiautomation.alert;
//
//import com.omniture.uiautomation.tests.OmnitureTest;
//import com.omniture.uiautomation.alert.pages.*;
////import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
//
///**
// * @author qyzhu
// *
// */
//
//public class Alert extends OmnitureTest {
//
//	protected AlertTestPage alertTestPage;
//
//	
//	public Alert() {
//		this.alertTestPage = new AlertTestPage();
//		this.alertTestPage.setWebDriver(this.webDriver);
//	}
//}
