package com.omniture.uiautomation.adminconsole.reportsuite.ui;

import org.openqa.selenium.By;

/**
 * @author qyzhu
 *
 */

public class BotRulesUI {
	public static By ADMINCONSOLE = By.xpath("//form[@id='suite_admin_menu']/a[.='Admin']");
	
	public static By EDIT_SETTINGS = By.xpath("//div[@id='edit_settings_txt']");
	public static By GENERAL = By.xpath("/html/body/div[15]/table/tbody/tr/td");
	public static By BOTRULES = By.xpath("/html/body/div[6]/table/tbody/tr[8]/td");
	
	public static By BOTRULE_FORM = By.xpath("//form[@id='BotRuleForm']/div/p/input");
	public static By SAVE_BUTTON = By.xpath("//input[@id='BotRuleSave']");
	public static By CANCEL_BUTTON = By.xpath("//input[@id='BotRuleCancel']");
	
	public static By ADD_RULE_LINK = By.xpath("//span[@id='AddRuleLink']");
//	public static By RULE_NAME_INPUT = By.xpath("//[@id='ruleset_undefined']/table/tbody/tr[1]/td[2]/div/span/input");
	public static By RULE_NAME_INPUT = By.xpath("//input[contains(@id, 'RuleSetTitle')]");
	public static By RULE_INPUT = By.xpath("//input[contains(@id, 'UAContains')]");
	public static By RULE_DELETE_BUTTON = By.xpath("//img[contains(@id, 'RuleSetDelete')]");
	
	public static By SUCCESS_MESSAGE = By.xpath("//div[@id='flash_message']/table/tbody/tr/td[2]/p");
	
	public static By getReportSuite(String reportSuiteID)
	{
		return By.xpath("//table[@id='table_data']/tbody/tr[@id='rs_"+reportSuiteID+"']");
	}
	
	
	

}


