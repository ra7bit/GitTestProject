package com.omniture.uiautomation.adminconsole.company.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

public class WebServicesUI extends AdminConsoleUI {
    public static By FILTER_CHARS_CHECKBOX = By.id("toggle_filter_illegal_chars");
    public static By FILTER_UTF8_CHECKBOX = By.id("toggle_filter_invalid_utf8");
}
