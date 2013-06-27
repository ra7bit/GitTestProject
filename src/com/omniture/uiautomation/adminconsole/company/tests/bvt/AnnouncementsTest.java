package com.omniture.uiautomation.adminconsole.company.tests.bvt;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.adminconsole.company.pages.AnnouncementsHomePage;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.tests.OmnitureTest;
import com.omniture.uiautomation.util.Functions;

/**
 * @author ligyu
 */

public class AnnouncementsTest extends OmnitureTest{

    private static String annoucementName = "";
    private AnnouncementsHomePage announcementsHome = new AnnouncementsHomePage();
    private OmniturePage omniturePage = new OmniturePage();

    public AnnouncementsTest (String name)
    {
        super(name);
        annoucementName = "ScAuto_" + Functions.getTimeMillisString();
        this.announcementsHome.setWebDriver(this.webDriver);
        this.omniturePage.setWebDriver(this.webDriver);
    }
  
    //@Test //TC_1297983, Bug 101259
    public void testAddAnnouncement() {
        announcementsHome.addNewAnnouncement(annoucementName);
        announcementsHome.assertShowInAnnouncementHome(annoucementName);
    }

    //@Test //TC_1267900
    public void testEditAnnouncement() {
        announcementsHome.editAnnouncement(annoucementName);
        announcementsHome.assertShowInAnnouncementHome(annoucementName);
    }

    //@Test //TC_1297984
    public void testDeleteAnnouncement() {
        announcementsHome.deleteAnnouncement(annoucementName);
        announcementsHome.assertShowInAnnouncementHome(annoucementName);
    }

    public static Test suite(){
        TestSuite suite = new TestSuite("Announcement function test...");
        suite.addTest(new AnnouncementsTest("testAddAnnouncement"));
        suite.addTest(new AnnouncementsTest("testEditAnnouncement"));
        suite.addTest(new AnnouncementsTest("testDeleteAnnouncement"));
        return suite;
    }
}
