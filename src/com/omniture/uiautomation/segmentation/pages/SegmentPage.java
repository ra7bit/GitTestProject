package com.omniture.uiautomation.segmentation.pages;

import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.SiteCatalystPage;
import com.omniture.uiautomation.segmentation.ui.*;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;

/**
 * @author qyzhu
 */

public class SegmentPage extends SiteCatalystPage {

	public static String SegmentTitle="testSegment";
	public static String NewSegmentTitle="NewTestSegment";
	public static String SegmentPurchasersName="Purchasers";
	public static String segment_ID;
	
	public static String getSegmentTitle() {
		return SegmentTitle;
	}
	
	public static String getSegmentPurchasersName() {
		return SegmentPurchasersName;
	}
	
	public static String getNewSegmentTitle() {
		return NewSegmentTitle;
	}

	public void addSegmentAction() {
		this.sleep(6000);
		this.type(SegmentationUI.SEGMENT_TITLE_INPUT, SegmentTitle);
		this.sleep(1000);
		this.dragAndDrop(SegmentationUI.SEGMENT_CONTAINER_VISITOR, SegmentationUI.SEGMENT_CONTAINER_TARGET);
		this.sleep(2000);
		this.dragAndDrop(SegmentationUI.SEGMENT_EVENTS_FIRST, SegmentationUI.SEGMENT_EVENT_TARGET);
		this.sleep(2000);
		this.click(SegmentationUI.SEGMENT_SAVE_BUTTON);
		this.sleep(1000);
	}
	
	public void navigateToAdminConsole() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
				+ "/p/am/1.3/index.html?a=ReportSuite.Index"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		this.waitUntilPageLoad();
		this.sleep(5000);
	}
	
	public void navigateToSegmentManagerPage() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
				+ "/p/am/1.3/index.html?a=ReportSuite.Manager&feature=SegmentManager&="
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		if(!this.checkLanguage("en_US"))
			this.switchLanguage("en_US");
		this.waitUntilPageLoad();
	}
	
	public void setSegmentID () {
		segment_ID = this.findElement(SegmentationUI.getGlobalSegment(SegmentTitle)).getAttribute("value");
	}
	
	public static String getSegmentID () {
		return segment_ID;
	}
	
	public void navigateToSegmentBuilderEditPage() {
		this.setSegmentID();
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
				+ "/sc15/reports/segment_builder_popup.html?sc=1"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id() + "&segment_id="+SegmentPage.getSegmentID());		
		this.waitUntilPageLoad();
	}
}
