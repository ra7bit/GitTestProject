package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class VisitorRetentionUI extends ReportUI{
	
	public static By RETURN_FREQUENCY_REPORT = By.xpath("//ul//a[.='Return Frequency']");
	public static By RETURN_VISITS_REPORT = By.xpath("//ul//a[.='Return Visits']");
	public static By DAILY_RETURN_VISITS_REPORT = By.xpath("//ul//a[.='Daily Return Visits']");
	public static By VISIT_NUMBER_REPORT = By.xpath("//ul//a[.='Visit Number']");
	public static By SALES_CYCLE_FOLDER = By.xpath("//ul//a[.='Sales Cycle']");
	public static By CUSTOMER_LOYALTY_REPORT = By.xpath("//ul//ul//a[.='Customer Loyalty']");
	public static By DAYS_BEFORE_FIRST_PURCHASE_REPORT = By.xpath("//ul//ul//a[.='Days Before First Purchase']");
	public static By DAILY_UNIQUE_CUSTOMERS_REPORT = By.xpath("//ul//ul//a[.='Daily Unique Customers']");
	public static By WEEKLY_UNIQUE_CUSTOMERS_REPORT = By.xpath("//ul//ul//a[.='Weekly Unique Customers']");
	public static By MONTHLY_UNIQUE_CUSTOMERS_REPORT = By.xpath("//ul//ul//a[.='Monthly Unique Customers']");
	public static By QUARTERLY_UNIQUE_CUSTOMERS_REPORT = By.xpath("//ul//ul//a[.='Quarterly Unique Customers']");
	public static By YEARLY_UNIQUE_CUSTOMERS_REPORT = By.xpath("//ul//ul//a[.='Yearly Unique Customers']");
}