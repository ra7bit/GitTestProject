//package com.omniture.uiautomation.alert.pages;
//
//import com.omniture.uiautomation.alert.ui.AlertUI;
//import com.omniture.uiautomation.framework.TestEnvironment;
//import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
//
///**
// * @author qyzhu
// */
//
//public class AlertTestPage extends AlertPage {
//
//	public void navigateToPageViewReport() {
//		this.sleep(3000);
//		this.click(AlertUI.SITE_METRICS_FOLDER);
//		this.click(AlertUI.PAGE_VIEWS_REPORT);
//		this.waitUntilPageLoad();
//	}
//	
//	public void expandAlertOnReport() {
//		this.sleep(3000);
//		this.click(AlertUI.MORE_ACTIONS_LINK);
//		this.waitUntilElementClickable(AlertUI.ADD_ALERT_LINK);
//		this.click(AlertUI.ADD_ALERT_LINK);
//		this.sleep(3000);
//		this.waitUntilPageLoad();
//	}
//	
//	public void fillInAlerts() {
//		this.clear(AlertUI.ALERT_NAME_INPUT);
//		this.type(AlertUI.ALERT_NAME_INPUT, AlertPage.AlertName);
//		
//		this.selectByVisibleText(AlertUI.ALERT_CHECK_WHEN_SELECT, AlertPage.AlertCheckTime);
//		this.selectByVisibleText(AlertUI.ALERT_RULE_SELECT, AlertPage.AlertRule);
//		this.clear(AlertUI.ALERT_RULE_VAULE_INPUT);
//		this.type(AlertUI.ALERT_RULE_VAULE_INPUT, AlertPage.AlertCriteriaValue);
//		this.clear(AlertUI.ALERT_MAIL_INPUT);
//		this.type(AlertUI.ALERT_MAIL_INPUT, AlertPage.AlertEmail);
//	    this.click(AlertUI.ALERT_SAVE_BUTTON);
////	    this.sleep(10000);
//	    this.waitUntilElement(AlertUI.getSuccessMessage(AlertPage.AlertSuccessMessage));
//	}
//	
//	public void assertAlertAdded() {
//		this.assertElementExists(AlertUI.getSuccessMessage(AlertPage.AlertSuccessMessage));
//	}
//	
//	public void assertAlertPanelFolded() {
//		assert this.findElement(AlertUI.ALERTS_PANEL).getAttribute("style").contains("none"):
//			"alert folder not folded, so the case of cancelling adding alert failed!";
//	}
//
//	public void assertPageIsAlertManager() {
//		String currentURL = this.getDriver().getCurrentUrl();
//		String alertManagerURL = TestEnvironment.current.getBaseUrl() 
//				+ AlertPage.AlertManagerURL
//                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id();
//		assert currentURL==alertManagerURL: "View existing alert failed!";
//	}
//	
//	public void navigateToAlertManagerPage() {
//		this.click(AlertUI.FAVORITES_LINK);
//		this.click(AlertUI.ALERTS_LINK);
//		this.waitUntilPageLoad();
//	}
//	
//	public void deleteAlert() {
//		this.click(AlertUI.getDeleteButtonByAlertName(AlertPage.AlertName));
//		this.getLocator().alert().accept();
////		this.sleep(3000);
//		this.waitUntilPageLoad();
//	}
//	
//	public boolean isAlertExists() {
//		return this.isElementExists(AlertUI.getAlertByAlertName(AlertPage.AlertName));
//	}
//	
//	public void toggleAlert() {
//		this.click(AlertUI.getEnableButtonByAlertName(AlertPage.AlertName));
//		this.waitUntilPageLoad();
//	}
//	
//	public boolean isAlertEnabled() {
//		return Boolean.getBoolean(this.findElement(AlertUI.getEnableButtonByAlertName(AlertPage.AlertName)).getAttribute("checked"));
//	}
//
//}