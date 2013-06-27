package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class ReportMetricsUI extends ReportHeaderUI {
	
	public static By NEXT_METRIC_CONTAINER = By.xpath("//*[@id='next_metric_container']");
	public static By SITECATLYST_METRIC0 = By.xpath("//*[@id='sitecatalyst_metric_0']");
	public static By SITECATLYST_METRIC1 = By.xpath("//*[@id='sitecatalyst_metric_1']");
	public static By SITECATLYST_METRIC2 = By.xpath("//*[@id='sitecatalyst_metric_2']");
	public static By SITECATLYST_METRIC3 = By.xpath("//*[@id='sitecatalyst_metric_3']");
	public static By SITECATLYST_METRIC4 = By.xpath("//*[@id='sitecatalyst_metric_4']");
	public static By SITECATLYST_METRIC5 = By.xpath("//*[@id='sitecatalyst_metric_5']");
	public static By SITECATLYST_METRIC6 = By.xpath("//*[@id='sitecatalyst_metric_6']");
	public static By SITECATLYST_METRIC7 = By.xpath("//*[@id='sitecatalyst_metric_7']");
	public static By SITECATLYST_METRIC8 = By.xpath("//*[@id='sitecatalyst_metric_8']");
	public static By SITECATLYST_METRIC9 = By.xpath("//*[@id='sitecatalyst_metric_9']");
	public static By CALCULATED_METRIC0 = By.xpath("//*[@id='calculated_metric_0']");
	public static By CALCULATED_METRIC1 = By.xpath("//*[@id='calculated_metric_1']");
	public static By CALCULATED_METRIC2 = By.xpath("//*[@id='calculated_metric_2']");
	public static By METRICS_OK_BUTTON = By.xpath("//form/div/input[@value='OK']");
	public static By REMOVE_METRICS_ITEM = By.xpath("//*[@id='standard_metrics_list_container']");
	public static String TOP5_SITEMETRICS_REPORT_METRICS = "Page Views, Visits, Unique Visitors, Bounce Rate, Bounces";
	public static String TOP10_PAGES_REPORT_METRICS = "Page Views & Average Page Depth & Average Time Spent on Page & Bounce Rate & Bounces & Cart Additions & Cart Removals & Carts & Cart Views & Checkouts";
	public static String TOP1_PAGES_REPORT_METRICS = "Page Views";
	public static String TOP10_DEVICES_REPORT_METRICS = "Page Views & Bounces & Cart Additions & Cart Removals & Carts & Cart Views & Checkouts & Daily Unique Visitors & Entries & Exits";
	public static String TOP1_DEVICES_REPORT_METRICS = "Page Views";
	public static String THREE_DEVICES_CAL_METRICS = "Page Views & auto01 & auto02 & auto03";
	public static String TOP10_PRODUCTS_REPORT_METRICS = "Page Views, Bounce Rate, Bounces, Cart Additions, Cart Removals, Carts, Cart Views, Checkouts, Daily Unique Visitors, Entries";
	public static String TOP2_PRODUCTS_REPORT_METRICS = "Page Views";
	public static String TOP4_RETURN_FREQUENCY_REPORT_METRICS = "Page Views & Daily Unique Visitors & Unique Visitors & Visits";
	public static String TOP1_RETURN_FREQUENCY_REPORT_METRICS = "Page Views";
	public static By STANDARD_METRICS_CONTAINER = By.xpath("//*[@id='standard_metrics_list_container']/div");
	public static By SELECTED_METRICS_CONTAINER = By.xpath("//*[@id='selected_metrics_container']/ul");
	public static By ADD_CACULATED_METRICS_BUTTON = By.xpath("//*[@id='new_metric_image']/a/img");
	public static By DEFINE_NEW_METRICS_BUTTON = By.xpath("//html/body/div[2]/form/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td/input");
	public static By DEFINE_NEW_METRICS_NAME_TEXTBOX = By.xpath("//input[@name='formula_name']");
	public static By AVAILABLE_STANDARD_METRICS_SELECT = By.xpath("//select[@name='availabel_standard_metrics']");
	public static By ADD_TO_FORMULA_BUTTON = By.xpath("//input[@value='Add to Formula']");
	public static By DIVID_BUTTON = By.xpath("//*[@id='div_button']");
	public static By PLUS_BUTTON = By.xpath("//*[@id='plus_button']");
	public static By MINUS_BUTTON = By.xpath("//*[@id='minus_button']");
	public static By TRASH_CONTAINER = By.xpath("//*[@id='trash_container']");
	public static By DEFINE_NEW_METRICS_SAVE_BUTTON = By.xpath("//input[@name='submit']");
	public static By DEFINE_NEW_METRICS_PERCENT_RAIDO = By.xpath("//input[@value='percent']");
	public static By DEFINE_NEW_METRICS_CURRENCY_RAIDO = By.xpath("//input[@value='currency']");
	public static By CLOSE_AND_REFRESH_LIST_BUTTON = By.xpath("//input[@value='Close and Refresh List']");
	public static By AVAILABLE_CAL_METRICS_SELECT = By.xpath("//select[@name='availabel_metrics']");
	public static By DELETE_CAL_METRICS_BUTTON = By.xpath("//input[@value='Delete Metric']");
	public static By MAKE_GLOBAL_METRICS_BUTTON = By.xpath("//input[@value='Make Global']");
}
