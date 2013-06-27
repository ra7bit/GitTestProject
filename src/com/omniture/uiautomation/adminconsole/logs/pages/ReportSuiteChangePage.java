/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * ReportSuiteChangePage
 *
 * $Id: ReportSuiteChangePage.java, v 1.0 Aug 28, 2012 9:59:40 AM$
 *
 * Created on Aug 28, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.pages;

import com.omniture.uiautomation.adminconsole.logs.ui.AdminConsoleUI;
import com.omniture.uiautomation.adminconsole.logs.ui.ReportSuiteChangeUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

public class ReportSuiteChangePage extends OmniturePage {
    public void navigateToReportSuiteChangePage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Logs.GetReportSuiteLog"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        }
        this.waitUntilPageLoad();
        this.assertElementExists(AdminConsoleUI.REPORTSUITE_TAB);
    }
    
    public void searchInReportSuiteChangePage() {
        this.clear(ReportSuiteChangeUI.COMPANY_INPUT);
        this.type(ReportSuiteChangeUI.COMPANY_INPUT, TestEnvironment.current.getCompany());
        this.click(ReportSuiteChangeUI.SEARCH_BUTTON);
        this.assertElementExists(AdminConsoleUI.REPORTSUITE_TAB);
        
        this.clear(ReportSuiteChangeUI.LOGIN_INPUT);
        this.type(ReportSuiteChangeUI.LOGIN_INPUT, TestEnvironment.current.getUsername());
        this.click(ReportSuiteChangeUI.SEARCH_BUTTON);
        this.assertElementExists(AdminConsoleUI.REPORTSUITE_TAB);
    }
    
    public void sortByCompany() {
        this.click(ReportSuiteChangeUI.SORTBYCOMPANY_LINK);
        this.assertElementExists(AdminConsoleUI.REPORTSUITE_TAB);
    }
    
    public void sortByLogin() {
        this.click(ReportSuiteChangeUI.SORTBYLOGIN_LINK);
        this.assertElementExists(AdminConsoleUI.REPORTSUITE_TAB);
    }
}

