package com.omniture.uiautomation.adminconsole.reportsuite.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.ui.OmnitureUI;
/*
 * author: Weizhi Yang (wyang@adobe.com)
 * 
 * */
public class ConversionClassificationsUI extends OmnitureUI {
	public static By SELECT_TYPE = By.id("select_type");
	public static By CAMPAIGN_ROOT_ACTION_TARGET = By.xpath("//img[@id='img|_0_']");
	
	
	public static By getAddClassificationLinkButtonByRel(String rel)
	{
		return By.xpath("//a[@class='add_classification' and @rel='" + rel + "']");
	}
	
	public static By getActionTargetByClassificationName(String classificationName)
	{
		return By.xpath("//td[span='" + classificationName + "']/following-sibling::td/div/div/img");
	}
	
	public static By getNewClassificationTypeSelecter()
	{
		return By.id("type_sel");
	}
	
	public static By getNewClassificationNameInputer()
	{
		return By.xpath("//input[@type='type' and @name='name' and @class='body']");
	}
	
	public static By getNewClassificationDataEnableCheckbox()
	{
		return By.xpath("//input[@type='checkbox' and name='camp_view']");
	}
	
	public static By getNewClassificationSaveButton()
	{
		return By.id("save_classification_button");
	}
}
