package com.omniture.uiautomation.adminconsole.usermanagement.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class GroupsUI extends AdminConsoleUI {

    // Group list page
    public static By EDITGROUP_BUTTON = By.xpath("//input[@value='Edit Groups']");
    public static By ADDNEWGROUP_LINK = By.xpath("//a[.='Add New User Group']");
    public static By SEARCH_SECTOR = By.name("search_field");
    public static By SEARCH_INPUT= By.name("search_val");
    public static By GO_BUTTON= By.name("search_submitted");
    public static By GetDeleteLinkByGroupName(String groupName) {
        return By.xpath("//a[contains(text(), '" + groupName + "')]/../../td/a[contains(text(), 'Delete')]");
    }
    public static By GetEditLinkByGroupName(String groupName) {
        return By.xpath("//a[contains(text(), '" + groupName + "')]/../../td/a[contains(text(), 'Edit')]");
    }

    // Add or Edit page
    public static By GROUPNAME_INPUT = By.name("group_name");
    public static By GROUPDESCRIPTION_INPUT = By.name("group_description");
    public static By SAVE_BUTTON = By.name("save_changes");
    public static By AVAILABLEREPORTSUITES = By.id("avail_rs");
    public static By ADD_BUTTON = By.xpath("//input[@value='Add >']");
    public static By CONVERSIONREPORTACCESS_RADIO = By.id("fullaccess_conversion");
    public static By TRAFFICREPORTACCESS_RADIO = By.id("fullaccess_traffic");
    public static By AVAILABLEUSERS_SELECTOR = By.id("avail_users");
    public static By ADDUSER_BUTTON = By.xpath("//input[@type='button' and @value='Add >']");
    public static By REMOVE_BUTTON = By.xpath("//input[@type='button' and @value='< Remove']");
    public static By SEARCHAVAILUSERS_INPUT = By.id("search_avail_users");
    public static By SEARCH_BUTTON = By.name("au_search_btn");
    public static By SELECTEDUSERS_SELECTOR = By.id("selected_users");
    public static By SEARCHSELECTEDUSERS_INPUT = By.id("search_selected_users");
    public static By SELECTEDSEARCH_BUTTON = By.name("su_search_btn");

}