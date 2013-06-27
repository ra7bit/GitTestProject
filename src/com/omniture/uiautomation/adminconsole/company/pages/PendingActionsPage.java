package com.omniture.uiautomation.adminconsole.company.pages;

import com.omniture.uiautomation.adminconsole.company.ui.PendingActionsUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

/**
 * @author ligyu
 */

public class PendingActionsPage extends OmniturePage {

    public void navigateToPendingActionsPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Company.GetQueueUI"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());	
        this.waitUntilPageLoad();
    }

    public void removePendingAction() {
        this.click(PendingActionsUI.DELETE_IMG);
        this.getLocator().alert().accept();
    }
}
