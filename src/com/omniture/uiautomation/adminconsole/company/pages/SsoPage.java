package com.omniture.uiautomation.adminconsole.company.pages;

import java.io.File;
import java.io.FileInputStream;

import com.omniture.uiautomation.adminconsole.company.ui.SsoUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.login.ui.LoginUI;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.util.Common;

/**
 * @author ligyu
 */

public class SsoPage extends OmniturePage {

    public void navigateToSsoPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Company.GetSaml"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		this.waitUntilPageLoad();
	}

	public void enableSso() {
		if (!this.checkLanguage("en_US")) {
			this.switchLanguage("en_US");
		}
		if (!this.findElement(SsoUI.ENABLESSO_CHECKBOX).isSelected()) {
			this.click(SsoUI.ENABLESSO_CHECKBOX);
		}
		String idpMetadta = readMetaData();
		this.clear(SsoUI.IDP_METADATA_MEMO);
		this.type(SsoUI.IDP_METADATA_MEMO, idpMetadta);
		this.click(SsoUI.SAVE_BUTTON);
	}

	public void assertSuccessMessage() {
		this.assertElementTextContain(SsoUI.FLASHMESSAGE_TEXT,
				"Single Sign-On Service information saved");
	}

	public void assertNormalUserFailToLoginWithPwd() {
		Common common = new Common();
		common.setWebDriver(this.webDriver);
		common.login();
		this.assertElementTextContain(
				LoginUI.LOGIN_MESSAGE,
				"The Single Sign-on system of the owning company is required to authenticate this account.");
	}

	private static String readMetaData() {
		File file = new File("config/IdPMetadata.txt");
		int ch;
		StringBuffer strContent = new StringBuffer("");
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			while ((ch = fin.read()) != -1)
				strContent.append((char) ch);
			fin.close();
		} catch (Exception e) {

		}
		return strContent.toString();
	}

}
