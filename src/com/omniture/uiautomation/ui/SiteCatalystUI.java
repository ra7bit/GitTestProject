package com.omniture.uiautomation.ui;

import org.openqa.selenium.By;

public class SiteCatalystUI extends OmnitureUI {
    public static By REPORT_TITLE = By.xpath("//*[@id='report_title']");
    public static By RS_SELECT = By.xpath("//*[@id='rsid_select']");
    public static By RS_ARROW = By.xpath("//*[@id='rsid_select_menu']/a");
}
