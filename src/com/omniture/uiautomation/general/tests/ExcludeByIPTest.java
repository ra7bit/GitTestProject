package com.omniture.uiautomation.general.tests;
import org.junit.Test;

import com.omniture.uiautomation.general.ExcludeByIP;

/**
 * @author qyzhu
 */

public class ExcludeByIPTest extends ExcludeByIP {
	
	//TODO:if failed, affect other cases, add to bvt cases later
//	@Test //TC_1268364 //opt-out third party cookie
//	public void optOutThirdPartyCookieTest_BugONQE() {
//		page.navigateToSelectedReportSuite();
//		page.navigateToExcludeByIPPage();
//		page.toggleOptThirdCookie(ExcludeByIPUI.OPT_OUT_LINK);
//		page.assertPageIsExcludeByIPPage();
//	}
	//TODO:if failed, affect other cases
//	@Test //TC_1268365 //opt-in third party cookie
//	public void optInThirdPartyCookieTest_BugONQE() {
//		page.navigateToSelectedReportSuite();
//		page.navigateToExcludeByIPPage();
//		page.toggleOptThirdCookie(ExcludeByIPUI.OPT_IN_LINK);
//		page.assertPageIsExcludeByIPPage();
//	}

	@Test //TC_1268366 //exclude specific IP
	public void excludeIPTest() {
		page.navigateToExcludeByIPPage();
		page.inputExcludeIPAddress(page.IPAddress);
		page.assertIPAddressExcluded();
	}
	
	@Test //TC_1268367
	public void reactivateIPTest() {
		page.navigateToExcludeByIPPage();
		if(!page.isIPAddressExcluded()) {
			this.excludeIPTest();
		}
		page.reactivateIP();
		assert !(page.isIPAddressExcluded()): "reactivate IP failed!";
	}
	
	@Test //TC_1268368 //exclude invalid specific IP
	public void excludeInvalidIPTest() {
		page.navigateToExcludeByIPPage();
		page.inputExcludeIPAddress(page.InvalidIPAddress);
		page.assertInvalidIPMessage();
	}
}
