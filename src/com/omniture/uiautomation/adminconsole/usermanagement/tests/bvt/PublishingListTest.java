/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * PublishingListTest
 * 
 * $Id: PublishingListTest.java, v 1.0 Aug 13, 2012 5:29:29 PM$
 * 
 * Created on Aug 13, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.tests.bvt;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.adminconsole.usermanagement.pages.PublishingListPage;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.tests.OmnitureTest;

public class PublishingListTest extends OmnitureTest {

    private PublishingListPage publishingListPage;
    private OmniturePage omniturePage;
    public PublishingListTest (String name)
    {
        super(name);
        publishingListPage = new PublishingListPage();
        omniturePage = new OmniturePage();
        this.publishingListPage.setWebDriver(this.webDriver);
        this.omniturePage.setWebDriver(this.webDriver);
    }

    //@Test //TC_1268321, TC_1268323
    public void testAddPublishingList() {
        publishingListPage.addPublishingList();
    }

    //@Test //TC_1268318
    public void testSearchPublishingList() {
        publishingListPage.searchPublishingList();
    }

    //@Test //TC_1268327
    public void testEditPublishingList() {
        publishingListPage.editPublishingList();
    }

    //@Test //TC_1268325
    public void testDuplicatePublishingList() {
        publishingListPage.duplicatePublishingList();
    }

    //@Test //TC_1294869
    public void testDeletePublishingList() {
        publishingListPage.deletePublishingList();
    }

    public static Test suite(){
        TestSuite suite = new TestSuite("Publishing List test...");
        suite.addTest(new PublishingListTest("testAddPublishingList"));
        suite.addTest(new PublishingListTest("testSearchPublishingList"));
        suite.addTest(new PublishingListTest("testEditPublishingList"));
        suite.addTest(new PublishingListTest("testDeletePublishingList"));
        return suite;
    }
}

