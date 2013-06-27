package com.omniture.uiautomation.adminconsole.company.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 *
 */

public class CoBrandingUI  extends AdminConsoleUI {
    public static By ENABLE_COBRANDING_CHECKBOX = By.id("checkbox_enable_cobranding");
    public static By EDIT_LINK = By.xpath("//a[.='Edit']");
    public static By UPLOAD_BUTTON = By.name("cobranding_image");
    public static By SAVE_BUTTON = By.name("save_cobranding");
}
