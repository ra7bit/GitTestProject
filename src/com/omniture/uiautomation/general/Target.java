package com.omniture.uiautomation.general;

import com.omniture.uiautomation.general.pages.TargetManagerPage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author qyzhu
 */

public class Target extends OmnitureTest {

	public TargetManagerPage targetManagerPage;

	
	public Target() {
		this.targetManagerPage = new TargetManagerPage();
        this.targetManagerPage.setWebDriver(this.webDriver);

	}
}
