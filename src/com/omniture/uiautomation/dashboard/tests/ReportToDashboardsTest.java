package com.omniture.uiautomation.dashboard.tests;

import org.junit.Test;



import com.omniture.uiautomation.adminconsole.logs.Logs;
import com.omniture.uiautomation.dashboard.ReportToDashboardManager;



/**
 * 
 * @author sbli
 * 
 *  
 */
public class ReportToDashboardsTest extends ReportToDashboardManager {


	@Test
	public void testCreatDashboardFromReport()
	{		
		rtdp.createDashboardFromReport();
	}
	
	@Test
	public void testAddPathsReport()
	{
		rtdp.reportToDashboard();
	}
	

	
	
	

	
}
