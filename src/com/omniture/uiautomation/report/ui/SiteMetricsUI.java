package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class SiteMetricsUI extends ReportUI {
	
	public static By KEY_METRICS_REPORT = By.xpath("//ul//a[.='Key Metrics']");
	public static By PAGE_VIEWS_REPORT = By.xpath("//ul//a[.='Page Views']"); 
	public static By VISITS_REPORT = By.xpath("//ul//a[.='Visits']"); 
	public static By UNIQUE_VISITOR_FOLDER = By.xpath("//ul//a[.='Visitors']");
	public static By UNIQUE_VISITOR_REPORT = By.xpath("//ul//ul//a[.='Unique Visitors']");
	public static By HOURLY_UNIQUE_VISITOR_REPORT = By.xpath("//ul//ul//a[.='Hourly Unique Visitors']");
	public static By DAILY_UNIQUE_VISITOR_REPORT = By.xpath("//ul//ul//a[.='Daily Unique Visitors']");
	public static By WEEKLY_VISITOR_REPORT = By.xpath("//ul//ul//a[.='Weekly Unique Visitors']");
	public static By MONTHLY_UNIQUE_VISITOR_REPORT = By.xpath("//ul//ul//a[.='Monthly Unique Visitors']");
	public static By QUARTERLY_UNIQUE_VISITOR_REPORT = By.xpath("//ul//ul//a[.='Quarterly Unique Visitors']");
	public static By YEARLY_UNIQUE_VISITOR_REPORT = By.xpath("//ul//ul//a[.='Yearly Unique Visitors']");
	public static By TIME_SPENT_PER_VISIT_REPORT = By.xpath("//ul//a[.='Time Spent per Visit']");
	public static By PURCHASES_FOLDER = By.xpath("//ul//a[.='Purchases']");
	public static By PURCHASES_CONV_FUNNEL_REPORT = By.xpath("//ul//ul//a[.='Purchase Conversion Funnel']");
	public static By REVENUE_REPORT = By.xpath("//ul//ul//a[.='Revenue']");
	public static By ORDER_REPORT = By.xpath("//ul//ul//a[.='Orders']");
	public static By UNITS_REPORT = By.xpath("//ul//ul//a[.='Units']");
	public static By SHOPPING_CART_FOLDER = By.xpath("//ul//a[.='Shopping Cart']");
	public static By CART_CONV_FUNNEL_REPORT = By.xpath("//ul//ul//a[.='Cart Conversion Funnel']");
	public static By CARTS_REPORT = By.xpath("//ul//ul//a[.='Carts']");
	public static By CARTS_VIEWS_REPORT = By.xpath("//ul//ul//a[.='Carts Views']");
	public static By CARTS_ADDITIONS_REPORT = By.xpath("//ul//ul//a[.='Carts Additions']");
	public static By CARTS_REMOVALS_REPORT = By.xpath("//ul//ul//a[.='Carts Removals']");
	public static By CARTS_CHECKOUTS_REPORT = By.xpath("//ul//ul//a[.='Checkouts']");
	public static By BOTS_FOLDER = By.xpath("//ul//a[.='Bots']");
	public static By BOTS_REPORT = By.xpath("//ul//ul//a[.='Bots']");
	public static By BOTS_PAGES_REPORT = By.xpath("//ul//ul//a[.='Bots Pages']");
}
