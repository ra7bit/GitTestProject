/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * CodeManagerUI
 *
 * $Id: CodeManagerUI.java, v 1.0 Aug 7, 2012 5:32:00 PM$
 *
 * Created on Aug 7, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.codemanager.ui;

import org.openqa.selenium.By;

public class CodeManagerUI {
    public static By CODETYPE_SELECT = By.id("code_type");
    public static By GENERATECODE_BUTTON = By.xpath("//input[@type='button' and @value='Generate Code']");
    public static By CONFIRM_OK_BUTTON = By.id("warning_popup_ok");

    //Javascript
    public static By JS_RSID_SELECT = By.id("js_rsid_list");
    public static By JS_CHAR_SELECT = By.id("js_char_set_list");
    public static By JS_CURRENCY_SELECT = By.id("js_currency_code_list");
    public static By JS_COOKIE_DOMAIN_SELECT = By.id("js_cookie_domain_periods_list");
    public static By JS_SECURE_CHECKBOX = By.id("secure");

    //Mobile
    public static By WAP_RSID_SELECT = By.id("wap_rsid_list");
    //Android
    public static By ANDROID_RSID_SELECT = By.id("android_rsid_list");
    //iSO
    public static By IOS_RSID_SELECT = By.id("iphone_rsid_list");
    //Java
    public static By JAVA_RSID_SELECT = By.id("java_rsid_list");
    //PHP
    public static By PHP_RSID_SELECT = By.id("php_rsid_list");
    //Flash
    public static By FLASH_RSID_SELECT = By.id("actionscript_rsid_list");
    //blackberry
    public static By BLACKBERRY_RSID_SELECT = By.id("blackberry_rsid_list");
    //Symbian
    public static By SYMBIAN_RSID_SELECT = By.id("symbian_rsid_list");
    //Facebook
    public static By FACEBOOK_RSID_SELECT = By.id("facebook_js_rsid_list");

    //code generate page
    public static By getCodeBoxByName(final String codeType) {
        return By.xpath("//div[@id='GeneratedCodeBox']/div/div/ul/li/a/span[contains(text(),'" + codeType + "')]");
    }

    //Save Tracking Code
    public static By ARCHIVENAME_INPUT = By.id("archive_name");
    public static By ARCHIVEDESCRIPTION_INPUT = By.id("archive_description");
    public static By SAVETRACKINGCODE_BUTTON = By.xpath("//input[@type='submit' and @value='Save']");

    //Tracking Code List
    public static By getLinkByText(final String text) {
        return By.xpath("//a[.='" + text + "']");
    }

    public static By getViewLink(final String text) {
        return By.xpath("//a[.='" + text + "']/../../td[4]/a[1]");
    }

    public static By getEmailLink(final String text) {
        return By.xpath("//a[.='" + text + "']/../../td[4]/a[2]");
    }
    public static By getDeleteLink(final String text) {
        return By.xpath("//a[.='" + text + "']/../../td[4]/a[4]");
    }

    public static By OK_BUTTON = By.id("warning_popup_ok");
    public static By EMAIL_BUTTON = By.id("as_save");

}

