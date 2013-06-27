/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * UsageAccessTest
 *
 * $Id: UsageAccessTest.java, v 1.0 Aug 28, 2012 9:43:34 AM$
 *
 * Created on Aug 28, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.test.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.logs.Logs;

public class UsageAccessTest extends Logs {
	
    @Test //TC_1297130
    public void testSearch() {
        usageAccessLogPage.navigateToUsageAccessLogPage();
        usageAccessLogPage.searchInUsageAccessLogPage();
    }
    
    @Test //TC_1297132
    public void testSort() {
        usageAccessLogPage.sortByEventType();
        usageAccessLogPage.sortByLogin();
    }
}

