package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class CampaignsUI extends ReportUI {
    public static By CAMPAIGNS_CONVERION_FUNNEL_REPORT = By.xpath("//ul//a[.='Campaign Conversion Funnel']");
    public static By TRACKING_CODE_FOLDER = By.xpath("//ul//a[.='Tracking Code']");
    public static By CREATIVE_ELEMENTS_REPORT = By.xpath("//ul//ul/li/a[.='Creative Elements']");
    public static By CAMPAINGS_REPORT = By.xpath("//ul//ul//a[.='Campaigns']");
    public static By TRACKING_CODE_REPORT = By.xpath("//ul//ul//a[.='Tracking Code']");
}
