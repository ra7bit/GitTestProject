/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * CodeManagerPage
 *
 * $Id: CodeManagerPage.java, v 1.0 Aug 7, 2012 5:29:43 PM$
 *
 * Created on Aug 7, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.codemanager.pages;

import com.omniture.uiautomation.adminconsole.codemanager.ui.CodeManagerUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.util.Functions;
//111111111111111111
public class CodeManagerPage extends OmniturePage {

    private String jsCodeName = "JSCode_Auto_" + Functions.getTimeMillisString();

    public void navigateToCodeManagerPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=CodeManager.Index"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }

    public void generateJavascriptCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "javascript");
        this.selectByIndex(CodeManagerUI.JS_RSID_SELECT, 1);
        this.selectByValue(CodeManagerUI.JS_CHAR_SELECT, "ISO-8859-1");
        this.selectByValue(CodeManagerUI.JS_CURRENCY_SELECT, "USD");
        this.selectByValue(CodeManagerUI.JS_COOKIE_DOMAIN_SELECT, "3");
        this.click(CodeManagerUI.JS_SECURE_CHECKBOX);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("Page Code");
    }

    public void generateMobileCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "wap");
        this.selectByIndex(CodeManagerUI.WAP_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("Wireless (WAP) Code");
    }

    public void generateAndroidCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "android");
        this.selectByIndex(CodeManagerUI.ANDROID_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("Android Example");
    }

    public void generateIOSCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "iphone");
        this.selectByIndex(CodeManagerUI.IOS_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("iPhone Config Text");
    }

    public void generateJavaCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "java");
        this.selectByIndex(CodeManagerUI.JAVA_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("Java Example");
    }

    public void generatePHPCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "php");
        this.selectByIndex(CodeManagerUI.PHP_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("PHP Config Text");
    }

    public void generateFlashCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "actionscript");
        this.selectByIndex(CodeManagerUI.FLASH_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("ActionScript Example");
    }

    public void generateBlackberryCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "blackberry");
        this.selectByIndex(CodeManagerUI.BLACKBERRY_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("BlackBerry Example");
    }

    public void generateSymbianCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "symbian");
        this.selectByIndex(CodeManagerUI.SYMBIAN_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);

        assertExpectedCodeBoxShowProperly("Symbian Config Text");
    }

    public void generateFaceBookCode() {
        navigateToCodeManagerPage();
        this.selectByValue(CodeManagerUI.CODETYPE_SELECT, "facebook_js");
        this.selectByIndex(CodeManagerUI.FACEBOOK_RSID_SELECT, 1);
        this.selectByIndex(CodeManagerUI.FACEBOOK_RSID_SELECT, 1);
        this.click(CodeManagerUI.GENERATECODE_BUTTON);
        this.click(CodeManagerUI.CONFIRM_OK_BUTTON);
        //TODO: There is confirm page first time blocking below.
        //AssertExpectedCodeBoxShowProperly("Page Code");
    }

    private void assertExpectedCodeBoxShowProperly(final String codeBoxName) {
        this.assertElementExists(CodeManagerUI.getCodeBoxByName(codeBoxName));
    }

    public void assertTrackingCodeSavedCorrectly() {
        this.assertElementExists(CodeManagerUI.getLinkByText(jsCodeName));
    }

    public void assertRemoveTrackingCodeCorrectly() {
        this.waitUntilElementClickable(CodeManagerUI.GENERATECODE_BUTTON);
        this.assertElementNotExists(CodeManagerUI.getLinkByText(jsCodeName));
    }

    public void saveTrackingCode() {
        this.type(CodeManagerUI.ARCHIVENAME_INPUT, jsCodeName);
        this.type(CodeManagerUI.ARCHIVEDESCRIPTION_INPUT, "JSCode Desc_Auto");
        this.click(CodeManagerUI.SAVETRACKINGCODE_BUTTON);
    }

    public void sendMail() {
        this.click(CodeManagerUI.getEmailLink(jsCodeName));
        this.click(CodeManagerUI.OK_BUTTON);
        this.click(CodeManagerUI.EMAIL_BUTTON);
    }

    public void removeTrackingCode() {
        this.click(CodeManagerUI.getDeleteLink(jsCodeName));
        this.getLocator().alert().accept();
    }
}

