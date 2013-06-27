package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author shan
 */

public class MarketingChannelsUI extends ReportUI{
	
	public static By CHANNEL_OVERVIEW_REPORT = By.xpath("//ul//a[.='Channel Overview Report']");
	public static By FIRST_TOUCH_CHANNEL = By.xpath("//ul/li[2]/a[.='First Touch Channel']");
	public static By FIRST_TOUCH_CHANNEL_DETAIL = By.xpath("//ul/li[3]/a[.='First Touch Channel Detail']");
	public static By LAST_TOUCH_CHANNEL = By.xpath("//ul/li[4]/a[.='Last Touch Channel']");
	public static By LAST_TOUCH_CHANNEL_DETAIL = By.xpath("//ul/li[5]/a[.='Last Touch Channel Detail']");
	public static By ADD_METRIC_GROUP = By.id("plus-left-1");
	public static By EDIT_METRIC_GROUP = By.id("edit-1");
	public static By DELETE_METRIC_GROUP = By.id("delete-1");

}
