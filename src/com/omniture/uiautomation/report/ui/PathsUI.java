package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class PathsUI extends ReportUI {
	
	public static By NEXT_PAGE_FLOW_REPORT = By.xpath("//ul//a[.='Next Page Flow']");
	public static By NEXT_PAGE_REPORT = By.xpath("//ul//a[.='Next Page']");
	public static By PREVIOUS_PAGE_FLOW_REPORT = By.xpath("//ul//a[.='Previous Page Flow']");
	public static By PREVIOUS_PAGE_REPORT = By.xpath("//ul//a[.='Previous Page']");
	public static By FALLOUT_REPORT = By.xpath("//ul//a[.='Fallout']");
	public static By FULL_PATHS_REPORT = By.xpath("//ul//a[.='Full Paths']");
	public static By PATHFINDER_REPORT = By.xpath("//ul//a[.='PathFinder']");
	public static By PATH_LENGTH_REPORT = By.xpath("//ul//a[.='Path Length']");
	public static By PAGE_ANALYSIS_FOLDER = By.xpath("//ul//a[.='Page Analysis']");
	public static By PAGE_SUMMARY_REPORT = By.xpath("//ul//ul//a[.='Page Summary']");
	public static By RELOADS_REPORT = By.xpath("//ul//ul//a[.='Reloads']");
	public static By TIME_SPENT_ON_PAGE_REPORT = By.xpath("//ul//ul//a[.='Time Spent on Page']");
	public static By CLICKS_TO_PAGE_REPORT = By.xpath("//ul//ul//a[.='Clicks to Page']");
	public static By ENTRIES_EXITS_FOLDER = By.xpath("//ul//a[.='Entries & Exits']");
	public static By ENTRY_PAGES_REPORT = By.xpath("//ul//ul/li/a[.='Entry Pages']");
	public static By ORIGINAL_ENTRY_PAGES_REPORT = By.xpath("//ul//ul//a[.='Original Entry Pages']");
	public static By SINGLE_PAGE_VISITS_REPORT = By.xpath("//ul//ul//a[.='Single Page Visits']");
	public static By EXIT_PAGES_REPORT = By.xpath("//ul//ul//a[.='Exit Pages']");
	
}
