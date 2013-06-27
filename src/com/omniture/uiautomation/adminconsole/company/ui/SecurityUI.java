package com.omniture.uiautomation.adminconsole.company.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class SecurityUI extends AdminConsoleUI {
    //Strong Passwords
    public static By ENABLESTRONGPWD_CHECKBOX = By.name("strong_passwords");
    public static By ALREADYSTRONGPWD_CHECKBOX = By.xpath("//input[@name='strong_passwords' and @checked='']");

	//Password Expiration
    public static By EDITPWDEXPIREINTERVAL_LINK = By.xpath("//a[.='Edit Password Expiration Intervals']");
    public static By INTERVAL_INPUT = By.name("expiration_interval");
    public static By SAVE_BUTTON = By.name("expiration_save");
    public static By PWDEXPIRATION_CHECKBOX = By.name("password_expiration");
    public static By BACK_BUTTON = By.name("return_to_security");

	//Enforce Email Domain Restrictions
    public static By EMAILRESTRICTIONS_CHECKBOX = By.name("email_restrictions");
    public static By ADDEMAIL_INPUT = By.name("add_email");
    public static By ADDDESC_INPUT = By.name("add_desc");
    public static By SAVEEMAIL_BUTTON = By.xpath("//input[@name='save' and @value='Save']");
    public static By ADDSBMT_BUTTON = By.name("add_sbmt");
    public static By DELETEENTRY_BUTTON = By.xpath("//input[@value='adobe.com']/../../td[3]/input");

	//Password Recovery Notification
    public static By PASSWORDRECOVERY_CHECKBOX = By.name("password_recovery");
    public static By EMAILNOTIFICATION_LINK = By.xpath("//a[.='Edit the Email notification list']");
    public static By AVAILGROUPS_SELECT = By.id("avail_groups");
    public static By SELECTEDGROUPS_SELECT = By.id("selected_groups");
    public static By ADD_BUTTON = By.xpath("//input[@type='button' and @value='Add >']");
    public static By SAVEEMAILNOTIFICATION_BUTTON = By.name("save_changes");
    public static By REMOVE_BUTTON = By.xpath("//input[@type='button' and @value='< Remove']");
}
