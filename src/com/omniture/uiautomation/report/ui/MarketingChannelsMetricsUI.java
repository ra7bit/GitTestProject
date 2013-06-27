package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author shan
 */

public class MarketingChannelsMetricsUI extends ReportToolbarUI{
	
	//MarketingChannelOverviewReport
	public static By METRIC_NAME = By.xpath("/html/body/div/div[2]/div/div/div[2]/table/tbody/tr[3]/td[2]/div/div[2]");
	
	public static By ADD_METRIC_GROUP = By.id("plus-left-1");
	public static By SAVE_BUTTON = By.xpath("//input[@name='Save']");
	
	public static By EDIT_METRIC_GROUP = By.id("edit-3");
	public static By DELETE_METRIC_SELECTED = By.xpath("/html/body/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div[2]/ul/li/img[@class='selected-metric-delete']");
	public static By METRIC_ITEM1_SELECTED = By.xpath("/html/body/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div[2]/div[2]/div[2]/ul/li[2]/div");
	public static By METRIC_ITEM2_SELECTED = By.xpath("/html/body/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div[2]/div[2]/div[2]/ul/li[4]/div");
	public static By SELECTED_METRIC1 = By.xpath("/html/body/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div[2]/ul/li[2]");
	public static By SELECTED_METRIC2 = By.xpath("/html/body/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div[2]/ul/li[3]");
	
	
	public static By DELETE_METRIC_GROUP = By.id("delete-3");

}
