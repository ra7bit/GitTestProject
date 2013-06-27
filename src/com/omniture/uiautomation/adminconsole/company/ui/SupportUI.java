package com.omniture.uiautomation.adminconsole.company.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class SupportUI extends AdminConsoleUI {
    public static By ENABLECONTACTINFORMATION_CHECKBOX = By.id("show_headquarters_info");
    public static By CONTACTNAME_INPUT = By.id("contact_name");
    public static By CONTACTPHONE_INPUT = By.id("contact_phone");
    public static By CONTACTEMAIL_INPUT = By.id("contact_email");

    public static By ENABLEMAINHELP_CHECKBOX = By.name("display_cust_help");
    public static By HELPTITLE_INPUT = By.name("cust_help_title");
    public static By HELPTEXT_MEMO= By.xpath("//textarea[@name='cust_help_text']");
    public static By SAVE_BUTTON= By.xpath("//input[@type='submit']");

    public static By CONTACTNAME_FOOTER_TEXT = By.xpath("//div[@id='contact_support_container']/ul/li[1]");
    public static By CONTACEMAIL_FOOTER_TEXT = By.xpath("//div[@id='contact_support_container']/ul/li[2]/a");
    public static By CONTACTPHONE_FOOTER_TEXT = By.xpath("//div[@id='contact_support_container']/ul/li[3]");
}
