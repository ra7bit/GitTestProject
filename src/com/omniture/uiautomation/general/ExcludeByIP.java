package com.omniture.uiautomation.general;
import com.omniture.uiautomation.general.pages.ExcludeByIPPage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author qyzhu
 */

public class ExcludeByIP  extends OmnitureTest {

	protected ExcludeByIPPage page;

	
	public ExcludeByIP() {
		this.page = new ExcludeByIPPage();
		page.setWebDriver(this.webDriver);

	}
}
