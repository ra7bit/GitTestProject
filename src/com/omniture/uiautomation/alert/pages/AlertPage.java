package com.omniture.uiautomation.alert.pages;
import com.omniture.uiautomation.alert.ui.AlertUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.SiteCatalystPage;
import com.omniture.uiautomation.segmentation.ui.*;

/**
 * @author weihua
 *  */

public class AlertPage extends SiteCatalystPage {

//	public final static String SelectedRS="asc-test1";
//	public final static String SelectedRSID="auto.zjiang.iqeauto";
	public final static String AlertSuccessMessage="Alert successfully created";
	public final static String AlertEmail="qyzhu@adobe.com";
	public final static String AlertName="autoAlert";
	public final static String AlertCheckTime="Hour";
	public final static String AlertRule="Is Above Or Equals";
	public final static String AlertCriteriaValue="1";
	public final static String AlertManagerURL= "/p/suite/1.3/index.html?a=Alert.Manager";
    
	public void addPageViewAlert() {
		navigateToSelectedReportSuite();
		navigateToPageViewReport();
		expandAlertOnReport();

		this.clear(AlertUI.ALERT_NAME_INPUT);
		this.type(AlertUI.ALERT_NAME_INPUT, AlertPage.AlertName);		
		this.selectByVisibleText(AlertUI.ALERT_CHECK_WHEN_SELECT, AlertPage.AlertCheckTime);
		this.selectByVisibleText(AlertUI.ALERT_RULE_SELECT, AlertPage.AlertRule);
		this.clear(AlertUI.ALERT_RULE_VAULE_INPUT);
		this.type(AlertUI.ALERT_RULE_VAULE_INPUT, AlertPage.AlertCriteriaValue);
		this.clear(AlertUI.ALERT_MAIL_INPUT);
		this.type(AlertUI.ALERT_MAIL_INPUT, AlertPage.AlertEmail);
		this.click(AlertUI.ALERT_SAVE_BUTTON);
//	    this.sleep(10000);
		this.waitUntilElement(AlertUI.getSuccessMessage(AlertPage.AlertSuccessMessage));
        this.assertElementExists(AlertUI.getSuccessMessage(AlertPage.AlertSuccessMessage));

	}

	public void cancelAddingAlert() {
		navigateToSelectedReportSuite();
		navigateToPageViewReport();
		expandAlertOnReport();
		this.click(AlertUI.ALERT_CANCEL_BUTTON);
		this.sleep(3000);
		this.assertAlertPanelFolded();	
	}
	

	public void deleteAlert() {
		navigateToAlertManagerPage();
		this.click(AlertUI.getDeleteButtonByAlertName(AlertPage.AlertName));
		this.getLocator().alert().accept();
//		this.sleep(3000);
		this.waitUntilPageLoad();
		assert (!this.isElementExists(AlertUI.getAlertByAlertName(AlertPage.AlertName))): "The alert deletion failed!";
		addPageViewAlert();
	}
	
    //
    public void disableAlert() {
    	
//    	if(isAlertEnabled())
    		navigateToAlertManagerPage();
			this.click(AlertUI.getEnableButtonByAlertName(AlertPage.AlertName));
			this.waitUntilPageLoad();
		assert (isAlertEnabled()): "disable alert failed!";       	
    }

    public void enableAlert() {

    		navigateToAlertManagerPage();
		if(!isAlertEnabled())
			this.click(AlertUI.getEnableButtonByAlertName(AlertPage.AlertName));
			this.waitUntilPageLoad();
		assert (!isAlertEnabled()): "Enable alert failed!";	
    }
    
    public void viewExistingAlert() {
		navigateToSelectedReportSuite();
		navigateToPageViewReport();
		expandAlertOnReport();
		this.click(AlertUI.VIEW_EXISTING_ALERTS_LINK);
		this.waitUntilPageLoad();
		assertPageIsAlertManager();
    }
 
	public void navigateToSelectedReportSuite() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
				+ "/sc15/reports/index.html?a=Overview.Site"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		
		if(!this.checkLanguage("en_US"))
			this.switchLanguage("en_US");
		this.waitUntilPageLoad();

