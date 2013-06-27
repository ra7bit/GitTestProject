package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class TrafficSourcesUI extends ReportUI {
	
	public static By SEARCH_KEYWORDS_ALL_REPORT = By.xpath("//ul//a[.='Search Keywords - All']");
	public static By SEARCH_KEYWORDS_PAID_REPORT = By.xpath("//ul//a[.='Search Keywords - Paid']");
	public static By SEARCH_KEYWORDS_NATURAL_REPORT = By.xpath("//ul//a[.='Search Keywords - Natural']");
	public static By SEARCH_ENGINES_ALL_REPORT = By.xpath("//ul//a[.='Search Engines - All']");
	public static By SEARCH_ENGINES_PAID_REPORT = By.xpath("//ul//a[.='Search Engines - Paid']");
	public static By SEARCH_ENGINES_NATURAL_REPORT = By.xpath("//ul//a[.='Search Engines - Natural']");
	public static By ALL_SEARCH_PAGE_RANKING_REPORT = By.xpath("//ul//a[.='All Search Page Ranking']");
	public static By REFERRING_MOMAINS_REPORT = By.xpath("//ul//a[.='Referring Domains']");
	public static By ORIGINAL_REFERRING_MOMAINS_REPORT = By.xpath("//ul//a[.='Original Referring Domains']");
	public static By REFERRERS_REPORT = By.xpath("//ul//a[.='Referrers']");
	public static By REFERRERS_TYPES_REPORT = By.xpath("//ul//a[.='Referrer Types']");
}
