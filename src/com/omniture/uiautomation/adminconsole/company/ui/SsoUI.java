package com.omniture.uiautomation.adminconsole.company.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class SsoUI extends AdminConsoleUI {
    public static By ENABLESSO_CHECKBOX = By.id("enable_sso");
    public static By IDP_METADATA_MEMO= By.xpath("//textarea[@name='idp_metadata_string']");
    public static By SAVE_BUTTON= By.id("submit_button");
}
