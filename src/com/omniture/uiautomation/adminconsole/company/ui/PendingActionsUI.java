package com.omniture.uiautomation.adminconsole.company.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class PendingActionsUI extends AdminConsoleUI {
    public static By DELETE_IMG = By.xpath("//td[contains(text(), 'Saving Traffic Spike: 1,234,567')]/../td[6]/img");
}
