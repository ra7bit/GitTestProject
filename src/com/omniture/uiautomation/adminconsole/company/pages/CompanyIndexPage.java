package com.omniture.uiautomation.adminconsole.company.pages;

import com.omniture.uiautomation.adminconsole.company.ui.CompanyIndexUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

/**
 * @author ligyu
 */

public class CompanyIndexPage extends OmniturePage {

    public void navigateToCompanyIndex() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Company.Index"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());		
		this.waitUntilPageLoad();
	}

	public void assertCompanyIndexComponents() {
		this.assertElementExists(CompanyIndexUI.SECURITYMANAGER_LINK);
		this.assertElementExists(CompanyIndexUI.SUPPORTINFORMATION_LINK);
		this.assertElementExists(CompanyIndexUI.ANNOUNCEMENTS_LINK);
	}
}
