/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * ReportSuitesUI
 * 
 * $Id: ReportSuitesUI.java, v 1.0 Aug 10, 2012 10:29:01 AM$
 * 
 * Created on Aug 10, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class ReportSuitesUI extends AdminConsoleUI {
    public static By REPORTSUITE_DROPDOWNLIST = By.name("search_field");
    public static By SEARCH_INPUT = By.name("search_val");
    public static By GO_BUTTON = By.name("search_submitted");

    public static By getReportSuiteByName(String reportSuiteName){
        return By.xpath("//a[.='"+reportSuiteName+"'][last()]");
    }

    public static By DOWNLOADREPORT_LINK = By.xpath("//a[.='Download Report']");
    public static By getSortLinkByType(String type){
        return By.xpath("//a[@contains(text(), 'SCAutoTest')]/../../td/a[contains(text(), 'Delete')]");
        //perm_sort=site_title
    }

    public static By SORTBYNAME_LINK = By.xpath("//table[@class='grid']/thead/tr/th/div/span/a/img");
    public static By SORTBYID_LINK = By.xpath("//table[@class='grid']/thead/tr/th[2]/div/span/a/img");
    public static By SORTBYGROUP_LINK = By.xpath("//table[@class='grid']/thead/tr/th[3]/div/span/a/img");

    public static By AVAILABLEGROUP_DROPDOWNLIST = By.id("avail_groups");
    public static By SELECTEDGROUP_DROPDOWNLIST = By.id("selected_groups");
    public static By ADD_BUTTON = By.xpath("//input[@type='button' and @value='Add >']");
    public static By REMOVE_BUTTON = By.xpath("//input[@type='button' and @value='< Remove']");
    public static By SAVE_BUTTON = By.name("save_changes");

    public static By FIRSTREPORTSUITE = By.xpath("//table[@class='grid']/tbody/tr/td/a");
}

