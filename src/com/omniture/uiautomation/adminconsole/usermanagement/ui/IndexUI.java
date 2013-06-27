/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * IndexUI
 * 
 * $Id: IndexUI.java, v 1.0 Aug 13, 2012 9:43:58 AM$
 * 
 * Created on Aug 13, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.ui;

import org.openqa.selenium.By;

/**
 * @author ligyu
 */

public class IndexUI {

    public static By PageTitle = By.xpath("//div[@id='center_content']/h2");
    public static By HOME_TAB = By.id("tab_navigation_tab0");
    public static By USER_TAB = By.id("tab_navigation_tab1");
    public static By GROUP_TAB = By.id("tab_navigation_tab2");
    public static By REPORTSUITES_TAB = By.id("tab_navigation_tab3");
    public static By PUBLISHINGLIST_TAB = By.id("tab_navigation_tab4");
    public static By EMAIL_TAB = By.id("tab_navigation_tab5");

    public static By DISCOVER_BUTTON = By.xpath("//input[@type='submit' and @value='Manage Discover Users']");
}

