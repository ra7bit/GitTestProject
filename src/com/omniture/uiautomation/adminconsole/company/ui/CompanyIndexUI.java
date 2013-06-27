package com.omniture.uiautomation.adminconsole.company.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class CompanyIndexUI extends AdminConsoleUI {
    public static By SECURITYMANAGER_LINK = By.xpath("//a[.='Security Manager']");
    public static By SUPPORTINFORMATION_LINK = By.xpath("//a[.='Support Information']");
    public static By ANNOUNCEMENTS_LINK = By.xpath("//a[.='Company Announcements']");
}
