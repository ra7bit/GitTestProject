package com.omniture.uiautomation.adminconsole.company.pages;

import com.omniture.uiautomation.adminconsole.company.ui.AnnouncementsUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.SiteCatalystPage;

/**
 * @author ligyu
 */

public class AnnouncementsHomePage extends SiteCatalystPage {

    private String announcementBody = "SCAuto Announcement body";
    public void navigateToAnnouncementsHome() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Company.GetAnnouncements"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
    }

    public void navigateToAddPage() {
        navigateToAnnouncementsHome();
        this.click(AnnouncementsUI.ADDANNOUNCEMENTS_LINK);
        this.waitUntilPageLoad();
    }

    public void addNewAnnouncement(final String annoucementName) {
        navigateToAddPage();
        this.switchTab();
        this.type(AnnouncementsUI.ANNOUNCEMENTNAME_INPUT, annoucementName);
        this.type(AnnouncementsUI.ANNOUNCEMENTCONTENT_INPUT, announcementBody);
        this.click(AnnouncementsUI.SAVE_BUTTON);
        assertHttpResponse(this.getDriver());
        this.switchTab();
    }

    public void assertShowInAnnouncementHome(final String annoucementName) {
        navigateToAnnouncementsHome();
        AnnouncementsUI.getAnnouncementByName(annoucementName);
    }

    public void editAnnouncement(final String annoucementName) {
        navigateToAnnouncementsHome();
        this.click(AnnouncementsUI.getEditLinkByName(annoucementName));
        this.sleep(2500);
        this.switchTab();
        this.clear(AnnouncementsUI.ANNOUNCEMENTNAME_INPUT);
        this.type(AnnouncementsUI.ANNOUNCEMENTNAME_INPUT, annoucementName);
        this.assertElementsTextContain(AnnouncementsUI.ANNOUNCEMENTCONTENT_INPUT, announcementBody);
        this.type(AnnouncementsUI.ANNOUNCEMENTCONTENT_INPUT, "_Update");
        this.click(AnnouncementsUI.SAVE_BUTTON);
        assertHttpResponse(this.getDriver());
        this.sleep(2000);
        this.switchTab();
    }

    public void deleteAnnouncement(final String annoucementName) {
        navigateToAnnouncementsHome();
        this.click(AnnouncementsUI.getDeleteLinkByName(annoucementName));
        this.sleep(2000);
        this.getLocator().alert().accept();
    }
}
