/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * ReportSuiteChangeTest
 *
 * $Id: ReportSuiteChangeTest.java, v 1.0 Aug 28, 2012 9:59:16 AM$
 *
 * Created on Aug 28, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.test.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.logs.Logs;

public class ReportSuiteChangeTest extends Logs {
    
    @Test //TC_1297131
    public void testSearch() {
        reportSuiteChangePage.navigateToReportSuiteChangePage();
        reportSuiteChangePage.searchInReportSuiteChangePage();
    }
    
    @Test //TC_1267870
    public void testSort() {
        reportSuiteChangePage.sortByCompany();
        reportSuiteChangePage.sortByLogin();
    }
}

