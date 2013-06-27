/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * ReportSuitesTest
 * 
 * $Id: ReportSuitesTest.java, v 1.0 Aug 10, 2012 10:26:52 AM$
 * 
 * Created on Aug 10, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.tests.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.usermanagement.UserManagementTest;

public class ReportSuitesTest extends UserManagementTest {

    @Test //TC_1268310
    public void testSearch() {
        reportSuitesPage.navigateToReportSuitePage();
        reportSuitesPage.searchByReportSuiteName();
        reportSuitesPage.searchByReportSuiteID();
    }

    @Test //TC_1268320
    public void testSort() {
        reportSuitesPage.navigateToReportSuitePage();
        reportSuitesPage.sortByReportSuiteID();
        reportSuitesPage.sortByGroup();
        reportSuitesPage.sortByReportSuiteName();
    }

    @Test //TC_1268314
    public void testEditRSPermissions_bug99985() {
        reportSuitesPage.navigateToReportSuitePage();
        reportSuitesPage.addGroup();
        reportSuitesPage.removeGroup();
    }

}

