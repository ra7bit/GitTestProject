/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * UsageAccessUI
 *
 * $Id: UsageAccessUI.java, v 1.0 Aug 28, 2012 9:50:13 AM$
 *
 * Created on Aug 28, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.ui;

import org.openqa.selenium.By;
import com.omniture.uiautomation.ui.OmnitureUI;

public class UsageAccessUI extends OmnitureUI {
    public static By LOGIN_INPUT = By.id("login");
    public static By SEARCH_BUTTON = By.name("usage_search");
    
    public static By EVENTTYPE_SELECTOR = By.name("event_type");
    public static By EVENTDETAIL_INPUT = By.name("event_details");
    
    public static By SORTBYLOGIN_LINK = By.xpath("//table[@class='grid']/thead/tr/th[2]/div/span/input");
    public static By SORTBYEVENTTYPE_LINK = By.xpath("//table[@class='grid']/thead/tr/th[5]/div/span/input");
}

