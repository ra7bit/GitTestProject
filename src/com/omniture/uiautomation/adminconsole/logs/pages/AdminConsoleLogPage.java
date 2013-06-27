/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * AdminConsoleLogPage
 *
 * $Id: AdminConsoleLogPage.java, v 1.0 Aug 24, 2012 4:38:11 PM$
 *
 * Created on Aug 24, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.pages;

import com.omniture.uiautomation.adminconsole.logs.ui.AdminConsoleUI;
import com.omniture.uiautomation.adminconsole.logs.ui.UsageAccessUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

public class AdminConsoleLogPage extends OmniturePage {

    public void navigateToAdminConsoleLogPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Logs.Index"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        }
        this.waitUntilPageLoad();
        this.assertElementExists(AdminConsoleUI.ADMINCONSOLE_TAB);
    }

    public void navigateToUsageAccessLogPage() {
        this.click(AdminConsoleUI.USAGEACCESS_TAB);
        this.assertElementExists(AdminConsoleUI.USAGEACCESS_TAB);
    }

    public void navigateToReportSuiteChangeLogPage() {
        this.click(AdminConsoleUI.REPORTSUITE_TAB);
        this.assertElementExists(AdminConsoleUI.REPORTSUITE_TAB);
    }

    public void navigateToAdminConsoleLogPageByClick() {
        this.click(AdminConsoleUI.ADMINCONSOLE_TAB);
        this.assertElementExists(AdminConsoleUI.ADMINCONSOLE_TAB);
    }

    public void goToPageTwoInAdminConsoleLogPage() {
        if (this.isElementExists(AdminConsoleUI.PAGEFIELD_INPUT)){
            this.clear(AdminConsoleUI.PAGEFIELD_INPUT);
            this.type(AdminConsoleUI.PAGEFIELD_INPUT, "2");
            this.click(AdminConsoleUI.PAGEING_BUTTON);
            this.assertElementExists(AdminConsoleUI.ADMINCONSOLE_TAB);
        }
    }

    public void searchInAdminConsoleLogPage() {
        this.selectByVisibleText(AdminConsoleUI.SEARCH_SELECTOR, "Login");
        this.clear(AdminConsoleUI.SEARCHVALUE_INPUT);
        this.type(AdminConsoleUI.SEARCHVALUE_INPUT, TestEnvironment.current.getUsername());
        this.click(AdminConsoleUI.SEARCH_BUTTON);
        this.assertElementExists(AdminConsoleUI.ADMINCONSOLE_TAB);

        this.click(AdminConsoleUI.ADDSEARCH_BUTTON);
        this.clear(AdminConsoleUI.SEARCHVALUE2_INPUT);
        this.type(AdminConsoleUI.SEARCHVALUE2_INPUT, "test");
        this.click(AdminConsoleUI.SEARCH_BUTTON);
        this.assertElementExists(AdminConsoleUI.ADMINCONSOLE_TAB);
    }

    public void sortByEventType() {
        this.click(UsageAccessUI.SORTBYEVENTTYPE_LINK);
        this.assertElementExists(AdminConsoleUI.ADMINCONSOLE_TAB);
    }

    public void sortByLogin() {
        this.click(UsageAccessUI.SORTBYLOGIN_LINK);
        this.assertElementExists(AdminConsoleUI.ADMINCONSOLE_TAB);
    }
}

