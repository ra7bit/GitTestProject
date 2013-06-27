package com.omniture.uiautomation.adminconsole.reportsuite.pages;

import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.adminconsole.reportsuite.ui.*;

/*
 * author: Weizhi Yang (wyang@adobe.com)
 * 
 * */
public class ReportSuiteManagerPage extends OmniturePage {

	public void navigateToReportSuiteManagerPage() 
	{
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Index&ssSession="
                + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }
	
	public void selectReportSuiteByRSID(String rsid)
	{
		WebElement element = this.webDriver.findElement(ReportSuiteManagerUI.getReportSuiteByRSID(rsid));
		element.click();
		this.sleep(1000);
	}
}
