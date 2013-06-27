package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class SiteContentUI extends ReportUI{
	
	public static By PAGES_REPORT = By.xpath("//ul//a[.='Pages']");
	public static By SITE_SECTIONS_REPORT = By.xpath("//ul//a[.='Site Sections']");
	public static By SERVERS_REPORT = By.xpath("//ul//a[.='Servers']");
	public static By LINKS_FOLDER = By.xpath("//ul//a[.='Links']");
	public static By EXIT_LINKS_REPORT = By.xpath("//ul//ul//a[.='Exit Links']");
	public static By FILE_DOWNLOADS_REPORT = By.xpath("//ul//ul//a[.='File Downloads']");
	public static By CUSTOM_LINKS_REPORT = By.xpath("//ul//ul//a[.='Custom Links']");
	public static By CLICKMAP_REPORT = By.xpath("//ul//ul//a[.='ClickMap']");
	public static By PAGE_NOT_FOUND_REPORT = By.xpath("//ul//a[.='Pages Not Found']");
	
}
