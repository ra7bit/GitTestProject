package com.omniture.uiautomation.adminconsole.company.pages;

import com.omniture.uiautomation.adminconsole.company.ui.CoBrandingUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

/**
 * @author ligyu
 */

public class CoBrandingPage extends OmniturePage {

    public void navigateToCoBrandingPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Company.CoBrand"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		this.waitUntilPageLoad();
	}

	public void enableCoBranding() {
		if (!this.checkLanguage("en_US")) {
			this.switchLanguage("en_US");
		}

		if (!this.findElement(CoBrandingUI.ENABLE_COBRANDING_CHECKBOX)
				.isSelected()) {
			this.click(CoBrandingUI.ENABLE_COBRANDING_CHECKBOX);
		}

		this.click(CoBrandingUI.EDIT_LINK);
		this.click(CoBrandingUI.UPLOAD_BUTTON);
		this.click(CoBrandingUI.SAVE_BUTTON);
	}
}
