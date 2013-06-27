package com.omniture.uiautomation.adminconsole.company.ui;

import org.openqa.selenium.By;

/**
 * @author ligyu
 */

public class AnnouncementsUI {

    public static By ADDANNOUNCEMENTS_LINK = By.xpath("//a[.='Add New Announcement']");
    public static By ANNOUNCEMENTNAME_INPUT = By.name("hpa[name]");
    public static By ANNOUNCEMENTCONTENT_INPUT = By.name("hpa[custom_text]");
    public static By SAVE_BUTTON = By.name("save");
    public static By getEditLinkByName(String annoucementName) {
	    //return By.xpath("//td[contains(text(), annoucementName)]/../td[3]/a[.='Edit']");
	    return By.xpath("//a[.='Edit'][last()]");
	}
    public static By getDeleteLinkByName(String annoucementName) {
        //return By.xpath("//td[contains(text(), annoucementName)]/../td[3]/a[2]");
        return By.xpath("//a[.='Delete'][last()]");
    }
    public static By getAnnouncementByName(String annoucementName) {
        return By.xpath("//td[contains(text(), annoucementName)]");
    }
}
