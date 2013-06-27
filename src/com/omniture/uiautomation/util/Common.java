package com.omniture.uiautomation.util;

import com.omniture.uiautomation.framework.SeleniumPage;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.ui.OmnitureUI;

/**
 * @author ligyu
 */

public class Common extends SeleniumPage {

    public void login() {
		login("scauto","111111");
	}

	public void login(String login, String password) {

		this.getWebDriver().get(TestEnvironment.current.getBaseUrl());
		this.clear(OmnitureUI.COMPANY_INPUT);
		this.type(OmnitureUI.COMPANY_INPUT, TestEnvironment.current.getCompany());

		this.clear(OmnitureUI.USERNAME_INPUT);
		this.type(OmnitureUI.USERNAME_INPUT, login);

		this.clear(OmnitureUI.PASSWORD_INPUT);
		this.type(OmnitureUI.PASSWORD_INPUT, password);

		this.selectByValue(OmnitureUI.VERSION_OPTIONS, "15");

		this.click(OmnitureUI.LOGIN_BUTTON);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
	}
}
