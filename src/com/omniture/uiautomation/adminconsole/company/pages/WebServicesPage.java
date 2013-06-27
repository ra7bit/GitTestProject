package com.omniture.uiautomation.adminconsole.company.pages;

import com.omniture.uiautomation.adminconsole.company.ui.WebServicesUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

/**
 * @author ligyu
 */

public class WebServicesPage extends OmniturePage {

    public void navigateToWebServicesPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Company.WebServices"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }

    public void enableFilterChar() {
        if (!this.findElement(WebServicesUI.FILTER_CHARS_CHECKBOX).isSelected()) {
            this.click(WebServicesUI.FILTER_CHARS_CHECKBOX);
        }
    }

    public void enableFilterUtf8() {
        if (!this.findElement(WebServicesUI.FILTER_UTF8_CHECKBOX).isSelected()) {
            this.click(WebServicesUI.FILTER_UTF8_CHECKBOX);
        }
    }
}
