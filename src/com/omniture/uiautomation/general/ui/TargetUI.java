package com.omniture.uiautomation.general.ui;
import org.openqa.selenium.By;

/**
 * @author qyzhu
 *
 */

public class TargetUI {
	
	public static By FAVORITES_LINK = By.xpath("//li[@id='suite_manage_menu']/a");
	public static By TARGETS_LINK = By.xpath("//ul[@id='favorites_menu_header']/li[*]/a[contains(., 'Targets')]");
	public static By MANAGE_TARGETS_LINK = By.xpath("//ul[@id='favorites_menu_header']/li[*]/ul/li[*]/a[contains(., 'Manage Targets')]");
	
	public static By ADD_NEW_TARGET_BUTTON = By.xpath("//div[@id='suite_main_container']/table/tbody/tr[*]/td/input[@value='Add New...']");
	
	public static By TARGET_NAME_INPUT = By.id("target_name");
	public static By APPLYTO_ENTIRE_SITE_CHECKBOX = By.id("apply_to_entire_site");
	public static By PERIOD_FROM_INPUT = By.id("period_from");
	public static By PERIOD_TO_INPUT = By.id("period_to");
	public static By METRICS_SELECT = By.id("metrics");
	public static By TARGET_PERIOD_VALUE_INPUT = By.id("period_counts_0");
	public static By TARGET_ADD_OK_BUTTON = By.xpath("//div[@id='divButtons']/input[@name='submit']");
	public static By TARGET_TITLE_IN_REPORT = By.xpath("//span[@id='report_title']");
	
	

	public static By getTargetByName(String targetName) {
		return By.xpath("//div[@id='targetsforUser']/table/tbody/tr[*]/td[*]/span[contains(., '"+targetName+"')]");
//		return By.xpath("//span[contains(., '"+targetName+"')]");
	}
	
	public static By getTargetSharedCheckboxByName(String targetName) {
//		return By.xpath("//span[contains(., '"+targetName+"')]/../../td[*]/input[@type='checkbox']");
		return By.xpath("//div[@id='targetsforUser']/table/tbody/tr[*]/td[*]/span[contains(., '"+targetName+"')]/../../td[*]/input[@type='checkbox']");
	}
	
	public static By getTargetDeleteButton(String targetName) {
		return By.xpath("//div[@id='targetsforUser']/table/tbody/tr[*]/td[*]/span[contains(., '"+targetName+"')]/../../td[*]/a[@class='manage_delete_icon']/img");
//		return By.xpath("//span[contains(., '"+targetName+"')]/../../td[*]/a[@class='manage_delete_icon']/img");
	}
	
	public static By getTargetModifyButton(String targetName) {
		return By.xpath("//div[@id='targetsforUser']/table/tbody/tr[*]/td[*]/span[contains(., '"+targetName+"')]/../../td[*]/a[@class='manage_edit_icon']/img");
	}
	
	public static By getTargetInSharedList(String targetName) {
		return By.xpath("//div[@id='shared_targets_container']/table/tbody/tr[*]/td[*]/span[contains(., '"+targetName+"')]");
	}
	
	public static By getViewTargetByName(String targetName) {
		return By.xpath("//ul[@id='favorites_menu_header']/li[*]/a[text()='Targets']/../ul/li[*]/a[contains(., '"+targetName+"')]");
	}
	
}






