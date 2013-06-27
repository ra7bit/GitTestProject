/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * UsageAccessLogPage
 *
 * $Id: UsageAccessLogPage.java, v 1.0 Aug 28, 2012 9:44:54 AM$
 *
 * Created on Aug 28, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.pages;

import com.omniture.uiautomation.adminconsole.logs.ui.AdminConsoleUI;
import com.omniture.uiautomation.adminconsole.logs.ui.UsageAccessUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

public class UsageAccessLogPage extends OmniturePage {
    
    public void navigateToUsageAccessLogPage() {

    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Logs.GetUsageLogUI"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        }
        this.waitUntilPageLoad();
        this.assertElementExists(AdminConsoleUI.USAGEACCESS_TAB);
    }
    
    public void searchInUsageAccessLogPage() {
        this.clear(UsageAccessUI.LOGIN_INPUT);
        this.type(UsageAccessUI.LOGIN_INPUT, TestEnvironment.current.getUsername());
        this.click(UsageAccessUI.SEARCH_BUTTON);
        this.assertElementExists(AdminConsoleUI.USAGEACCESS_TAB);
        
        this.selectByIndex(UsageAccessUI.EVENTTYPE_SELECTOR, 1);
        this.clear(UsageAccessUI.EVENTDETAIL_INPUT);
        this.type(UsageAccessUI.EVENTDETAIL_INPUT, "test");
        this.click(UsageAccessUI.SEARCH_BUTTON);
        this.assertElementExists(AdminConsoleUI.USAGEACCESS_TAB);
    }
    
    public void sortByEventType() {
        this.click(UsageAccessUI.SORTBYEVENTTYPE_LINK);
        this.assertElementExists(AdminConsoleUI.USAGEACCESS_TAB);
    }
    
    public void sortByLogin() {
        this.click(UsageAccessUI.SORTBYLOGIN_LINK);
        this.assertElementExists(AdminConsoleUI.USAGEACCESS_TAB);
    }
}

