/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * ReportSuitesPage
 * 
 * $Id: ReportSuitesPage.java, v 1.0 Aug 10, 2012 10:24:34 AM$
 * 
 * Created on Aug 10, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.pages;

import com.omniture.uiautomation.adminconsole.usermanagement.ui.ReportSuitesUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.SiteCatalystPage;

public class ReportSuitesPage extends SiteCatalystPage {

    public void navigateToReportSuitePage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Permissions.GetAccountsUI"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }

    public void searchByReportSuiteName() {
        this.selectByValue(ReportSuitesUI.REPORTSUITE_DROPDOWNLIST, "name");
        this.type(ReportSuitesUI.SEARCH_INPUT, getDefaultReportSuiteName());
        this.click(ReportSuitesUI.GO_BUTTON);
        this.assertElementExists(ReportSuitesUI.getReportSuiteByName(getDefaultReportSuiteName()));
    }

    public void searchByReportSuiteID() {
        this.selectByValue(ReportSuitesUI.REPORTSUITE_DROPDOWNLIST, "id");
        this.type(ReportSuitesUI.SEARCH_INPUT, getDefaultReportSuiteID());
        this.click(ReportSuitesUI.GO_BUTTON);
        this.assertElementExists(ReportSuitesUI.getReportSuiteByName(getDefaultReportSuiteName()));
    }

    public void sortByReportSuiteName() {
        this.click(ReportSuitesUI.SORTBYNAME_LINK);
        this.assertElementExists(ReportSuitesUI.getReportSuiteByName(getDefaultReportSuiteName()));
    }

    public void sortByReportSuiteID() {
        this.click(ReportSuitesUI.SORTBYID_LINK);
        this.assertElementExists(ReportSuitesUI.getReportSuiteByName(getDefaultReportSuiteName()));
    }

    public void sortByGroup() {
        this.click(ReportSuitesUI.SORTBYGROUP_LINK);
        this.assertElementExists(ReportSuitesUI.getReportSuiteByName(getDefaultReportSuiteName()));
    }

    public void addGroup() {
        this.click(ReportSuitesUI.FIRSTREPORTSUITE);
        this.selectByIndex(ReportSuitesUI.AVAILABLEGROUP_DROPDOWNLIST, 1);
        this.click(ReportSuitesUI.ADD_BUTTON);
        this.click(ReportSuitesUI.SAVE_BUTTON);
        this.assertElementsTextContain(ReportSuitesUI.FLASHMESSAGE_TEXT, "site have been saved");
    }

    public void removeGroup() {
        this.click(ReportSuitesUI.FIRSTREPORTSUITE);
        this.selectByIndex(ReportSuitesUI.SELECTEDGROUP_DROPDOWNLIST, 1);
        this.click(ReportSuitesUI.REMOVE_BUTTON);
        this.click(ReportSuitesUI.SAVE_BUTTON);
        this.assertElementsTextContain(ReportSuitesUI.FLASHMESSAGE_TEXT, "site have been saved");
    }
}

