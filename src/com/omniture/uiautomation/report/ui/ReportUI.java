package com.omniture.uiautomation.report.ui;


import org.openqa.selenium.By;
import com.omniture.uiautomation.ui.OmnitureUI;

/*
 * @author yluo
 */

public class ReportUI extends OmnitureUI {
	//Report Title
	public static By REPORT_TITLE = By.xpath("//*[@id='report_title']");
	//Left side navigator folder
	public static By SITE_METRICS_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Site Metrics']");
	public static By SITE_CONTENT_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Site Content']");
	public static By MOBILE_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Mobile']");
	public static By PATHS_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Paths']");
	public static By TRAFFIC_SOURCES_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Traffic Sources']");
	public static By CAMPAIGNS_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Campaigns']");
	public static By PRODUCTS_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Products']");
	public static By VISITOR_RETENTION_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Visitor Retention']");
	public static By VISITOR_PROFILE_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Visitor Profile']");
	public static By MARKETING_CHANNELS_FOLDER = By.xpath("//*[@id='sc_left_nav_root']//a[.='Marketing Channels']");
	public static By DIGITAL_MARKETING_SUITE = By.xpath("//*[@id='suite_products_menu']/a");
	public static By SITECATALYST = By.xpath("//*[@id='prod_sc_link']/a");
	public static By RS_SELECT = By.xpath("//*[@id='rsid_select']");
	public static By RS_ARRAY = By.xpath("//*[@id='rsid_select_menu']/a");
	public static By RS_ASC_TEST1 = By.xpath("//*[@id='rsid_select_list']//a[.='asc-test1']");
	public static By RANKED_REPORT_TOTAL = By.xpath("//*[@id='data_table']/table/tbody///table/tbody//td");
	public static By TRENDED_REPORT_TOTAL = By.xpath("//*[@id='data_table']/table/tbody//tr[@class='data_table_footer_metric']");
}
