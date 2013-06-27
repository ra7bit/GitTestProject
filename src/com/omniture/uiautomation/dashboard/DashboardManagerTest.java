package com.omniture.uiautomation.dashboard;

import com.omniture.uiautomation.dashboard.pages.DashboardManagerPage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * 
 * @author sbli
 *
 */
public class DashboardManagerTest extends OmnitureTest {
	
	protected DashboardManagerPage dashboardManagement;
	
	public DashboardManagerTest()
	{
		this.dashboardManagement = new DashboardManagerPage();
		this.dashboardManagement.setWebDriver(this.webDriver);
	}
	

}