		this.waitUntilElementClickable(SegmentationUI.REPORTSUITE_SELECTION_DROPDOWN_BUTTON);
		this.click(SegmentationUI.REPORTSUITE_SELECTION_DROPDOWN_BUTTON);
		this.waitUntilElementClickable(SegmentationUI.getReportSuiteButton(this.getDefaultReportSuiteName()));
		this.click(SegmentationUI.getReportSuiteButton(this.getDefaultReportSuiteName()));
		this.waitUntilPageLoad();
	}

	public void navigateToPageViewReport() {
		this.sleep(3000);
		this.click(AlertUI.SITE_METRICS_FOLDER);
		this.click(AlertUI.PAGE_VIEWS_REPORT);
		this.waitUntilPageLoad();
	}

	public void navigateToAlertManagerPage() {
		this.click(AlertUI.FAVORITES_LINK);
		this.click(AlertUI.ALERTS_LINK);
		this.waitUntilPageLoad();
	}

	
	public void expandAlertOnReport() {
	this.sleep(3000);
	this.click(AlertUI.MORE_ACTIONS_LINK);
	this.waitUntilElementClickable(AlertUI.ADD_ALERT_LINK);
	this.click(AlertUI.ADD_ALERT_LINK);
	this.sleep(3000);
	this.waitUntilPageLoad();
}
	

	public void assertAlertPanelFolded() {
		assert this.findElement(AlertUI.ALERTS_PANEL).getAttribute("style").contains("none"):
			"alert folder not folded, so the case of cancelling adding alert failed!";
	}

	public boolean isAlertEnabled() {
		return Boolean.getBoolean(this.findElement(AlertUI.getEnableButtonByAlertName(AlertPage.AlertName)).getAttribute("checked"));
	}
	
	public void assertPageIsAlertManager() {
		String currentURL = this.getDriver().getCurrentUrl();
		String alertManagerURL = TestEnvironment.current.getBaseUrl() 
				+ AlertPage.AlertManagerURL
				+ "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id();
		System.out.print(currentURL);
		System.out.print(alertManagerURL);
	
		assert (currentURL.equals(alertManagerURL)): "View existing alert failed!";
	}
}





//package com.omniture.uiautomation.alert.pages;
//import com.omniture.uiautomation.alert.ui.AlertUI;
//import com.omniture.uiautomation.framework.TestEnvironment;
//import com.omniture.uiautomation.pages.OmniturePage;
//import com.omniture.uiautomation.general.pages.*;
//
//import com.omniture.uiautomation.segmentation.ui.*;
//import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
///**
// * @author qyzhu
// *
// */
//
//public class AlertPage extends OmniturePage {
//	
//	public final static String SelectedRS="asc-test1";
//	public final static String SelectedRSID="auto.zjiang.iqeauto";
//	public final static String AlertSuccessMessage="Alert successfully created";
//	public final static String AlertEmail="qyzhu@adobe.com";
//	public final static String AlertName="autoAlert";
//	public final static String AlertCheckTime="Hour";
//	public final static String AlertRule="Is Above Or Equals";
//	public final static String AlertCriteriaValue="1";
//	public final static String AlertManagerURL= "/p/suite/1.3/index.html?a=Alert.Manager";
//	
//	
//	public void navigateToSelectedReportSuite() {
//		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
//				+ "/sc15/reports/index.html?a=Overview.Site"
//                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
//		
//		if(!this.checkLanguage("en_US"))
//			this.switchLanguage("en_US");
//		this.waitUntilPageLoad();
//
//		this.waitUntilElementClickable(SegmentationUI.REPORTSUITE_SELECTION_DROPDOWN_BUTTON);
//		this.click(SegmentationUI.REPORTSUITE_SELECTION_DROPDOWN_BUTTON);
//		this.waitUntilElementClickable(SegmentationUI.getReportSuiteButton(SelectedRS));
//		this.click(SegmentationUI.getReportSuiteButton(SelectedRS));
//		this.waitUntilPageLoad();
//	}
//	
//	
//	public void navigateToAlertManagerPage() {
//		this.click(AlertUI.FAVORITES_LINK);
////		this.sleep(2000);
//		this.waitUntilElementClickable(AlertUI.ALERTS_LINK);
//		this.click(AlertUI.ALERTS_LINK);
//		this.waitUntilPageLoad();
//	}
//	
//	
//
//}
