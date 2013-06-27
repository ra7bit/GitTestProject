package com.omniture.uiautomation.general.pages;

import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.SiteCatalystPage;
import com.omniture.uiautomation.segmentation.ui.*;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
/**
 * @author qyzhu
 */

public class TargetPage extends SiteCatalystPage {
	
//	public final static String SelectedRS="asc-test1";
//	public final static String SelectedRSID="auto.zjiang.iqeauto";
	public final static String TargetName = "autoTarget";
	public final static String TargetMetric = "Revenue";
	public final static String TargetPeriodFrom = "07/01/12";
	public final static String TargetPeriodTo = "07/31/12";
	public final static String TargetPeriodValue = "100";
	public final static String NewTargetName = "newTargetName";
	public static boolean TargetSharedStatus;
	
	
	public void navigateToSelectedReportSuite() {
		if(!this.checkLanguage("en_US"))
			this.switchLanguage("en_US");
		this.waitUntilPageLoad();

		this.waitUntilElementClickable(SegmentationUI.REPORTSUITE_SELECTION_DROPDOWN_BUTTON);
		this.click(SegmentationUI.REPORTSUITE_SELECTION_DROPDOWN_BUTTON);
		this.waitUntilElementClickable(SegmentationUI.getReportSuiteButton(this.getDefaultReportSuiteName()));
		this.click(SegmentationUI.getReportSuiteButton(this.getDefaultReportSuiteName()));
		this.waitUntilPageLoad();
	}
	
	
	public void navigateToTargetManagerPage() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
			+ "/p/suite/1.3/index.html?a=Target.Manager"
            + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
	this.waitUntilPageLoad();
	}
	
	

}
