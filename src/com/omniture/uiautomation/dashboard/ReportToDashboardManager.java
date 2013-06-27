package com.omniture.uiautomation.dashboard;

import com.omniture.uiautomation.dashboard.pages.ReportToDashboardPage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * 
 * @author sbli
 *
 */
public class ReportToDashboardManager extends OmnitureTest {
	
	protected ReportToDashboardPage rtdp;
	
	public ReportToDashboardManager()
	{
		this.rtdp = new ReportToDashboardPage();
		this.rtdp.setWebDriver(this.webDriver);
	}
	
}
