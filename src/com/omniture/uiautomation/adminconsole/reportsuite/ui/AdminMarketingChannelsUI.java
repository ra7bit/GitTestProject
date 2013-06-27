package com.omniture.uiautomation.adminconsole.reportsuite.ui;

import org.openqa.selenium.By;

public class AdminMarketingChannelsUI {
	
	public static By AdminConsole = By.xpath("//form[@id='suite_admin_menu']/a[.='Admin']");
	
	public static By EDIT_SETTINGS = By.xpath("//div[@id='edit_settings_txt']");
	public static By MARKETING_CHANNELS = By.xpath("/html/body/div[14]/table/tbody/tr[4]/td");
	public static By MARKETING_CHANNEL_MANAGER = By.xpath("/html/body/div[8]/table/tbody/tr/td");
	public static By MARKETING_CHANNEL_PROCESSING_RULES = By.xpath("/html/body/div[7]/table/tbody/tr[2]/td");
	public static By MARKETING_CHANNEL_COSTS = By.xpath("/html/body/div[7]/table/tbody/tr[3]/td");
	public static By MARKETING_CHANNEL_CLASSIFICATIONS = By.xpath("/html/body/div[7]/table/tbody/tr[4]/td");
	public static By VISITOR_ENGAGEMENT_EXPIRATION = By.xpath("/html/body/div[7]/table/tbody/tr[5]/td");
	
	public static By ADDCHANNEL_LINK = By.xpath("//tr[@id='channel-editor-add-new-link']/td/img");
	public static By CANCLE_BUTTON_1 =By.xpath("//*[@id='ChannelCancel']");
	
	public static By ADDNEWRULE_SET = By.xpath("//select[@id='ChannelRuleSetTemplates']");
	public static By ADDNEWRULE_OPTION = By.xpath("//option[2][@value='-1']");
	public static By RULE_SET_CHANNEL = By.xpath("//*[@id='RuleSetChannel:0:14303908722688363']");
	public static By RULE_SET_OPTION = By.xpath("//option[2][@value='1']");
	public static By SAVE_BUTTON = By.xpath("//*[@id='ChannelSave']");
	public static By RULE_SET_DELETE = By.xpath("//*[@id='RuleSetDelete:388:04706139970625334']']");
	
	public static By ADDITEM_LINK = By.xpath("/html/body/div/div[2]/div/div/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/div/div[2]/div[2]/ul/li/a[2]");
	public static By CANCLE_BUTTON_3 = By.xpath("/html/body/div/div[2]/div/div/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/div/div[2]/form/div[2]/input[3]");
	
	public static By CLASSIFICATION_ACTIONS_TARGET = By.id("img|_0_");
	public static By ADDCLASSIFICATION_LINK = By.xpath("//a[.='Add Classification']");
	public static By CLOSE_SAVE_POPUP = By.id("close_save_popup");
	
	public static By getReportSuite(String reportSuiteID)
	{
		return By.xpath("//table[@id='table_data']/tbody/tr[@id='rs_"+reportSuiteID+"']");
	}

}
