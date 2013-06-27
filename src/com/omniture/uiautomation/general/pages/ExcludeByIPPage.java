package com.omniture.uiautomation.general.pages;

import com.omniture.uiautomation.pages.SiteCatalystPage;
import com.omniture.uiautomation.segmentation.ui.SegmentationUI;
import com.omniture.uiautomation.general.ui.ExcludeByIPUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
/**
 * @author qyzhu
 */

public class ExcludeByIPPage extends SiteCatalystPage {
	
//	public final static String SelectedRS="asc-test1";
//	public final static String SelectedRSID="auto.zjiang.iqeauto";
	public final String IPAddress="10.10.10.10";
	public final String InvalidIPAddress="aa.aa.aa.aa";
	
	
	
	public void navigateToSelectedReportSuite() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
				+ "/sc15/reports/index.html?a=Overview.Site"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		
		if(!this.checkLanguage("en_US"))
			this.switchLanguage("en_US");
		this.waitUntilPageLoad();

		this.waitUntilElementClickable(SegmentationUI.REPORTSUITE_SELECTION_DROPDOWN_BUTTON);
		this.click(SegmentationUI.REPORTSUITE_SELECTION_DROPDOWN_BUTTON);
		this.waitUntilElementClickable(SegmentationUI.getReportSuiteButton(getDefaultReportSuiteName()));
		this.click(SegmentationUI.getReportSuiteButton(getDefaultReportSuiteName()));
		this.waitUntilPageLoad();	
	}
		
	public void navigateToExcludeByIPPage() {
		this.sleep(5000);
		this.click(ExcludeByIPUI.ADMIN_FOLDER_LINK);
		this.waitUntilElementClickable(ExcludeByIPUI.EXCLUDEBYIP_LINK);
		this.click(ExcludeByIPUI.EXCLUDEBYIP_LINK);
		this.waitUntilPageLoad();
		this.sleep(5000);
	}
	
	
	public void assertPageIsExcludeByIPPage() {
		String URL = TestEnvironment.current.getBaseUrl() 
				+ "/p/suite/1.3/index.html?a=Settings.GetExcludeByIpAddress"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id();
		assert URL==this.getDriver().getCurrentUrl(): "failed to return to ExcludeByIPPage";
	}
	
	public void toggleOptThirdCookie(By by) {
		try {
			this.click(ExcludeByIPUI.THIRD_PARTY_COOKIE_LINK);
			this.sleep(2000);
			this.switchTab();
			this.waitUntilElementClickable(by);
			this.click(by);
			this.waitUntilElementClickable(ExcludeByIPUI.CLOSE_WINDOW_BUTTON);
			this.click(ExcludeByIPUI.CLOSE_WINDOW_BUTTON);
			this.switchTab();
			this.sleep(3000);
		} catch (TimeoutException e) {
			this.closeTab();
			assert false: "toggle third party cookie failed! ";
		}
	}
	
	public void inputExcludeIPAddress(String address) {
		String[] input = address.split("\\.");
		this.type(ExcludeByIPUI.EXCLUDE_INPUT_ZERO, input[0]);
		this.type(ExcludeByIPUI.EXCLUDE_INPUT_ONE, input[1]);
		this.type(ExcludeByIPUI.EXCLUDE_INPUT_TWO, input[2]);
		this.type(ExcludeByIPUI.EXCLUDE_INPUT_THREE, input[3]);
		this.sleep(2000);
		this.click(ExcludeByIPUI.EXCLUDE_BUTTON);
		this.waitUntilPageLoad();
	}
	
	public void assertIPAddressExcluded() {
		this.assertElementExists(ExcludeByIPUI.getAddressListByIP(this.IPAddress));
	}
	
	public boolean isIPAddressExcluded() {
		return this.isElementExists(ExcludeByIPUI.getAddressListByIP(this.IPAddress));
	}
	
	public void reactivateIP() {
		this.click(ExcludeByIPUI.getReactivateButtonByIP(IPAddress));
		this.sleep(2000);
		this.getLocator().alert().accept();
		this.waitUntilPageLoad();	
	}
	
	public void assertInvalidIPMessage() {
		this.assertElementExists(ExcludeByIPUI.ERROR_MESSAGE);
	}

}
