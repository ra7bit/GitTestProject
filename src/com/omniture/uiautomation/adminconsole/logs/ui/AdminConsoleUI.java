/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * AdminConsoleUI
 *
 * $Id: AdminConsoleUI.java, v 1.0 Aug 24, 2012 5:34:15 PM$
 *
 * Created on Aug 24, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.ui.OmnitureUI;

public class AdminConsoleUI extends OmnitureUI {
    public static By ADMINCONSOLE_TAB = By.xpath("//div[@id='tab_navigation']/ul/li/a[.='Admin Console Log']");
    public static By USAGEACCESS_TAB = By.xpath("//div[@id='tab_navigation']/ul/li[2]/a[.='Usage & Access Log']");
    public static By REPORTSUITE_TAB = By.xpath("//div[@id='tab_navigation']/ul/li[3]/a[.='Report Suite Change Log']");
    public static By PAGEFIELD_INPUT = By.name("pageField");
    public static By PAGEING_BUTTON = By.name("subPage");
    public static By SEARCH_SELECTOR = By.id("searchField_0");
    public static By SEARCHVALUE_INPUT = By.id("searchString_0");
    public static By SEARCH_BUTTON = By.name("subSearchForm");
    public static By ADDSEARCH_BUTTON = By.xpath("//div[@id='as_objs']/div[2]/table/tbody/tr/td[4]/img");
    public static By SEARCHVALUE2_INPUT = By.id("searchString_1");
    
    public static By SORTBYLOGIN_LINK = By.xpath("//table[@class='grid']/thead/tr/th[3]/div/span/input");
    public static By SORTBYEVENTTYPE_LINK = By.xpath("//table[@class='grid']/thead/tr/th[6]/div/span/input");
    
}