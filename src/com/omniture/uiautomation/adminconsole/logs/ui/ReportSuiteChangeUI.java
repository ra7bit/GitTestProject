/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * ReportSuiteChangeUI
 *
 * $Id: ReportSuiteChangeUI.java, v 1.0 Aug 28, 2012 9:59:08 AM$
 *
 * Created on Aug 28, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.ui.OmnitureUI;

public class ReportSuiteChangeUI extends OmnitureUI {
    public static By COMPANY_INPUT = By.name("company");
    public static By LOGIN_INPUT = By.id("login");
    public static By SEARCH_BUTTON = By.name("change_log_search");
    
    public static By SORTBYLOGIN_LINK = By.xpath("//table[@class='grid']/thead/tr/th[3]/div/span/input");
    public static By SORTBYCOMPANY_LINK = By.xpath("//table[@class='grid']/thead/tr/th[2]/div/span/input");
}

