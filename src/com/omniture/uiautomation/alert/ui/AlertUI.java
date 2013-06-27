package com.omniture.uiautomation.alert.ui;

import org.openqa.selenium.By;

/**
 * @author qyzhu
 * 
 */
public class AlertUI {

	public static By SITE_METRICS_FOLDER = By
			.xpath("//ul[@id='sc_left_nav_root']/li[*]/a[.='Site Metrics']");
	public static By PAGE_VIEWS_REPORT = By
			.xpath("//ul/li[*]/a[.='Page Views']");

	public static By MORE_ACTIONS_LINK = By.xpath("//li[@id='more_tool']/a");
	public static By ADD_ALERT_LINK = By.xpath("//li[@id='alert_tool']/a");
	public static By ALERT_RULE_SELECT = By.id("alert_target_type");
	public static By ALERT_RULE_VAULE_INPUT = By.id("alert_target_value");
	public static By ALERT_NAME_INPUT = By.id("alert_name");
	public static By ALERT_MAIL_INPUT = By.id("alert_email");
	public static By ALERT_SAVE_BUTTON = By.id("alert_save");
	public static By ALERT_CANCEL_BUTTON = By.id("alert_cancel");
	public static By ALERT_CHECK_WHEN_SELECT = By.id("alert_check");
	public static By ALERTS_PANEL = By.id("shared_toolbar_panel");
	public static By VIEW_EXISTING_ALERTS_LINK = By
			.xpath("//a[contains(., 'View Existing Alerts')]");

	public static By FAVORITES_LINK = By
			.xpath("//li[@id='suite_manage_menu']/a");
	public static By ALERTS_LINK = By
			.xpath("//ul[@id='favorites_menu_header']/li[*]/a[contains(., 'Alerts')]");

	public static By getSuccessMessage(String successMessage) {
		return By.xpath("//div[@id='message_area']/div[contains(., '"
				+ successMessage + "')]");
	}

	public static By getAlertByAlertName(String alertName) {
		return By
				.xpath("//table[@id='manage_alerts']/tbody/tr[*]/td[contains(., '"
						+ alertName + "')]");
	}

	public static By getDeleteButtonByAlertName(String alertName) {
		return By
				.xpath("//table[@id='manage_alerts']/tbody/tr[*]/td[contains(., '"
						+ alertName
						+ "')]/../td[*]/a[@class='manage_delete_icon']/img");
	}

	public static By getEditButtonByAlertName(String alertName) {
		return By
				.xpath("//table[@id='manage_alerts']/tbody/tr[*]/td[contains(., '"
						+ alertName
						+ "')]/../td[*]/a[@class='manage_edit_icon']/img");
	}

	public static By getEnableButtonByAlertName(String alertName) {
		return By
				.xpath("//table[@id='manage_alerts']/tbody/tr[*]/td[contains(., '"
						+ alertName + "')]/../td[*]/input[@type='checkbox']");
	}

}